# maximum biclique benchmark


## Introduction

Biclique detection is a well-known problem in graph theory and data mining, with numerous real-world applications across different domain. Take for example text networks depicting the relationship between words and documents. Bicliques reveal documents that share common words, which can later be utilized for automated topic classification and tagging.

Given a bipartite graph and its corresponding partition into two disjoint sets of vertices, a biclique is a complete bipartite subgraph such that every vertex of the first partition is connected to every vertex of the second partition. Mathematically, the notion of biclique is defined as follows. 
Let G = (U ∪ V, E) be a bipartite graph, where U and V are two disjoint sets of vertices, and E is an edge set such that ∀(i,j) ∈ E, i ∈ U, j ∈ V . A biclique within G is a couple (set pair) (I,J) such that I ⊆ U, J ⊆ V and ∀i ∈ I, j ∈ J, (i,j) ∈ E.

The computational complexity of finding the maximum biclique depends on the exact objective function used. In this benchmark, we focus on the maximum edge biclique, i.e., |I| × |J|. Finding a maximum edge biclique was proved to be NP-complete [[3]](https://github.com/shahamer/maximum-biclique-benchmark#references).




## Table of Contents

* [Real World Datasets](#real-world-datasets)
* [Synthetic Datasets](#synthetic-datasets)
* [Related Work](#related-work)
* [Acknowledgement & Citation](#acknowledgement--citation)
* [References](#references)
 
## Real World Datasets

| dataset info    |    nodes      | edges         |  density   | **maximum biclique**   | 
|:-----------------|-------:|-----:|------:|------:|
| | | | | | 
| [Snap database](Datasets/snap.stanford.edu/README.md) | | | | |
| [com-LiveJournal](Datasets/snap.stanford.edu/com-LiveJournal) | 2,325,297 x 3,996,402 | 34,681,189 | 0.00037% | 33,984 = 192 x 177 |
| [com-Youtube](Datasets/snap.stanford.edu/com-Youtube)  | 374,785 x 1,134,140 | 2,987,624 | 0.00070% | 8,008 = 2 x 4,004 | 
| [wiki-topcats](Datasets/snap.stanford.edu/wiki-topcats) | 1,791,489 x 1,791,489 | 28,511,807 | 0.00089% | 126,824 = 31,706 x 4 | 
| [com-Amazon](Datasets/snap.stanford.edu/com-Amazon)  | 265,933 x 264,147 | 925,872 | 0.0013% | 188 = 94 x 2 | 
| [com-Orkut](Datasets/snap.stanford.edu/com-Orkut) | 2,723,360 x 3,072,440 | 117,185,083 | 0.0014% | 16,726 = 2 x 8,363 | 
| [com-DBLP](Datasets/snap.stanford.edu/com-DBLP)   | 189,114 x 304,374 | 1,049,866 | 0.0018% | 3,249 = 57 x 57 |
| [email-Eu-core](Datasets/snap.stanford.edu/email-Eu-core) | 868 x 991 | 25,571| 2.97% | 390 = 5 x 78 |
| | | | | | 
| [Konect database](Datasets/konect.uni-koblenz.de/README.md) | | | | | 
| [movieLens 10M](Datasets/konect.uni-koblenz.de/movielens-10m_rating) | 69,878 x 10,677 | 10,000,054 | 1.34% | 67,736 = 8,467 x 8 |
| [movieLens 1M](Datasets/konect.uni-koblenz.de/movielens-1m) | 6,040 x 3,706 | 1,000,209 | 4.47% | 7,002 = 778 x 9 | 
| [movieLens 100K](Datasets/konect.uni-koblenz.de/movielens-100k_rating) | 943 x 1,682 | 100,000 | 6.30% | 1,267 = 181 x 7 |




## [Synthetic Datasets](Datasets/random/README.md)

| [dataset info](Datasets/random/README.md)    |       nodes      | edges         |  density   |  **maximum biclique**  | 
|:-----------------|---------------:|--------------:|--------------:|--------------:|
| [random.m_10000_n_1000_p_0.02](Datasets/random#randomm_10000_n_1000_p_002)| 10,000 x 1,000 | 200,000   |  2% | 32 = 16 x 2 |
| [random.m_10000_n_5000_p_0.02](Datasets/random#randomm_10000_n_5000_p_002) | 10,000 x 5,000 | 1,000,000 | 2% | 36 = 18 x 2 | 
| [random.m_10000_n_10000_p_0.02](Datasets/random#randomm_10000_n_10000_p_002) | 10,000 x 10,000 | 2,000,000 | 2% | 38 = 2 x 19 | 
| [random.m_10000_n_1000_p_0.045_cv_0.3](Datasets/random#randomm_10000_n_1000_p_0045_cv_03) | 9,992 x 1,000 | 450,042 | 4.5% | 96 = 48 x 2 | 
| [random.m_10000_n_1000_p_0.045_cv_0.8](Datasets/random#randomm_10000_n_1000_p_0045_cv_08)  | 8,928 x 1,000 | 468,303 | 5.25% | 128 = 64 x 2 | 
| [random.m_10000_n_1000_p_0.045_cv_1.3](Datasets/random#randomm_10000_n_1000_p_0045_cv_13) | 7,781 x 1,000 | 522,023 | 6.7% | 170 = 85 x 2 | 
| [random.m_300_n_300_p_0.1](Datasets/random#randomm_300_n_300_p_01)  | 300 x 300  | 9,000 | 10% | 26 = 13 x 2 | 
| [random.m_300_n_300_p_0.2](Datasets/random#randomm_300_n_300_p_02) | 300 x 300  | 18,000 | 20% | 58 = 29 x 2 | 
| [random.m_300_n_300_p_0.3](Datasets/random#randomm_300_n_300_p_03) | 300 x 300  | 27,000 |  30% | 110 = 2 x 55 | 
| [random.m_10000_n_100_p_0.03](Datasets/random#randomm_10000_n_100_p_003) | 9,513 x 100 | 30,000 | 3.15% | 44 = 22 x 2 |
| [random.m_10000_n_500_p_0.03](Datasets/random#randomm_10000_n_500_p_003) | 10,000 x 500 | 150,000 | 3% | 50 = 25 x 2 | 
| [random.m_10000_n_1000_p_0.03](Datasets/random#randomm_10000_n_1000_p_003) | 10,000 x 1,000 | 300,000 |  3% | 52 = 26 x 2 | 
| [random.m_5000_n_500_p_0.03](Datasets/random#randomm_5000_n_500_p_003) | 5,000 x 500 | 75,000 | 3% | 32 = 16 x 2 | 
| [random.m_25000_n_500_p_0.03](Datasets/random#randomm_25000_n_500_p_003) | 25,000 x 500 | 375,000 | 3% | 90 = 45 x 2 | 
| [random.m_50000_n_500_p_0.03](Datasets/random#randomm_50000_n_500_p_003) | 50,000 x 500  | 750,000 | 3% | 150 = 75 x 2 | 
| [random.m_100_n_100_r_0.2_p_0.2](Datasets/random#randomm_100_n_100_r_02_p_02) | 100 x 100  | 2,381 | 23.81% |  400 = 20 x 20 | 
| [random.m_100_n_100_r_0.2_p_0.5](Datasets/random#randomm_100_n_100_r_02_p_05) | 100 x 100  | 5,126 | 51.26% | 400 = 20 x 20 | 
| [random.m_100_n_100_r_0.2_p_0.8](Datasets/random#randomm_100_n_100_r_02_p_08) | 100 x 100  | 8,092 | 80.92% | 456 = 24 x 19 |
| [random.m_100_n_100_r_0.5_p_0.2](Datasets/random#randomm_100_n_100_r_05_p_02) | 100 x 100  | 4,008 | 40.08% | 2,500 = 50 x 50 |
| [random.m_100_n_100_r_0.5_p_0.5](Datasets/random#randomm_100_n_100_r_05_p_05) | 2,500 | 100 x 100  | 6,208 | 62.08% | 2,500 = 50 x 50 | 
| [random.m_100_n_100_r_0.5_p_0.8](Datasets/random#randomm_100_n_100_r_05_p_08) | 2,500 | 100 x 100  | 8,456 | 84.56% | 2,500 = 50 x 50 | 
| [random.m_100_n_100_r_0.8_p_0.2](Datasets/random#randomm_100_n_100_r_08_p_02) | 6,400 | 100 x 100  | 7,127 | 71.27% | 6,400 = 80 x 80 | 
| [random.m_100_n_100_r_0.8_p_0.5](Datasets/random#randomm_100_n_100_r_08_p_05) | 6,400 | 100 x 100  | 8,236 | 82.36% | 6,400 = 80 x 80 | 
| [random.m_100_n_100_r_0.8_p_0.8](Datasets/random#randomm_100_n_100_r_08_p_08) | 6,400 | 100 x 100  | 9,277 | 92.77% | 6,400 = 80 x 80 | 

## Acknowledgement & Citation

When publishing results obtained using this benchmark, the original dataset authors should be cited. Please use the following BibTeX citation for citing this benchmark:
```
@misc{MaximumBicliqueBenchmark,
  author       = {Eran Shaham},
  title        = {maximum biclique benchmark},
  howpublished = {\url{https://github.com/shahamer/maximum-biclique-benchmark}},
  month        = dec,
  year         = 2019
}
```

## References

<!--
E. Shaham, H. Yu, and X. Li
Shaham, Eran and Yu, Honghai and Li, Xiao-Li.
-->
1. Eran Shaham, Honghai Yu, and Xiao-Li Li. 
*On finding the maximum edge biclique in a bipartite graph: a subspace clustering approach*. 
In SIAM International Conference on Data Mining, 2016, pp. 315–323.
<!--->
<!-- Y. Zhang, C. A. Phillips, G. L. Rogers, E. J. Baker, E. J. Chesler, and M. A. Langston -->
2. Yun Zhang, Charles A Phillips, Gary L. Rogers, Erich J. Baker, Elissa J. Chesler, and Michael A. Langston. 
*On finding bicliques in bipartite graphs: a novel algorithm and its application to the integration of diverse biological data types*.
BMC Bioinformatics, 15, 2014, pp. 110–127.
<!--->
<!-- Peeters, Ren{\'e} -->
3. Peeters, Rene.
*The maximum edge biclique problem is NP-complete*.
Discrete Applied Mathematics, 131(3), 2003, pp. 651–654.

## Feedback, Suggestions
Please mail any feedback or suggestions
