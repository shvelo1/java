package Jaba_shvelidze;
import Jaba_shvelidze.CalculatorService;
public class Main {

    public static void main(String[] args) {
        double a;
        double b;
        a=3;
        b=8;
        CalculatorService dsum= new CalculatorService();
        double c=dsum.sum(a,b);
        System.out.println(c);
        c=dsum.divide(a, b);
        System.out.println(c);
    }
}
