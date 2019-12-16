
# Introduction 
The class RandomBipartiteGraph contains the following two static functions for generating random bipartite graphs: 
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

The datasets reflects the datasets used in the paper [_On finding bicliques in bipartite graphs: a novel algorithm and its application to the integration of diverse biological data types_](https://github.com/shahamer/maximum-biclique-benchmark#references): three datasets for each of the following figures: Fig.8, Fig.9, Fig.11_a, Fig.11_b, and Fig.11_c. 


## random.m_10000_n_1000_p_0.02
* name:	random.m_10000_n_1000_p_0.02
* source: random.m_10000_n_1000_p_0.02.txt
* nodes: 10,000 x 1,000
* edges: 199,988
* density: 2%
* description: Fig.8
* max{degree(U)} (1 x |J|): 41
* max{degree(V)} (|I| x 1): 242
* max biclique (|I| x |J|): 32 = 16 x 2
* time to max biclique: 2.8 sec
* overall run-time: 19.9 sec
* |I| = :: 612, 1067, 1747, 2369, 2606, 3963, 4148, 4410, 4432, 4495, 6512, 7567, 8526, 8928, 9429, 9815
* |J| = :: 10, 143


## random.m_10000_n_5000_p_0.02
* name:	random.m_10000_n_5000_p_0.02
* source: random.m_10000_n_5000_p_0.02.txt
* nodes: 10,000 x 5,000
* edges: 999,915
* density: 2%
* description: Fig.8
* max{degree(U)} (1 x |J|): 139
* max{degree(V)} (|I| x 1): 252
* max biclique (|I| x |J|): 36 = 18 x 2
* time to max biclique: 2.0 min
* overall run-time: 55.6 min
* |I| = :: 483, 1120, 1128, 1242, 1660, 1980, 2162, 3103, 4144, 5340, 5554, 6435, 7470, 7988, 8860, 9267, 9549, 9806
* |J| = :: 3288, 4416


## random.m_10000_n_10000_p_0.02
* name:	random.m_10000_n_10000_p_0.02
* source: random.m_10000_n_10000_p_0.02.txt
* nodes: 10,000 x 10,000
* edges: 1,999,824
* density: 2%
* description: Fig.8
* max{degree(U)} (1 x |J|): 256
* max{degree(V)} (|I| x 1): 254
* max biclique (|I| x |J|): 38 = 2 x 19
* time to max biclique: 2.9 min
* overall run-time: 14.0 hour
* |I| = :: 379, 4734
* |J| = :: 7, 558, 1505, 1990, 2963, 3949, 4097, 4206, 4590, 6169, 6927, 6968, 7564, 8272, 9181, 9489, 9747, 9846, 9972


## random.m_10000_n_1000_p_0.045_cv_0.3
* name:	random.m_10000_n_1000_p_0.045_cv_0.3
* source: random.m_10000_n_1000_p_0.045_cv_0.3.txt
* nodes: 9,992 x 1,000
* edges: 450,000
* density: 4.5%
* description: Fig.9
* max{degree(U)} (1 x |J|): 94
* max{degree(V)} (|I| x 1): 518
* max biclique (|I| x |J|): 96 = 48 x 2
* time to max biclique: 9.9 sec
* overall run-time: 3.1 min
* |I| = :: 118, 338, 890, 1373, 1387, 1412, 1418, 1450, 1515, 1593, 1596, 1713, 2583, 2786, 2881, 2897, 2924, 2994, 3270, 3501, 3840, 3932, 4113, 4515, 4558, 4866, 5218, 5580, 5753, 6024, 6471, 7084, 7237, 7424, 7470, 7613, 7614, 7789, 7861, 7974, 8006, 8150, 8457, 8808, 9246, 9863, 9898, 9976
* |J| = :: 61, 135



## random.m_10000_n_1000_p_0.045_cv_0.8
* name:	random.m_10000_n_1000_p_0.045_cv_0.8
* source: random.m_10000_n_1000_p_0.045_cv_0.8.txt
* nodes: 8,928 x 1,000
* edges: 468,268
* density: 5.245%
* description: Fig.9
* max{degree(U)} (1 x |J|): 174
* max{degree(V)} (|I| x 1): 536
* max biclique (|I| x |J|): 128 = 64 x 2
* time to max biclique: 3.5 min
* overall run-time: 18.4 min
* |I| = :: 86, 259, 423, 458, 467, 956, 1137, 1717, 1878, 1995, 2179, 2521, 2573, 2651, 2652, 2728, 2805, 2877, 3017, 3372, 3409, 3431, 3437, 3566, 3577, 3738, 3776, 4113, 4147, 4209, 4285, 4321, 4435, 4813, 4887, 5259, 5339, 5546, 5573, 5710, 5867, 6009, 6105, 6256, 6405, 6760, 6811, 6989, 7033, 7063, 7068, 7111, 7987, 8218, 8471, 8649, 8672, 8689, 8852, 8971, 9118, 9175, 9473, 9857
* |J| = :: 508, 535


## random.m_10000_n_1000_p_0.045_cv_1.3
* name:	random.m_10000_n_1000_p_0.045_cv_1.3
* source: random.m_10000_n_1000_p_0.045_cv_1.3.txt
* nodes: 7,781 x 1,000
* edges: 521,964
* density: 6.7%
* description: Fig.9
* max{degree(U)} (1 x |J|): 262
* max{degree(V)} (|I| x 1): 589
* max biclique (|I| x |J|): 170 = 85 x 2
* time to max biclique: 9.4 sec
* overall run-time: 2.8 hour
* |I| = :: 39, 278, 377, 400, 663, 679, 728, 905, 1241, 1282, 1925, 2366, 2375, 2511, 2604, 2635, 2677, 2684, 2785, 2840, 2894, 3002, 3395, 3452, 3493, 3523, 3601, 3694, 3876, 3959, 4110, 4467, 4682, 4723, 4729, 4806, 4896, 4963, 4995, 5115, 5173, 5200, 5383, 5390, 5394, 5447, 5537, 5544, 5709, 5878, 6050, 6198, 6376, 6465, 6724, 6770, 6806, 7005, 7014, 7221, 7387, 7418, 7443, 7513, 7606, 7641, 7989, 8099, 8423, 8519, 8603, 8641, 8666, 8797, 8826, 8981, 9009, 9019, 9382, 9476, 9543, 9588, 9792, 9804, 9837
* |J| = :: 519, 777



## random.m_300_n_300_p_0.1
* name:	random.m_300_n_300_p_0.1
* source: random.m_300_n_300_p_0.1.txt
* nodes: 300 x 300
* edges: 8,969
* density: 9.965%
* description: Fig.11_a
* max{degree(U)} (1 x |J|): 46
* max{degree(V)} (|I| x 1): 44
* max biclique (|I| x |J|): 26 = 13 x 2
* time to max biclique: 95.0 msec
* overall run-time: 1.5 sec
* |I| = :: 24, 63, 136, 147, 156, 158, 191, 194, 236, 239, 241, 253, 271
* |J| = :: 261, 275




## random.m_300_n_300_p_0.2
* name:	random.m_300_n_300_p_0.2
* source: random.m_300_n_300_p_0.2.txt
* nodes: 300 x 300
* edges: 17,937
* density: 19.93%
* description: Fig.11_a
* max{degree(U)} (1 x |J|): 80
* max{degree(V)} (|I| x 1): 82
* max biclique (|I| x |J|): 58 = 29 x 2
* time to max biclique: 786.0 msec
* overall run-time: 14.9 sec
* |I| = :: 4, 5, 12, 20, 28, 46, 60, 71, 85, 104, 120, 138, 139, 145, 149, 165, 178, 195, 199, 203, 204, 218, 227, 228, 229, 237, 264, 278, 291
* |J| = :: 122, 236




## random.m_300_n_300_p_0.3
* name:	random.m_300_n_300_p_0.3
* source: random.m_300_n_300_p_0.3.txt
* nodes: 300 x 300
* edges: 26,903
* density: 29.89%
* description: Fig.11_a
* max{degree(U)} (1 x |J|): 114
* max{degree(V)} (|I| x 1): 113
* max biclique (|I| x |J|): 110 = 2 x 55
* time to max biclique: 405.0 msec
* overall run-time: 3.4 min
* |I| = :: 19, 92
* |J| = :: 0, 3, 16, 28, 42, 43, 48, 52, 55, 59, 60, 64, 83, 84, 95, 104, 106, 108, 110, 127, 129, 130, 136, 137, 143, 144, 147, 152, 156, 170, 177, 178, 190, 196, 197, 204, 205, 210, 213, 221, 227, 232, 235, 240, 243, 247, 252, 254, 275, 278, 286, 290, 291, 294, 296



## random.m_10000_n_100_p_0.03
* name:	random.m_10000_n_100_p_0.03
* source: random.m_10000_n_100_p_0.03.txt
* nodes: 9,513 x 100
* edges: 29,998
* density: 3.15%
* description: Fig.11_b
* max{degree(U)} (1 x |J|): 12
* max{degree(V)} (|I| x 1): 358
* max biclique (|I| x |J|): 44 = 22 x 2
* time to max biclique: 400.0 msec
* overall run-time: 708.0 msec
* |I| = :: 59, 449, 1593, 1775, 2112, 2666, 2765, 2817, 3812, 5460, 5696, 6158, 7191, 7203, 7382, 7551, 7720, 7818, 8521, 8568, 9421, 9554
* |J| = :: 5, 99



## random.m_10000_n_500_p_0.03
* name:	random.m_10000_n_500_p_0.03
* source: random.m_10000_n_500_p_0.03.txt
* nodes: 10,000 x 500
* edges: 149,991
* density: 3%
* description: Fig.11_b
* max{degree(U)} (1 x |J|): 33
* max{degree(V)} (|I| x 1): 352
* max biclique (|I| x |J|): 50 = 25 x 2
* time to max biclique: 2.0 sec
* overall run-time: 4.4 sec
* |I| = :: 495, 586, 660, 916, 1535, 1540, 1823, 1924, 2221, 2372, 2479, 2737, 2740, 5356, 5493, 6122, 6801, 6844, 6977, 7765, 7920, 8596, 9114, 9365, 9922
* |J| = :: 238, 479



## random.m_10000_n_1000_p_0.03
* name:	random.m_10000_n_1000_p_0.03
* source: random.m_10000_n_1000_p_0.03.txt
* nodes: 10,000 x 1,000
* edges: 299,970
* density: 3%
* description: Fig.11_b
* max{degree(U)} (1 x |J|): 53 
* max{degree(V)} (|I| x 1): 350
* max biclique (|I| x |J|): 52 = 26 x 2
* time to max biclique: 12.3 sec
* overall run-time: 1.5 min
* |I| = :: 579, 2248, 2611, 2677, 3713, 3793, 4110, 4334, 4525, 4780, 4940, 5170, 5500, 6170, 7117, 7134, 7139, 7286, 7548, 7938, 8187, 8452, 8625, 9177, 9622, 9985
* |J| = :: 293, 496



## random.m_5000_n_500_p_0.03
* name:	random.m_5000_n_500_p_0.03
* source: random.m_5000_n_500_p_0.03.txt
* nodes: 5,000 x 500
* edges: 74,980
* density: 3%
* description: Fig.11_c
* max{degree(U)} (1 x |J|): 32
* max{degree(V)} (|I| x 1): 187
* max biclique (|I| x |J|): 32 = 16 x 2
* time to max biclique: 1.0 sec
* overall run-time: 2.6 sec
* |I| = :: 245, 273, 327, 1244, 1268, 1497, 1610, 2279, 2417, 3273, 3457, 3563, 3635, 4723, 4813, 4957
* |J| = :: 233, 396



## random.m_25000_n_500_p_0.03
* name:	random.m_25000_n_500_p_0.03
* source: random.m_25000_n_500_p_0.03.txt
* nodes: 25,000 x 500
* edges: 374,992
* density: 3%
* description: Fig.11_c
* max{degree(U)} (1 x |J|): 33
* max{degree(V)} (|I| x 1): 828
* max biclique (|I| x |J|): 90 = 45 x 2
* time to max biclique: 1.7 sec
* overall run-time: 11.1 sec
* |I| = :: 1011, 1055, 1082, 2082, 2245, 2355, 4751, 4874, 5332, 5433, 5543, 6110, 6645, 7256, 7575, 8322, 8432, 8491, 8504, 9214, 9788, 9820, 11285, 11357, 11869, 13770, 14034, 14698, 14830, 15163, 15260, 15707, 16237, 17214, 17235, 17841, 18383, 18763, 18825, 20178, 22558, 23093, 23094, 23432, 24901
* |J| = :: 202, 330




## random.m_50000_n_500_p_0.03
* name:	random.m_50000_n_500_p_0.03
* source: random.m_50000_n_500_p_0.03.txt
* nodes: 50,000 x 500
* edges: 749,983
* density: 3%
* description: Fig.11_c
* max{degree(U)} (1 x |J|): 35
* max{degree(V)} (|I| x 1): 1,632
* max biclique (|I| x |J|): 150 = 75 x 2
* time to max biclique: 4.5 sec
* overall run-time: 12.7 sec
* |I| = :: 482, 1364, 2338, 4191, 4268, 4903, 5527, 5703, 6271, 7329, 7430, 8416, 8823, 8854, 12198, 13159, 13477, 14357, 14398, 15649, 15901, 16626, 18207, 18438, 19698, 19993, 20220, 20339, 20640, 20910, 20926, 22321, 22862, 23055, 23552, 24431, 24739, 25318, 25758, 27690, 27912, 28172, 28468, 28474, 29025, 29097, 29943, 30286, 31460, 31514, 31974, 32277, 32529, 32682, 32950, 33488, 34704, 34732, 34800, 35941, 36529, 37047, 37183, 37734, 37821, 38918, 38932, 39621, 39986, 40776, 40832, 41148, 41481, 43293, 49448
* |J| = :: 221, 274




