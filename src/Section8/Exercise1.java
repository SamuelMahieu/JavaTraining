package Section8;

public class Exercise1 {
    public static void main(String[] args) {
        int range [] = {4,8,15,16,23,42,67,89,65,45};

        for (int e: range) {
            System.out.println(e);
        }
        System.out.println("-------------------");
        for (int i=0;i<=range.length-1;i++){
            System.out.println(range[i]);
        }
    }
}
