package Section8;

public class Exercise3 {
    public static void main(String[] args) {
        double numbers [] = {34.5,67.90,567.78,76.54,896.56};
        double result = 0;

        for (double e: numbers) {
            result+=e;
        }
        System.out.format("Here's the sum: %.2f\n",result);
        System.out.format("Here's the average: %.2f\n",(result/numbers.length));

    }
}
