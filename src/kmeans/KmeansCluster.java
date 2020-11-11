/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kmeans;

import java.util.Arrays;

/**
 *
 * @author Muzaffar
 */
public class KmeansCluster {

    public void clusteringDataInput(int initialDataSet[], int centroid1, int centroid2) {
        int dataSetLength = initialDataSet.length;
        boolean flag;
        int n = 0, i, a, b;
        a = centroid1;
        b = centroid2;
        float varCentroid1 = a;
        float varCentroid2 = b;

        int cluster1[] = new int[dataSetLength], cluster2[] = new int[dataSetLength];
        do {
            varCentroid1 = 0;
            varCentroid2 = 0;
            cluster1 = new int[dataSetLength];
            cluster2 = new int[dataSetLength];
            n++;
            int k = 0, j = 0;
            for (i = 0; i < dataSetLength; i++) {
                if (Math.abs(initialDataSet[i] - centroid1) <= Math.abs(initialDataSet[i] - centroid2)) {
                    cluster1[k] = initialDataSet[i];
                    k++;
                } else {
                    cluster2[j] = initialDataSet[i];
                    j++;
                }
            }
            for (i = 0; i < k; i++) {
                varCentroid1 = varCentroid1 + cluster1[i];
            }
            for (i = 0; i < j; i++) {
                varCentroid2 = varCentroid2 + cluster2[i];
            }
            System.out.println("Centroid 1 = " + centroid1 + "   Centroid 2 = " + centroid2+"\n");
            a = centroid1;
            b = centroid2;
            centroid1 = Math.round(varCentroid1 / k);
            centroid2 = Math.round(varCentroid2 / j);
            flag = !(centroid1 == a && centroid2 == b);

            System.out.println("After Iteration " + n + " : ");
            System.out.println("Cluster 1 : " + Arrays.toString(cluster1));
            System.out.println("Cluster 2 : " + Arrays.toString(cluster2));

        } while (flag);

        System.out.println("\n----------------------------------------------------\n");
        System.out.println("Final Cluster 1 : " + Arrays.toString(cluster1));
        System.out.println("Final Cluster 2 : " + Arrays.toString(cluster2));
        
        System.out.println("\n");

    }

    public static void PrintingOutput() {

    }
}
