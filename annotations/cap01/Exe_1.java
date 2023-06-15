package annotations.cap01;

public class Exe_1 {
    public static void main(String[] args) {

        double[] prices = new double[5];
        prices[0] = 1000000.00;
        prices[1] = 46000.00;
        prices[2] = 16000.00;
        prices[3] = 46000.00;
        prices[4] = 17000.00;

        int cheapPriceIndex = 0;

        for (int actual = 0 ; actual <= 4 ; actual ++) {
            if (prices[actual] < prices[cheapPriceIndex]) {
                cheapPriceIndex = actual;
            }
        }

        System.out.println("most cheap price is: " + prices[cheapPriceIndex]);
    }
}
