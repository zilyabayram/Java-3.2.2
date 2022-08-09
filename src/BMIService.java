public class BMIService {
    public static double pow(double value) {
        return value * value;
    }

    public double calculate(double m, double h) {
        double result;
        result = (double) (m / pow(h));
        return result;
    }

}
