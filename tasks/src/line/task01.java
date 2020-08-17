package line;

public class task01 {
    public static void main(String[] args) {
        double a = 2;
        double b = 3;
        double c = 1;

        System.out.println(functionTask1(a, b, c));


    }

    public static double functionTask1(double a, double b, double c){
        double z;
        z = ((a - 3) * b / 2)+ c;
        return z;
    }
}
