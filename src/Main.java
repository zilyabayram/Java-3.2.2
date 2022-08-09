public class Main {
    public static void main(String[] args) {
        BMIService service = new BMIService();
        double myBMI = service.calculate(55, 1.63);

        double m; // масса тела в килограммах
        double h; // рост в метрах

        System.out.println("Индекс массы тела:" + myBMI);

    }

}
