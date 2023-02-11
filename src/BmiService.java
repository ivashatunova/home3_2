public class BmiService {
    public int calculate(double heightM, int weightKq) {
        int BmiIndex = (int) (weightKq / (heightM * heightM));
        return BmiIndex;
    }
}
