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

| dataset info    |  max biclique |       nodes      | edges         |  density         | 
|:-----------------|-----:|-------:|-----:|------:|
| | | | | | 
| [Snap database](Datasets/snap.stanford.edu/README.md) | | | | | 
| [com-LiveJournal](Datasets/snap.stanford.edu/com-LiveJournal) | 33,984 | 2,325,297 x 3,996,402 | 34,681,189 | 0.00037% | 
| [com-Youtube](Datasets/snap.stanford.edu/com-Youtube)  | 8,008 | 374,785 x 1,134,140 | 2,987,624 | 0.00070% | 
| [wiki-topcats](Datasets/snap.stanford.edu/wiki-topcats) | 126,824 | 1,791,489 x 1,791,489 | 28,511,807 | 0.00089% | 
| [com-Amazon](Datasets/snap.stanford.edu/com-Amazon)  | 188 | 265,933 x 264,147 | 925,872 | 0.0013% |
| [com-Orkut](Datasets/snap.stanford.edu/com-Orkut) | 16,726 | 2,723,360 x 3,072,440 | 117,185,083 | 0.0014% | 
| [com-DBLP](Datasets/snap.stanford.edu/com-DBLP)   | 3,249 | 189,114 x 304,374 | 1,049,866 | 0.0018% |
| [email-Eu-core](Datasets/snap.stanford.edu/email-Eu-core) | 390 | 868 x 991 | 25,571| 2.97% |
| | | | | | 
| [Konect database](Datasets/konect.uni-koblenz.de/README.md) | | | | | 
| [movieLens 10M](Datasets/konect.uni-koblenz.de/movielens-10m_rating) | 67,736 | 69,878 x 10,677 | 10,000,054 | 1.34% | 
| [movieLens 1M](Datasets/konect.uni-koblenz.de/movielens-1m) | 7,002 | 6,040 x 3,706 | 1,000,209 | 4.47% | 
| [movieLens 100K](Datasets/konect.uni-koblenz.de/movielens-100k_rating) | 1,267 | 943 x 1,682 | 100,000 | 6.30% |  




## [Synthetic Datasets](Datasets/random/README.md)

| [dataset info](Datasets/random/README.md)    |  max biclique |       nodes      | edges         |  density         | 
|:-----------------|--------------------:|---------------:|--------------:|--------------:|
| [random.m_10000_n_1000_p_0.02](Datasets/random#randomm_10000_n_1000_p_002)| 32 | 10,000 x 1,000 | 200,000   |  2% | 
| [random.m_10000_n_5000_p_0.02](Datasets/random#randomm_10000_n_5000_p_002) | 36 |  10,000 x 5,000 | 1,000,000 | 2% | 
| [random.m_10000_n_10000_p_0.02](Datasets/random#randomm_10000_n_10000_p_002) | 38 | 10,000 x 10,000 | 2,000,000 | 2% |
| [random.m_10000_n_1000_p_0.045_cv_0.3](Datasets/random#randomm_10000_n_1000_p_0045_cv_03) | 96 | 9,992 x 1,000 | 450,042 | 4.5% | 
| [random.m_10000_n_1000_p_0.045_cv_0.8](Datasets/random#randomm_10000_n_1000_p_0045_cv_08)  | 128 | 8,928 x 1,000 | 468,303 | 5.25% | 
| [random.m_10000_n_1000_p_0.045_cv_1.3](Datasets/random#randomm_10000_n_1000_p_0045_cv_13) | 170 | 7,781 x 1,000 | 522,023 | 6.7% | 
| [random.m_300_n_300_p_0.1](Datasets/random#randomm_300_n_300_p_01)  | 26 | 300 x 300  | 9,000 | 10% | 
| [random.m_300_n_300_p_0.2](Datasets/random#randomm_300_n_300_p_02) | 58 |  300 x 300  | 18,000 | 20% | 
| [random.m_300_n_300_p_0.3](Datasets/random#randomm_300_n_300_p_03) | 110 |  300 x 300  | 27,000 |  30% | 
| [random.m_10000_n_100_p_0.03](Datasets/random#randomm_10000_n_100_p_003) | 44 | 9,513 x 100 | 30,000 | 3.15% |
| [random.m_10000_n_500_p_0.03](Datasets/random#randomm_10000_n_500_p_003) | 50 | 10,000 x 500 | 150,000 | 3% | 
| [random.m_10000_n_1000_p_0.03](Datasets/random#randomm_10000_n_1000_p_003) | 52 | 10,000 x 1,000 | 300,000 |  3% | 
| [random.m_5000_n_500_p_0.03](Datasets/random#randomm_5000_n_500_p_003) | 32 | 5,000 x 500 | 75,000 | 3% | 
| [random.m_25000_n_500_p_0.03](Datasets/random#randomm_25000_n_500_p_003) | 90 | 25,000 x 500 | 375,000 | 3% | 
| [random.m_50000_n_500_p_0.03](Datasets/random#randomm_50000_n_500_p_003) |  150 | 50,000 x 500  | 750,000 | 3% | 
| [random.m_100_n_100_r_0.2_p_0.2](Datasets/random#randomm_100_n_100_r_02_p_02) | 400 | 100 x 100  | 2,381 | 23.81% |  
| [random.m_100_n_100_r_0.2_p_0.5](Datasets/random#randomm_100_n_100_r_02_p_05) | 400 | 100 x 100  | 5,126 | 51.26% | 
| [random.m_100_n_100_r_0.2_p_0.8](Datasets/random#randomm_100_n_100_r_02_p_08) | 456 | 100 x 100  | 8,092 | 80.92% | 
| [random.m_100_n_100_r_0.5_p_0.2](Datasets/random#randomm_100_n_100_r_05_p_02) | 2,500 | 100 x 100  | 4,008 | 40.08% | 
| [random.m_100_n_100_r_0.5_p_0.5](Datasets/random#randomm_100_n_100_r_05_p_05) | 2,500 | 100 x 100  | 6,208 | 62.08% | 
| [random.m_100_n_100_r_0.5_p_0.8](Datasets/random#randomm_100_n_100_r_05_p_08) | 2,500 | 100 x 100  | 8,456 | 84.56% | 
| [random.m_100_n_100_r_0.8_p_0.2](Datasets/random#randomm_100_n_100_r_08_p_02) | 6,400 | 100 x 100  | 7,127 | 71.27% | 
| [random.m_100_n_100_r_0.8_p_0.5](Datasets/random#randomm_100_n_100_r_08_p_05) | 6,400 | 100 x 100  | 8,236 | 82.36% | 
| [random.m_100_n_100_r_0.8_p_0.8](Datasets/random#randomm_100_n_100_r_08_p_08) | 6,400 | 100 x 100  | 9,277 | 92.77% | 

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
