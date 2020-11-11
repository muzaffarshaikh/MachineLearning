package perceptron;

public class Perceptron {

    double[] weights;
    double threshold;

    public void Train(double[][] inputs, int[] outputs, double we1, double we2, double threshold, double lrate,
            int epoch) {

        this.threshold = threshold;
        int n = inputs[0].length;
        int p = outputs.length;
        weights = new double[n];

        // initialize weights
        weights[0] = we1;
        weights[1] = we2;

        for (int i = 0; i < epoch; i++) {
            int totalError = 0;
            for (int j = 0; j < p; j++) {
                int output = Output(inputs[j]);

                int error = outputs[j] - output;

                totalError += error;

                for (int k = 0; k < n; k++) {
                    double delta = lrate * inputs[j][k] * error;
                    weights[k] += delta;
                    // System.out.println(+totalError + "" + delta + "");
                }

            }
            if (totalError == 0) {
                break;
            }
        }

    }

    public int Output(double[] input) {
        double sum = 0.0;

        for (int i = 0; i < input.length; i++) {
            sum += weights[i] * input[i] + threshold;
        }

        if (sum > 0) {
            return 1;
        } else {
            return 0;
        }
    }

}
