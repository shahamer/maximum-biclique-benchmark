# maximum biclique benchmark


## Introduction
 
## Table of Contents

* [Real World Datasets](#real-world-datasets)
* [Synthetic Datasets](#synthetic-datasets)
* [Related Work](#related-work)
* [Acknowledgement & Citation](#acknowledgement--citation)
* [References](#references)
 
## Real World Datasets

| dataset info    |  max biclique |       nodes      | edges         | 
|:-----------------|--------------------:|---------------:|--------------:|
| [email-Eu-core](https://github.com/shahamer/maximum-biclique-benchmark/tree/master/Datasets/snap.stanford.edu/email-Eu-core)|         380      |   824 x 965      | 24,929        | 
| [com-Amazon](https://github.com/shahamer/maximum-biclique-benchmark/tree/master/Datasets/snap.stanford.edu/com-Amazon)      |         188      |  265,933 x 264,147    | 925,872       | 
| [com-DBLP](https://github.com/shahamer/maximum-biclique-benchmark/tree/master/Datasets/snap.stanford.edu/com-DBLP)          |      3,249    | 189,114 x 304,374   | 1,049,866     | 
| [com-Youtube](https://github.com/shahamer/maximum-biclique-benchmark/tree/master/Datasets/snap.stanford.edu/com-Youtube)    |     8,008     |  374,785 x 1,134,140  | 2,987,624     | 
| [wiki-topcats](https://github.com/shahamer/maximum-biclique-benchmark/tree/master/Datasets/snap.stanford.edu/wiki-topcats)  |   126,824    |  1,791,489 x 1,791,489  | 28,508,141    | 
| [com-LiveJournal](https://github.com/shahamer/maximum-biclique-benchmark/tree/master/Datasets/snap.stanford.edu/com-LiveJournal)| 33,984     |  2,325,297 x 3,996,402  | 34,681,189    |   
| [com-Orkut](https://github.com/shahamer/maximum-biclique-benchmark/tree/master/Datasets/snap.stanford.edu/com-Orkut)        |                    | 2,723,360 x 3,072,440  | 117,185,083   |              
| [com-Friendster](https://github.com/shahamer/maximum-biclique-benchmark/tree/master/Datasets/snap.stanford.edu/com-Friendster) |                  |  2,491,391 x 22,021,894  | 175,733,662 |              

## Synthetic Datasets

| dataset info    |  max biclique |       nodes      | edges         | 
|:-----------------|--------------------:|---------------:|--------------:|
| [random.m_10000_n_1000_p_0.02](https://github.com/shahamer/maximum-biclique-benchmark/tree/master/Datasets/random#randomm_10000_n_1000_p_002)|         32      |   10,000 x 1,000      | 199,988        | 
| [random.m_10000_n_5000_p_0.02](https://github.com/shahamer/maximum-biclique-benchmark/tree/master/Datasets/random#randomm_10000_n_5000_p_002)      |         36      |  10,000 x 5,000   | 999,915       | 
| [random.m_10000_n_10000_p_0.02]https://github.com/shahamer/maximum-biclique-benchmark/tree/master/Datasets/random#randomm_10000_n_10000_p_002)          |      38    | 10,000 x 10,000   | 1,999,824     | 
| [random.m_10000_n_1000_p_0.045_cv_0.3](https://github.com/shahamer/maximum-biclique-benchmark/tree/master/Datasets/random#randomm_10000_n_1000_p_0045_cv_03)    |    96     |  9,992 x 1,000  | 450,000     | 
| [random.m_10000_n_1000_p_0.045_cv_0.8](https://github.com/shahamer/maximum-biclique-benchmark/tree/master/Datasets/random#randomm_10000_n_1000_p_0045_cv_08)  |   128    |  8,928 x 1,000  | 468,268   | 
| [random.m_10000_n_1000_p_0.045_cv_1.3](https://github.com/shahamer/maximum-biclique-benchmark/tree/master/Datasets/random#randomm_10000_n_1000_p_0045_cv_13)|   170     |  7,781 x 1,000  | 521,964    |   
| [random.m_300_n_300_p_0.1](https://github.com/shahamer/maximum-biclique-benchmark/tree/master/Datasets/random#randomm_300_n_300_p_01)        |        26            | 300 x 300  | 8,969   |              
| [random.m_300_n_300_p_0.2](https://github.com/shahamer/maximum-biclique-benchmark/tree/master/Datasets/random#randomm_300_n_300_p_02) |           58       |  300 x 300  | 17,937 |    
| [random.m_300_n_300_p_0.3](https://github.com/shahamer/maximum-biclique-benchmark/tree/master/Datasets/random#randomm_300_n_300_p_03) |                            110       |  300 x 300  | 26,903 |  
| [random.m_10000_n_100_p_0.03](https://github.com/shahamer/maximum-biclique-benchmark/tree/master/Datasets/random#randomm_10000_n_100_p_003) |                         44       |  9,513 x 100  | 29,998 | 
| [random.m_10000_n_500_p_0.03](https://github.com/shahamer/maximum-biclique-benchmark/tree/master/Datasets/random#randomm_10000_n_500_p_003) |                         50       |  10,000 x 500 | 149,991 | 
| [random.m_10000_n_1000_p_0.03](https://github.com/shahamer/maximum-biclique-benchmark/tree/master/Datasets/random#randomm_10000_n_1000_p_003) |                         52      |  10,000 x 1,000 | 299,970 | 
| [random.m_5000_n_500_p_0.03](https://github.com/shahamer/maximum-biclique-benchmark/tree/master/Datasets/random#randomm_5000_n_500_p_003) |                         32       |  5,000 x 500  | 74,980 | 
| [random.m_25000_n_500_p_0.03](https://github.com/shahamer/maximum-biclique-benchmark/tree/master/Datasets/random#randomm_25000_n_500_p_003) |                      90       |  25,000 x 500 | 374,992 | 
| [random.m_50000_n_500_p_0.03](https://github.com/shahamer/maximum-biclique-benchmark/tree/master/Datasets/random#randomm_50000_n_500_p_003) |                   150       |  50,000 x 500  | 749,983 | 

## Related Work

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

