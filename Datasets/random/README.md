
# Introduction 
The class RandomBipartiteGraph.java contains the following two static functions for generating random bipartite graphs: 
* RegularErdosRenyi: Erdős–Rényi random bipartite graph model.
Each possible edge in the bipartite graph has a probability ρ, independent of other edges, to be included in the graph. The probability ρ is also referred to as “density”.
* ModifiedErdosRenyi: a modified Erdős–Rényi random bipartite graph model.
The model enables variability in the degree of vertices: given a bipartite graph G = (U ∪ V, E), the degree of each vertex i ∈ U is governed by the following two parameters: (i) µ: mean vertex degree, and (ii) CV : coefficient of variation. Note that: CV = σ/µ, where σ is the standard deviation, µ is the mean, and CV is the coefficient of variation. Also note that setting CV=0 is equivalent to using the previous Erdős–Rényi model as µ=ρ. The above degree places edges to every i ∈ U. The end point of each edge on V is selected with uniform probability. For example, if a vertex u ∈ U has been assigned a degree of two, then two vertices of V, v1 ,v2 ∈ V, will be selected, uniformly at random, to serve as edge end points, namely: (u,v1),(u,v2) ∈ E.


If you wish to use the code, please cite the following paper:
[_On finding the maximum edge biclique in a bipartite graph: a subspace clustering approach_](https://github.com/shahamer/maximum-biclique-benchmark#references).


# Datasets
The following synthetic datasets have the following format: 
* RegularErdosRenyi: random.m\_{|U|}\_n\_{|V|}\_p\_{ρ}
* ModifiedErdosRenyi:  random.m\_{|U|}\_n\_{|V|}\_p\_{ρ}\_cv\_{CV}

The datasets reflects the datasets used in the paper [_On finding bicliques in bipartite graphs: a novel algorithm and its application to the integration of diverse biological data types_](https://github.com/shahamer/maximum-biclique-benchmark#references) -- three datasets for each of the following figures: Fig.8, Fig.9, Fig.11_a, Fig.11_b, and Fig.11_c. 


## random.m_10000_n_1000_p_0.02
* name:	random.m_10000_n_1000_p_0.02
* source: random.m_10000_n_1000_p_0.02.txt
* nodes: 10,000 x 1,000
* edges: 200,000
* density: 2%
* description: Fig.8
* max{degree(U)} (1 x |J|): 41
* max{degree(V)} (|I| x 1): 242
* max biclique (|I| x |J|): 32 = 16 x 2
* I: 658, 1554, 1658, 1814, 2295, 2359, 2593, 2636, 3036, 3142, 3583, 4045, 5496, 5916, 7954, 8283
* J: 118, 752
* time to max biclique: 10.3 sec
* overall run-time: 2.0 min


## random.m_10000_n_5000_p_0.02
* name:	random.m_10000_n_5000_p_0.02
* source: random.m_10000_n_5000_p_0.02.txt
* nodes: 10,000 x 5,000
* edges: 1,000,000
* density: 2%
* description: Fig.8
* max{degree(U)} (1 x |J|): 139
* max{degree(V)} (|I| x 1): 252
* max biclique (|I| x |J|): 36 = 18 x 2
* I: 1465, 1734, 1797, 1960, 2687, 2919, 3560, 4625, 4638, 5082, 5303, 5630, 6247, 6350, 7209, 7905, 8292, 9620
* J: 2351, 2783
* time to max biclique: 23.4 sec
* overall run-time: 4.0 min


## random.m_10000_n_10000_p_0.02
* name:	random.m_10000_n_10000_p_0.02
* source: random.m_10000_n_10000_p_0.02.txt
* nodes: 10,000 x 10,000
* edges: 2,000,000
* density: 2%
* description: Fig.8
* max{degree(U)} (1 x |J|): 256
* max{degree(V)} (|I| x 1): 254
* max biclique (|I| x |J|): 38 = 2 x 19
* I: 5867, 8297
* J: 237, 1280, 2661, 2809, 2862, 3017, 3554, 3770, 4051, 4155, 4322, 5937, 7229, 7258, 7563, 8193, 9063, 9445, 9623
* time to max biclique: 38.7 sec
* overall run-time: 12.2 min


## random.m_10000_n_1000_p_0.045_cv_0.3
* name:	random.m_10000_n_1000_p_0.045_cv_0.3
* source: random.m_10000_n_1000_p_0.045_cv_0.3.txt
* nodes: 9,992 x 1,000
* edges: 450,042
* density: 4.5%
* description: Fig.9
* max{degree(U)} (1 x |J|): 94
* max{degree(V)} (|I| x 1): 518
* max biclique (|I| x |J|): 96 = 48 x 2
* I: 118, 338, 890, 1373, 1387, 1412, 1418, 1450, 1515, 1593, 1596, 1713, 2582, 2785, 2880, 2896, 2923, 2993, 3269, 3499, 3838, 3930, 4111, 4513, 4556, 4864, 5216, 5578, 5751, 6022, 6469, 7082, 7235, 7421, 7467, 7609, 7610, 7785, 7857, 7970, 8002, 8146, 8453, 8802, 9238, 9855, 9890, 9968
* J: 308, 664
* time to max biclique: 2.2 sec
* overall run-time: 3.1 min



## random.m_10000_n_1000_p_0.045_cv_0.8
* name:	random.m_10000_n_1000_p_0.045_cv_0.8
* source: random.m_10000_n_1000_p_0.045_cv_0.8.txt
* nodes: 8,928 x 1,000
* edges: 468,303
* density: 5.245%
* description: Fig.9
* max{degree(U)} (1 x |J|): 174
* max{degree(V)} (|I| x 1): 536
* max biclique (|I| x |J|): 128 = 64 x 2
* I: 77, 229, 372, 406, 415, 850, 1018, 1526, 1672, 1775, 1933, 2240, 2286, 2354, 2355, 2423, 2491, 2556, 2679, 2995, 3029, 3050, 3055, 3169, 3180, 3324, 3356, 3662, 3691, 3750, 3819, 3853, 3957, 4303, 4374, 4701, 4771, 4946, 4970, 5089, 5232, 5362, 5452, 5591, 5724, 6039, 6085, 6243, 6283, 6310, 6313, 6353, 7139, 7348, 7564, 7722, 7743, 7756, 7905, 8017, 8148, 8198, 8466, 8805
* J: 576, 792
* time to max biclique: 573.0 msec
* overall run-time: 3.1 min


## random.m_10000_n_1000_p_0.045_cv_1.3
* name:	random.m_10000_n_1000_p_0.045_cv_1.3
* source: random.m_10000_n_1000_p_0.045_cv_1.3.txt
* nodes: 7,781 x 1,000
* edges: 522,023
* density: 6.7%
* description: Fig.9
* max{degree(U)} (1 x |J|): 262
* max{degree(V)} (|I| x 1): 589
* max biclique (|I| x |J|): 170 = 85 x 2
* I: 29, 227, 299, 316, 520, 532, 565, 694, 952, 988, 1489, 1829, 1837, 1950, 2025, 2050, 2081, 2087, 2165, 2206, 2248, 2329, 2616, 2663, 2696, 2721, 2781, 2856, 2986, 3058, 3174, 3462, 3627, 3660, 3664, 3724, 3796, 3845, 3869, 3966, 4014, 4034, 4181, 4185, 4189, 4229, 4299, 4305, 4424, 4556, 4683, 4796, 4932, 5001, 5196, 5233, 5264, 5426, 5434, 5597, 5718, 5744, 5764, 5818, 5885, 5914, 6187, 6282, 6528, 6602, 6668, 6701, 6715, 6822, 6843, 6966, 6990, 6999, 7292, 7368, 7428, 7459, 7612, 7619, 7647
* J: 110, 801
* time to max biclique: 330.0 msec
* overall run-time: 1.1 min


## random.m_300_n_300_p_0.1
* name:	random.m_300_n_300_p_0.1
* source: random.m_300_n_300_p_0.1.txt
* nodes: 300 x 300
* edges: 9,000
* density: 10.00%
* description: Fig.11_a
* max{degree(U)} (1 x |J|): 46
* max{degree(V)} (|I| x 1): 44
* max biclique (|I| x |J|): 26 = 13 x 2
* I: 24, 63, 136, 147, 156, 158, 191, 194, 236, 239, 241, 253, 271
* J: 89, 200
* time to max biclique: 356.0 msec
* overall run-time: 1.2 sec


## random.m_300_n_300_p_0.2
* name:	random.m_300_n_300_p_0.2
* source: random.m_300_n_300_p_0.2.txt
* nodes: 300 x 300
* edges: 18,000
* density: 20.00%
* description: Fig.11_a
* max{degree(U)} (1 x |J|): 80
* max{degree(V)} (|I| x 1): 82
* max biclique (|I| x |J|): 58 = 29 x 2
* I: 13, 25, 27, 34, 39, 43, 44, 53, 74, 85, 93, 102, 106, 107, 112, 117, 121, 130, 156, 158, 185, 186, 204, 213, 223, 225, 246, 262, 279
* J: 39, 154
* time to max biclique: 156.0 msec
* overall run-time: 17.1 sec


## random.m_300_n_300_p_0.3
* name:	random.m_300_n_300_p_0.3
* source: random.m_300_n_300_p_0.3.txt
* nodes: 300 x 300
* edges: 27,000
* density: 30.00%
* description: Fig.11_a
* max{degree(U)} (1 x |J|): 114
* max{degree(V)} (|I| x 1): 114
* max biclique (|I| x |J|): 110 = 2 x 55
* I: 19, 92
* J: 0, 7, 12, 17, 27, 30, 31, 35, 40, 41, 47, 49, 52, 56, 58, 62, 63, 76, 79, 98, 99, 120, 128, 139, 145, 148, 153, 159, 167, 172, 175, 193, 194, 199, 201, 212, 213, 214, 229, 238, 242, 243, 246, 251, 252, 260, 265, 269, 277, 282, 284, 285, 289, 293, 295
* time to max biclique: 45.0 msec
* overall run-time: 22.2 sec


## random.m_10000_n_100_p_0.03
* name:	random.m_10000_n_100_p_0.03
* source: random.m_10000_n_100_p_0.03.txt
* nodes: 9,513 x 100
* edges: 30,000
* density: 3.15%
* description: Fig.11_b
* max{degree(U)} (1 x |J|): 12
* max{degree(V)} (|I| x 1): 358
* max biclique (|I| x |J|): 44 = 22 x 2
* I: 38, 279, 2117, 2204, 2396, 2820, 3010, 3055, 3150, 3922, 4093, 5335, 5351, 5528, 5588, 5607, 6737, 6841, 6985, 7160, 7673, 8700
* J: 12, 45
* time to max biclique: 137.0 msec
* overall run-time: 2.8 sec


## random.m_10000_n_500_p_0.03
* name:	random.m_10000_n_500_p_0.03
* source: random.m_10000_n_500_p_0.03.txt
* nodes: 10,000 x 500
* edges: 150,000
* density: 3%
* description: Fig.11_b
* max{degree(U)} (1 x |J|): 33
* max{degree(V)} (|I| x 1): 352
* max biclique (|I| x |J|): 50 = 25 x 2
* I: 369, 1167, 1838, 2095, 2610, 2916, 3097, 3102, 3409, 3644, 4142, 4172, 4206, 4307, 5450, 6096, 6376, 7484, 7541, 7841, 7929, 8119, 9090, 9265, 9715
* J: 271, 414
* time to max biclique: 6.8 sec
* overall run-time: 2.1 min


## random.m_10000_n_1000_p_0.03
* name:	random.m_10000_n_1000_p_0.03
* source: random.m_10000_n_1000_p_0.03.txt
* nodes: 10,000 x 1,000
* edges: 300,000
* density: 3%
* description: Fig.11_b
* max{degree(U)} (1 x |J|): 53 
* max{degree(V)} (|I| x 1): 350
* max biclique (|I| x |J|): 52 = 26 x 2
* I: 579, 2248, 2611, 2677, 3713, 3793, 4110, 4334, 4525, 4780, 4940, 5170, 5500, 6170, 7117, 7134, 7139, 7286, 7548, 7938, 8187, 8452, 8625, 9177, 9622, 9985  
* J: 169, 413
* time to max biclique: 17.1 sec
* overall run-time: 3.1 min


## random.m_5000_n_500_p_0.03
* name:	random.m_5000_n_500_p_0.03
* source: random.m_5000_n_500_p_0.03.txt
* nodes: 5,000 x 500
* edges: 75,000
* density: 3%
* description: Fig.11_c
* max{degree(U)} (1 x |J|): 32
* max{degree(V)} (|I| x 1): 187
* max biclique (|I| x |J|): 32 = 16 x 2
* I: 245, 273, 327, 1244, 1268, 1497, 1610, 2279, 2417, 3273, 3457, 3563, 3635, 4723, 4813, 4957
* J: 173, 452
* time to max biclique: 2.3 sec
* overall run-time: 32.8 sec


## random.m_25000_n_500_p_0.03
* name:	random.m_25000_n_500_p_0.03
* source: random.m_25000_n_500_p_0.03.txt
* nodes: 25,000 x 500
* edges: 375,000
* density: 3%
* description: Fig.11_c
* max{degree(U)} (1 x |J|): 33
* max{degree(V)} (|I| x 1): 828
* max biclique (|I| x |J|): 90 = 45 x 2
* I: 1011, 1055, 1082, 2082, 2245, 2355, 4751, 4874, 5332, 5433, 5543, 6110, 6645, 7256, 7575, 8322, 8432, 8491, 8504, 9214, 9788, 9820, 11285, 11357, 11869, 13770, 14034, 14698, 14830, 15163, 15260, 15707, 16237, 17214, 17235, 17841, 18383, 18763, 18825, 20178, 22558, 23093, 23094, 23432, 24901
* J: 91, 182
* time to max biclique: 1.2 sec
* overall run-time: 3.1 min


## random.m_50000_n_500_p_0.03
* name:	random.m_50000_n_500_p_0.03
* source: random.m_50000_n_500_p_0.03.txt
* nodes: 50,000 x 500
* edges: 750,000
* density: 3%
* description: Fig.11_c
* max{degree(U)} (1 x |J|): 35
* max{degree(V)} (|I| x 1): 1,632
* max biclique (|I| x |J|): 150 = 75 x 2
* I: 482, 1364, 2338, 4191, 4268, 4903, 5527, 5703, 6271, 7329, 7430, 8416, 8823, 8854, 12198, 13159, 13477, 14357, 14398, 15649, 15901, 16626, 18207, 18438, 19698, 19993, 20220, 20339, 20640, 20910, 20926, 22321, 22862, 23055, 23552, 24431, 24739, 25318, 25758, 27690, 27912, 28172, 28468, 28474, 29025, 29097, 29943, 30286, 31460, 31514, 31974, 32277, 32529, 32682, 32950, 33488, 34704, 34732, 34800, 35941, 36529, 37047, 37183, 37734, 37821, 38918, 38932, 39621, 39986, 40776, 40832, 41148, 41481, 43293, 49448
* J: 397, 402
* time to max biclique: 19.0 sec
* overall run-time: 3.1 min

