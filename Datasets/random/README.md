
# Introduction 
The class [RandomBipartiteGraph.java](RandomBipartiteGraph.java) contains the following two static functions for generating random bipartite graphs: 
* RegularErdosRenyi: Erdős–Rényi random bipartite graph model.
Each possible edge in the bipartite graph has a probability ρ, independent of other edges, to be included in the graph. The probability ρ is also referred to as “density”.
* ModifiedErdosRenyi: a modified Erdős–Rényi random bipartite graph model.
The model enables variability in the degree of vertices: given a bipartite graph G = (U ∪ V, E), the degree of each vertex i ∈ U is governed by the following two parameters: (i) µ: mean vertex degree, and (ii) CV : coefficient of variation. Note that: CV = σ/µ, where σ is the standard deviation, µ is the mean, and CV is the coefficient of variation. Also note that setting CV=0 is equivalent to using the previous Erdős–Rényi model as µ=ρ. The above degree places edges to every i ∈ U. The end point of each edge on V is selected with uniform probability. For example, if a vertex u ∈ U has been assigned a degree of two, then two vertices of V, v1 ,v2 ∈ V, will be selected, uniformly at random, to serve as edge end points, namely: (u,v1),(u,v2) ∈ E.


If you wish to use the code, please cite the following paper:
"_On finding the maximum edge biclique in a bipartite graph: a subspace clustering approach_" [[1]](https://github.com/shahamer/maximum-biclique-benchmark#references).


# Datasets
The following synthetic datasets have the following format: 
* RegularErdosRenyi: random.m\_{|U|}\_n\_{|V|}\_p\_{ρ}
* ModifiedErdosRenyi:  random.m\_{|U|}\_n\_{|V|}\_p\_{ρ}\_cv\_{CV}

The datasets reflects the datasets used in the paper "_On finding bicliques in bipartite graphs: a novel algorithm and its application to the integration of diverse biological data types_" [[2]](https://github.com/shahamer/maximum-biclique-benchmark#references) -- three datasets for each of the article's figures: Fig.8, Fig.9, Fig.11_a, Fig.11_b, and Fig.11_c. 


Another synthetic dataset has the following format: 
* RegularErdosRenyi: random.m\_{|U|}\_n\_{|V|}\_r\_{r}\_p\_{ρ}

Similar to the above synthetic dataset, this dataset reflects random matrices of size |U| x |V| of density ρ, and a planted biclique of size r|U| x r|V|. 
The dataset aims to demonstrate the impact of density (noise) on exploration time.  


## random.m_10000_n_1000_p_0.02
* name:	random.m_10000_n_1000_p_0.02
* source: [random.m_10000_n_1000_p_0.02.txt](random.m_10000_n_1000_p_0.02.txt.7z)
* nodes: 10,000 x 1,000
* edges: 200,000
* density: 2.0%
* description: Fig.8
* max{degree(U)} (1 x |J|): 41
* max{degree(V)} (|I| x 1): 242
* max biclique (|I| x |J|): 32 = 16 x 2
* I: 658, 1554, 1658, 1814, 2295, 2359, 2593, 2636, 3036, 3142, 3583, 4045, 5496, 5916, 7954, 8283
* J: 207, 281
* time to max biclique: 8.8 sec
* overall run-time: 2.0 min


## random.m_10000_n_5000_p_0.02
* name:	random.m_10000_n_5000_p_0.02
* source: [random.m_10000_n_5000_p_0.02.txt](random.m_10000_n_5000_p_0.02.txt.7z)
* nodes: 10,000 x 5,000
* edges: 1,000,000
* density: 2.0%
* description: Fig.8
* max{degree(U)} (1 x |J|): 139
* max{degree(V)} (|I| x 1): 252
* max biclique (|I| x |J|): 36 = 18 x 2
* I: 1465, 1734, 1797, 1960, 2687, 2919, 3560, 4625, 4638, 5082, 5303, 5630, 6247, 6350, 7209, 7905, 8292, 9620
* J: 610, 2057
* time to max biclique: 10.7 sec
* overall run-time: 4.0 min


## random.m_10000_n_10000_p_0.02
* name:	random.m_10000_n_10000_p_0.02
* source: [random.m_10000_n_10000_p_0.02.txt](random.m_10000_n_10000_p_0.02.txt.7z)
* nodes: 10,000 x 10,000
* edges: 2,000,000
* density: 2.0%
* description: Fig.8
* max{degree(U)} (1 x |J|): 256
* max{degree(V)} (|I| x 1): 254
* max biclique (|I| x |J|): 38 = 2 x 19
* I: 5867, 8297
* J: 958, 1652, 2250, 2423, 2691, 2973, 3980, 4484, 5862, 6876, 7041, 7149, 8534, 8558, 8810, 8895, 9169, 9855, 9874
* time to max biclique: 30.4 sec
* overall run-time: 12.2 min


## random.m_10000_n_1000_p_0.045_cv_0.3
* name:	random.m_10000_n_1000_p_0.045_cv_0.3
* source: [random.m_10000_n_1000_p_0.045_cv_0.3.txt](random.m_10000_n_1000_p_0.045_cv_0.3.txt.7z)
* nodes: 9,992 x 1,000
* edges: 450,042
* density: 4.5%
* description: Fig.9
* max{degree(U)} (1 x |J|): 94
* max{degree(V)} (|I| x 1): 518
* max biclique (|I| x |J|): 96 = 48 x 2
* I: 118, 338, 890, 1373, 1387, 1412, 1418, 1450, 1515, 1593, 1596, 1713, 2583, 2786, 2881, 2897, 2924, 2994, 3270, 3501, 3840, 3932, 4113, 4515, 4558, 4866, 5218, 5580, 5753, 6024, 6471, 7084, 7237, 7424, 7470, 7613, 7614, 7789, 7861, 7974, 8006, 8150, 8457, 8808, 9246, 9863, 9898, 9976
* J: 61, 135
* time to max biclique: 1.1 sec
* overall run-time: 3.1 min



## random.m_10000_n_1000_p_0.045_cv_0.8
* name:	random.m_10000_n_1000_p_0.045_cv_0.8
* source: [random.m_10000_n_1000_p_0.045_cv_0.8.txt](random.m_10000_n_1000_p_0.045_cv_0.8.txt.7z)
* nodes: 8,928 x 1,000
* edges: 468,303
* density: 5.245%
* description: Fig.9
* max{degree(U)} (1 x |J|): 174
* max{degree(V)} (|I| x 1): 536
* max biclique (|I| x |J|): 128 = 64 x 2
* I: 86, 259, 423, 458, 467, 956, 1137, 1717, 1878, 1995, 2179, 2521, 2573, 2651, 2652, 2728, 2805, 2877, 3017, 3372, 3409, 3431, 3437, 3566, 3577, 3738, 3776, 4113, 4147, 4209, 4285, 4321, 4435, 4813, 4887, 5259, 5339, 5546, 5573, 5710, 5867, 6009, 6105, 6256, 6405, 6760, 6811, 6989, 7033, 7063, 7068, 7111, 7987, 8218, 8471, 8649, 8672, 8689, 8852, 8971, 9118, 9175, 9473, 9857
* J: 508, 535
* time to max biclique: 567.0 msec
* overall run-time: 3.1 min


## random.m_10000_n_1000_p_0.045_cv_1.3
* name:	random.m_10000_n_1000_p_0.045_cv_1.3
* source: [random.m_10000_n_1000_p_0.045_cv_1.3.txt](random.m_10000_n_1000_p_0.045_cv_1.3.txt.7z)
* nodes: 7,781 x 1,000
* edges: 522,023
* density: 6.7%
* description: Fig.9
* max{degree(U)} (1 x |J|): 262
* max{degree(V)} (|I| x 1): 589
* max biclique (|I| x |J|): 170 = 85 x 2
* I: 39, 278, 377, 400, 663, 679, 728, 905, 1241, 1282, 1925, 2366, 2375, 2511, 2604, 2635, 2677, 2684, 2785, 2840, 2894, 3002, 3395, 3452, 3493, 3523, 3601, 3694, 3876, 3959, 4110, 4467, 4682, 4723, 4729, 4806, 4896, 4963, 4995, 5115, 5173, 5200, 5383, 5390, 5394, 5447, 5537, 5544, 5709, 5878, 6050, 6198, 6376, 6465, 6724, 6770, 6806, 7005, 7014, 7221, 7387, 7418, 7443, 7513, 7606, 7641, 7989, 8099, 8423, 8519, 8603, 8641, 8666, 8797, 8826, 8981, 9009, 9019, 9382, 9476, 9543, 9588, 9792, 9804, 9837
* J: 519, 777
* time to max biclique: 164.0 msec
* overall run-time: 52.3 sec


## random.m_300_n_300_p_0.1
* name:	random.m_300_n_300_p_0.1
* source: [random.m_300_n_300_p_0.1.txt](random.m_300_n_300_p_0.1.txt.7z)
* nodes: 300 x 300
* edges: 9,000
* density: 10.0%
* description: Fig.11_a
* max{degree(U)} (1 x |J|): 46
* max{degree(V)} (|I| x 1): 44
* max biclique (|I| x |J|): 26 = 13 x 2
* I: 24, 63, 136, 147, 156, 158, 191, 194, 236, 239, 241, 253, 271
* J: 261, 275
* time to max biclique: 380.0 msec
* overall run-time: 1.0 sec


## random.m_300_n_300_p_0.2
* name:	random.m_300_n_300_p_0.2
* source: [random.m_300_n_300_p_0.2.txt](random.m_300_n_300_p_0.2.txt.7z)
* nodes: 300 x 300
* edges: 18,000
* density: 20.0%
* description: Fig.11_a
* max{degree(U)} (1 x |J|): 80
* max{degree(V)} (|I| x 1): 82
* max biclique (|I| x |J|): 58 = 29 x 2
* I: 13, 25, 27, 34, 39, 43, 44, 53, 74, 85, 93, 102, 106, 107, 112, 117, 121, 130, 156, 158, 185, 186, 204, 213, 223, 225, 246, 262, 279
* J: 155, 209
* time to max biclique: 169.0 msec
* overall run-time: 14.4 sec


## random.m_300_n_300_p_0.3
* name:	random.m_300_n_300_p_0.3
* source: [random.m_300_n_300_p_0.3.txt](random.m_300_n_300_p_0.3.txt.7z)
* nodes: 300 x 300
* edges: 27,000
* density: 30.0%
* description: Fig.11_a
* max{degree(U)} (1 x |J|): 114
* max{degree(V)} (|I| x 1): 114
* max biclique (|I| x |J|): 110 = 2 x 55
* I: 19, 92
* J: 0, 3, 16, 28, 42, 43, 48, 52, 55, 59, 60, 64, 83, 84, 95, 104, 106, 108, 110, 127, 129, 130, 136, 137, 143, 144, 147, 152, 156, 170, 177, 178, 190, 196, 197, 204, 205, 210, 213, 221, 227, 232, 235, 240, 243, 247, 252, 254, 275, 278, 286, 290, 291, 294, 296
* time to max biclique: 53.0 msec
* overall run-time: 22.6 sec


## random.m_10000_n_100_p_0.03
* name:	random.m_10000_n_100_p_0.03
* source: [random.m_10000_n_100_p_0.03.txt](random.m_10000_n_100_p_0.03.txt.7z)
* nodes: 9,513 x 100
* edges: 30,000
* density: 3.15%
* description: Fig.11_b
* max{degree(U)} (1 x |J|): 12
* max{degree(V)} (|I| x 1): 358
* max biclique (|I| x |J|): 44 = 22 x 2
* I: 40, 291, 2225, 2316, 2521, 2962, 3163, 3210, 3308, 4115, 4291, 5600, 5616, 5802, 5863, 5884, 7069, 7183, 7336, 7516, 8053, 9149
* J: 77, 86
* time to max biclique: 84.0 msec
* overall run-time: 2.8 sec


## random.m_10000_n_500_p_0.03
* name:	random.m_10000_n_500_p_0.03
* source: [random.m_10000_n_500_p_0.03.txt](random.m_10000_n_500_p_0.03.txt.7z)
* nodes: 10,000 x 500
* edges: 150,000
* density: 3.0%
* description: Fig.11_b
* max{degree(U)} (1 x |J|): 33
* max{degree(V)} (|I| x 1): 352
* max biclique (|I| x |J|): 50 = 25 x 2
* I: 369, 1167, 1838, 2095, 2610, 2916, 3097, 3102, 3409, 3644, 4142, 4172, 4206, 4307, 5450, 6096, 6376, 7484, 7541, 7841, 7929, 8119, 9090, 9265, 9715
* J: 49, 105
* time to max biclique: 5.1 sec
* overall run-time: 2.1 min


## random.m_10000_n_1000_p_0.03
* name:	random.m_10000_n_1000_p_0.03
* source: [random.m_10000_n_1000_p_0.03.txt](random.m_10000_n_1000_p_0.03.txt.7z)
* nodes: 10,000 x 1,000
* edges: 300,000
* density: 3.0%
* description: Fig.11_b
* max{degree(U)} (1 x |J|): 53 
* max{degree(V)} (|I| x 1): 350
* max biclique (|I| x |J|): 52 = 26 x 2
* I: 579, 2248, 2611, 2677, 3713, 3793, 4110, 4334, 4525, 4780, 4940, 5170, 5500, 6170, 7117, 7134, 7139, 7286, 7548, 7938, 8187, 8452, 8625, 9177, 9622, 9985
* J: 293, 496
* time to max biclique: 21.7 sec
* overall run-time: 3.1 min


## random.m_5000_n_500_p_0.03
* name:	random.m_5000_n_500_p_0.03
* source: [random.m_5000_n_500_p_0.03.txt](random.m_5000_n_500_p_0.03.txt.7z)
* nodes: 5,000 x 500
* edges: 75,000
* density: 3.0%
* description: Fig.11_c
* max{degree(U)} (1 x |J|): 32
* max{degree(V)} (|I| x 1): 187
* max biclique (|I| x |J|): 32 = 16 x 2
* I: 245, 273, 327, 1244, 1268, 1497, 1610, 2279, 2417, 3273, 3457, 3563, 3635, 4723, 4813, 4957
* J: 233, 396
* time to max biclique: 2.5 sec
* overall run-time: 39.2 sec


## random.m_25000_n_500_p_0.03
* name:	random.m_25000_n_500_p_0.03
* source: [random.m_25000_n_500_p_0.03.txt](random.m_25000_n_500_p_0.03.txt.7z)
* nodes: 25,000 x 500
* edges: 375,000
* density: 3.0%
* description: Fig.11_c
* max{degree(U)} (1 x |J|): 33
* max{degree(V)} (|I| x 1): 828
* max biclique (|I| x |J|): 90 = 45 x 2
* I: 1011, 1055, 1082, 2082, 2245, 2355, 4751, 4874, 5332, 5433, 5543, 6110, 6645, 7256, 7575, 8322, 8432, 8491, 8504, 9214, 9788, 9820, 11285, 11357, 11869, 13770, 14034, 14698, 14830, 15163, 15260, 15707, 16237, 17214, 17235, 17841, 18383, 18763, 18825, 20178, 22558, 23093, 23094, 23432, 24901
* J: 202, 330
* time to max biclique: 588.0 msec
* overall run-time: 3.1 min


## random.m_50000_n_500_p_0.03
* name:	random.m_50000_n_500_p_0.03
* source: [random.m_50000_n_500_p_0.03.txt](random.m_50000_n_500_p_0.03.txt.7z)
* nodes: 50,000 x 500
* edges: 750,000
* density: 3.0%
* description: Fig.11_c
* max{degree(U)} (1 x |J|): 35
* max{degree(V)} (|I| x 1): 1,632
* max biclique (|I| x |J|): 150 = 75 x 2
* I: 482, 1364, 2338, 4191, 4268, 4903, 5527, 5703, 6271, 7329, 7430, 8416, 8823, 8854, 12198, 13159, 13477, 14357, 14398, 15649, 15901, 16626, 18207, 18438, 19698, 19993, 20220, 20339, 20640, 20910, 20926, 22321, 22862, 23055, 23552, 24431, 24739, 25318, 25758, 27690, 27912, 28172, 28468, 28474, 29025, 29097, 29943, 30286, 31460, 31514, 31974, 32277, 32529, 32682, 32950, 33488, 34704, 34732, 34800, 35941, 36529, 37047, 37183, 37734, 37821, 38918, 38932, 39621, 39986, 40776, 40832, 41148, 41481, 43293, 49448
* J: 221, 274
* time to max biclique: 18.1 sec
* overall run-time: 3.1 min


## random.m_100_n_100_r_0.2_p_0.2
* name:	random.m_100_n_100_r_0.2_p_0.2
* source: [random.m_100_n_100_r_0.2_p_0.2.txt](random.m_100_n_100_r_0.2_p_0.2.txt.7z)
* nodes: 100 x 100
* edges: 2,381
* density: 23.81%
* description: a random matrix of size 100 x 100 and density 0.2, with planted biclique of size 20 x 20
* max{degree(U)} (1 x |J|): 42
* max{degree(V)} (|I| x 1): 47
* max biclique (|I| x |J|): 400 = 20 x 20
* I: 0, 2, 10, 12, 19, 24, 27, 32, 35, 40, 42, 47, 59, 65, 69, 77, 79, 83, 93, 94
* J: 0, 21, 28, 32, 39, 43, 49, 50, 55, 56, 60, 61, 62, 68, 73, 87, 88, 97, 98, 99
* time to max biclique: 65.0 msec
* overall run-time: 136.0 msec


## random.m_100_n_100_r_0.2_p_0.5
* name:	random.m_100_n_100_r_0.2_p_0.5
* source: [random.m_100_n_100_r_0.2_p_0.5.txt](random.m_100_n_100_r_0.2_p_0.5.txt.7z)
* nodes: 100 x 100
* edges: 5,126
* density: 51.26%
* description: a random matrix of size 100 x 100 and density 0.5, with planted biclique of size 20 x 20
* max{degree(U)} (1 x |J|): 71
* max{degree(V)} (|I| x 1): 71
* max biclique (|I| x |J|): 400 = 20 x 20
* I: 0, 2, 7, 13, 19, 21, 22, 25, 28, 32, 48, 51, 66, 74, 80, 85, 87, 94, 96, 99
* J: 3, 13, 15, 16, 17, 21, 24, 29, 45, 53, 54, 67, 68, 71, 76, 77, 79, 80, 92, 97
* time to max biclique: 22.0 msec
* overall run-time: 15.0 sec


## random.m_100_n_100_r_0.2_p_0.8
* name:	random.m_100_n_100_r_0.2_p_0.8
* source: [random.m_100_n_100_r_0.2_p_0.8.txt](random.m_100_n_100_r_0.2_p_0.8.txt.7z)
* nodes: 100 x 100
* edges: 8,092
* density: 80.92%
* description: a random matrix of size 100 x 100 and density 0.8, with planted biclique of size 20 x 20
* max{degree(U)} (1 x |J|): 89
* max{degree(V)} (|I| x 1): 88
* max biclique (|I| x |J|): 456 = 24 x 19
* I: 3, 4, 5, 10, 14, 15, 17, 24, 34, 35, 36, 40, 42, 49, 54, 58, 61, 64, 65, 68, 69, 73, 90, 91
* J: 8, 10, 11, 30, 37, 41, 43, 45, 56, 67, 71, 72, 77, 80, 87, 89, 92, 98, 99
* time to max biclique: 1.6 hour
* overall run-time: 4.5 hour


## random.m_100_n_100_r_0.5_p_0.2
* name:	random.m_100_n_100_r_0.5_p_0.2
* source: [random.m_100_n_100_r_0.5_p_0.2.txt](random.m_100_n_100_r_0.5_p_0.2.txt.7z)
* nodes: 100 x 100
* edges: 4,008
* density: 40.08%
* description: a random matrix of size 100 x 100 and density 0.2, with planted biclique of size 50 x 50
* max{degree(U)} (1 x |J|): 66
* max{degree(V)} (|I| x 1): 70
* max biclique (|I| x |J|): 2,500 = 50 x 50
* I: 0, 1, 3, 5, 6, 8, 10, 12, 13, 14, 15, 17, 18, 19, 22, 24, 25, 27, 28, 31, 33, 36, 38, 39, 42, 43, 45, 46, 47, 48, 54, 55, 59, 60, 64, 65, 70, 72, 74, 75, 77, 80, 81, 85, 86, 87, 91, 92, 97, 98
* J: 0, 7, 8, 9, 11, 13, 15, 18, 19, 21, 23, 24, 25, 27, 29, 30, 33, 35, 37, 38, 42, 47, 50, 51, 52, 55, 56, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 69, 70, 73, 74, 75, 77, 79, 84, 91, 92, 96, 98, 99
* time to max biclique: 16.0 msec
* overall run-time: 38.0 msec


## random.m_100_n_100_r_0.5_p_0.5
* name:	random.m_100_n_100_r_0.5_p_0.5
* source: [random.m_100_n_100_r_0.5_p_0.5.txt](random.m_100_n_100_r_0.5_p_0.5.txt.7z)
* nodes: 100 x 100
* edges: 6,208
* density: 62.08%
* description: a random matrix of size 100 x 100 and density 0.5, with planted biclique of size 50 x 50
* max{degree(U)} (1 x |J|): 81
* max{degree(V)} (|I| x 1): 83
* max biclique (|I| x |J|): 2,500 = 50 x 50
* I: 0, 1, 2, 3, 4, 6, 8, 10, 11, 14, 16, 22, 26, 27, 28, 32, 33, 34, 35, 36, 37, 41, 43, 44, 45, 47, 50, 52, 57, 58, 61, 63, 64, 66, 68, 69, 72, 75, 77, 78, 79, 83, 85, 87, 90, 91, 92, 93, 94, 95
* J: 0, 2, 4, 5, 6, 7, 12, 14, 19, 21, 22, 23, 24, 25, 26, 29, 32, 37, 38, 40, 42, 43, 44, 45, 47, 48, 50, 51, 53, 58, 59, 60, 61, 62, 63, 64, 66, 69, 73, 76, 83, 84, 85, 88, 89, 91, 94, 95, 97, 99
* time to max biclique: 11.0 msec
* overall run-time: 21.0 sec


## random.m_100_n_100_r_0.5_p_0.8
* name:	random.m_100_n_100_r_0.5_p_0.8
* source: [random.m_100_n_100_r_0.5_p_0.8.txt](random.m_100_n_100_r_0.5_p_0.8.txt.7z)
* nodes: 100 x 100
* edges: 8,456
* density: 84.56%
* description: a random matrix of size 100 x 100 and density 0.8, with planted biclique of size 50 x 50
* max{degree(U)} (1 x |J|): 98
* max{degree(V)} (|I| x 1): 96
* max biclique (|I| x |J|): 2,500 = 50 x 50
* I: 0, 3, 4, 9, 12, 13, 14, 15, 16, 21, 24, 26, 27, 28, 32, 34, 37, 40, 41, 42, 45, 46, 48, 49, 51, 54, 56, 61, 64, 66, 67, 69, 70, 71, 72, 74, 76, 77, 78, 80, 81, 82, 83, 84, 86, 88, 91, 94, 95, 98
* J: 0, 3, 4, 5, 6, 8, 11, 12, 13, 16, 17, 20, 21, 24, 26, 30, 31, 32, 33, 34, 37, 38, 39, 40, 41, 42, 48, 50, 51, 55, 56, 58, 60, 61, 62, 63, 70, 72, 76, 79, 80, 83, 86, 90, 91, 92, 93, 94, 96, 99
* time to max biclique: 45.0 msec
* overall run-time: 21.2 sec


## random.m_100_n_100_r_0.8_p_0.2
* name:	random.m_100_n_100_r_0.8_p_0.2
* source: [random.m_100_n_100_r_0.8_p_0.2.txt](random.m_100_n_100_r_0.8_p_0.2.txt.7z)
* nodes: 100 x 100
* edges: 7,127
* density: 71.27%
* description: a random matrix of size 100 x 100 and density 0.2, with planted biclique of size 80 x 80
* max{degree(U)} (1 x |J|): 87
* max{degree(V)} (|I| x 1): 89
* max biclique (|I| x |J|): 6,400 = 80 x 80
* I: 0, 1, 2, 4, 5, 6, 7, 9, 10, 11, 14, 15, 16, 17, 19, 20, 23, 24, 25, 26, 27, 29, 30, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 45, 46, 48, 49, 50, 51, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 65, 66, 67, 68, 69, 70, 72, 73, 74, 76, 77, 78, 79, 80, 81, 82, 83, 85, 86, 87, 88, 89, 91, 92, 93, 94, 97, 98, 99
* J: 0, 1, 3, 4, 5, 6, 7, 8, 9, 11, 12, 13, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 26, 27, 28, 29, 30, 31, 32, 33, 36, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 55, 56, 57, 59, 60, 66, 67, 68, 69, 70, 72, 73, 74, 75, 77, 78, 79, 80, 81, 82, 83, 84, 87, 88, 89, 91, 92, 93, 95, 96, 97, 98, 99
* time to max biclique: 56.0 msec
* overall run-time: 68.0 msec


## random.m_100_n_100_r_0.8_p_0.5
* name:	random.m_100_n_100_r_0.8_p_0.5
* source: [random.m_100_n_100_r_0.8_p_0.5.txt](random.m_100_n_100_r_0.8_p_0.5.txt.7z)
* nodes: 100 x 100
* edges: 8,236
* density: 82.36%
* description: a random matrix of size 100 x 100 and density 0.5, with planted biclique of size 80 x 80
* max{degree(U)} (1 x |J|): 94
* max{degree(V)} (|I| x 1): 94
* max biclique (|I| x |J|): 6,400 = 80 x 80
* I: 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 11, 12, 14, 16, 17, 18, 19, 20, 22, 23, 25, 26, 28, 30, 33, 34, 35, 36, 37, 39, 40, 41, 42, 43, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 65, 66, 67, 68, 69, 70, 71, 75, 76, 77, 78, 79, 82, 83, 84, 86, 87, 88, 90, 92, 93, 94, 95, 96, 97, 98, 99
* J: 0, 1, 2, 3, 4, 6, 7, 8, 9, 10, 11, 12, 14, 15, 16, 18, 19, 20, 21, 22, 23, 24, 25, 27, 28, 30, 31, 32, 33, 34, 35, 37, 38, 40, 41, 42, 44, 45, 46, 47, 48, 49, 50, 51, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 77, 78, 79, 81, 84, 88, 90, 91, 92, 93, 95, 97, 98
* time to max biclique: 14.0 msec
* overall run-time: 125.0 msec


## random.m_100_n_100_r_0.8_p_0.8
* name:	random.m_100_n_100_r_0.8_p_0.8
* source: [random.m_100_n_100_r_0.8_p_0.8.txt](random.m_100_n_100_r_0.8_p_0.8.txt.7z)
* nodes: 100 x 100
* edges: 9,277
* density: 92.77%
* description: a random matrix of size 100 x 100 and density 0.8, with planted biclique of size 80 x 80
* max{degree(U)} (1 x |J|): 100
* max{degree(V)} (|I| x 1): 100
* max biclique (|I| x |J|): 6,400 = 80 x 80
* I: 0, 3, 4, 5, 6, 7, 9, 10, 13, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 38, 40, 41, 43, 44, 45, 46, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 63, 64, 65, 67, 70, 72, 73, 74, 75, 77, 78, 79, 82, 83, 84, 85, 86, 87, 88, 89, 90, 91, 92, 93, 94, 95, 96, 97, 98, 99
* J: 0, 1, 2, 3, 4, 5, 8, 9, 10, 11, 12, 14, 15, 16, 18, 19, 20, 21, 22, 23, 24, 25, 28, 29, 30, 31, 32, 33, 34, 35, 37, 38, 39, 40, 41, 43, 44, 45, 46, 47, 48, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 61, 62, 63, 64, 65, 66, 67, 68, 69, 71, 72, 73, 75, 76, 77, 80, 81, 82, 83, 85, 87, 90, 92, 93, 94, 95, 96, 97, 98
* time to max biclique: 18.0 msec
* overall run-time: 21.0 sec

