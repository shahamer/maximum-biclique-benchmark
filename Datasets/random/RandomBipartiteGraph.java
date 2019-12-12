
/**
 * Random bipartite graph generator. 
 */

import java.util.Random;

public class RandomBipartiteGraph {

    private static final boolean ONE = true;
    private static final boolean ZERO = false;

    private final boolean[][] matrix;
    private final int nbU; // number of |U|
    private final int nbV; // number of |V|

    private final Random rand;

    private RandomBipartiteGraph(final int _nbU, final int _nbV) {
        assert _nbU > 0 && _nbV > 0;

        rand = new Random();

        nbU = _nbU;
        nbV = _nbV;

        matrix = new boolean[_nbU][_nbV];
    }

    /**
     * @return an array of indices [0..size]
     */
    private final int[] fill(final int size) {
        final int[] arr = new int[size];
        for (int j = arr.length - 1; j >= 0; j--) {
            arr[j] = j;
        }

        return arr;
    }

    /**
     * shuffle the array
     */
    private void shuffle(final int[] arr) {
        for (int i = arr.length; i > 1; i--) {
            swap(arr, i - 1, rand.nextInt(i));
        }
    }

    /**
     * swap elements in an array
     */
    private final static void swap(final int[] data, final int i, final int j) {
        final int c = data[i];
        data[i] = data[j];
        data[j] = c;
    }

    /**
     * Each vertex on U has a normal distribution probability of degree.
     * The vertices on V are chosen on uniform distribution.
     */
    private boolean[][] modifiedErdosRenyi(final double density, final double CV) {
        assert 0.0 <= density && density <= 1.0;
        assert 0.0 <= CV && CV <= 1.0;

        final int[] indicesV = fill(nbV);

        /*
         * density = |E|/(|U|*|V|)
         *      --> |E| = density*|U|*|V|
         * avgDeg(u) = |E|/|U| 
         *      -->  = (density*|U|*|V|)/(|U|) = density*|V|
         */
        final double avgDegU = density * nbV;

        final double mean = avgDegU;
        final double variance = mean * CV;

        for (int u = 0; u < nbU; u++) {

            int degU = (int) Math
                    .round(mean + (rand.nextGaussian() * variance));
            if (degU < 0) {
                // ded<0 is okay ==> adj(u)=0
                degU = 0;
            } else if (degU > nbV) {
                degU = nbV;
            } // else
              // great: 0<=deg<=nbV -- take it as it is

            // randomly select vertices of V to serve as edge-ends
            shuffle(indicesV);
            for (int j = 0; j < degU; j++) {
                final int v = indicesV[j];

                assert matrix[u][v] == ZERO;
                matrix[u][v] = ONE;
            }
        }

        return matrix;
    }

    /**
     * Each edge has a uniform distribution probability to be in the graph 
     */
    private boolean[][] regularErdosRenyi(final double density) {
        assert 0.0 <= density && density <= 1.0;

        final int nbMaxE = nbU * nbV;

        final int nbWantedEdges = (int) Math.round(nbMaxE * density);
        assert nbWantedEdges <= nbMaxE;

        final int[] indices = fill(nbMaxE);
        shuffle(indices); // shuffle edges indices

        for (int j = 0, nbE = 0; j < nbMaxE && nbE < nbWantedEdges; j++) {
            final int idx = indices[j];

            final int u = idx / nbV;
            final int v = idx % nbV;

            if (matrix[u][v] == ZERO) {
                nbE++;
                matrix[u][v] = ONE;
            }
        }

        return matrix;
    }

    /**
     * Each edge has a uniform distribution probability to be in the graph 
     */
    public final static boolean[][] regularErdosRenyi(final int nbU,
            final int nbV, final double density) {
        final RandomBipartiteGraph graph = new RandomBipartiteGraph(nbU, nbV);
        return graph.regularErdosRenyi(density);
    }

    /**
     * Each vertex on U has a normal distribution probability of degree.
     * The vertices on V are chosen on uniform distribution.
     */
    public final static boolean[][] modifiedErdosRenyi(final int nbU,
            final int nbV, final double density, final double CV) {
        final RandomBipartiteGraph graph = new RandomBipartiteGraph(nbU, nbV);
        return graph.modifiedErdosRenyi(density, CV);
    }

}
