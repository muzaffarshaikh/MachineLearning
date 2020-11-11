package perceptron;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        Perceptron p = new Perceptron();
        Scanner in = new Scanner(System.in);
        
        double inputs[][] = {{0, 0}, {0, 1}, {1, 0}, {1, 1}};
        int outputs[] = {0, 1, 1, 1};
        
        System.out.println("Enter weight 1");
        double w1 = in.nextDouble();
        
        System.out.println("Enter weight 2");
        double w2 = in.nextDouble();
        
        System.out.println("Enter weight 0");
        double w0 = in.nextDouble();

        p.Train(inputs, outputs, w1, w2, w0, 0.1, 200);
        
        System.out.println(p.Output(new double[]{0, 0}));
        System.out.println(p.Output(new double[]{1, 0}));
        System.out.println(p.Output(new double[]{0, 1}));
        System.out.println(p.Output(new double[]{1, 1}));

    }

}
