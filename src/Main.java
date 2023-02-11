public class Main {

    public static void main(String[] args) {
        BmiService service = new BmiService();
        double heightM = 1.87;
        int weightKq = 98;
        int myBmiIndex = service.calculate(heightM, weightKq);
        System.out.println(myBmiIndex);

    }
}