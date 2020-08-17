public class Line {
    public static void main(String[] args) {
        double x = 555.101;
        int c = (int) x;
        System.out.println(x - (double)c);
    }

//Найдите  значение функции: z = ( (a – 3 ) * b / 2) + c
    public static double task01(double a, double b, double c){
        double z;
        z = ((a - 3) * b / 2)+ c;
        return z;
    }

    // 1, 2, 3 -> 0.25
    public static double task02(double a, double b, double c){
        double result;
        result = ((b + Math.sqrt(b*b + 4*a*c))/2*a) - a*a*a*c + Math.pow(b, -2);
        return result;
    }

    //1, 1 -> -7.15
    public static double task03(double x, double y){
        double result;
        result = ((Math.sin(x) + Math.cos(y)) / (Math.cos(x) - Math.sin(y))) * Math.tan(x*y);
        return result;
    }
    public static double task04(double a){
        double result;
        result = (a - ((int) a))*1000 + ((int) a) /1000;
        return result;
    }
}
