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
public class Main {
    
    public static void main(String[] args) {
        
        KmeansCluster kmeans = new KmeansCluster();
        
        int[] DataSet = {1,2,3,43,56,78,99,8,6,22};
        
        System.out.println(Arrays.toString(DataSet));
        
        kmeans.clusteringDataInput(DataSet, 0, 0);
        
    }
    
}
