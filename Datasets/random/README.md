
The class RandomBipartiteGraph contains the following two static functions for generating random bipartite graphs: 
(*) regularErdosRenyi: Erdős–Rényi random bipartite graph model.
Each possible edge in the bipartite graph has a probability ρ, independent of other edges, to be included in the graph. The probability ρ is also referred to as “density”.
(*) modifiedErdosRenyi: a modified Erdős–Rényi random bipartite graph model.
The model enables variability in the degree of vertices: given a bipartite graph G = (U ∪ V, E), the degree of each vertex i ∈ U is governed by the following two parameters: (i) µ: mean vertex degree, and (ii) CV : coefficient of variation. Note that: CV = σ/µ, where σ is the standard deviation, µ is the mean, and CV is the coefficient of variation. Also note that setting CV=0 is equivalent to using the previous Erdős–Rényi model as µ=ρ. The above degree places edges to every i ∈ U. The end point of each edge on V is selected with uniform probability. For example, if a vertex u ∈ U has been assigned a degree of two, then two vertices of V, v1 ,v2 ∈ V, will be selected, uniformly at random, to serve as edge end points, namely: (u,v1),(u,v2) ∈ E.


If you wish to use the code, please cite the following paper: 
Eran Shaham, Honghai Yu, and Xiao-Li Li. On finding the maximum edge biclique in a bipartite graph: a subspace clustering approach. In SIAM International Conference on Data Mining, 2006, pp. 315–323.

