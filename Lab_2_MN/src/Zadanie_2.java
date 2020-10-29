import java.text.DecimalFormat;

public class Zadanie_2
{
    public static void anotherFunctionFloat()
    {
        float x1 = 10000f;
        float x2 = 100000f;
        float x3 = 1000000f;

        float function1 = (float) Math.sqrt(Math.pow(x1,2) + 1) + x1;
        float function2 = (float) Math.sqrt(Math.pow(x2,2) + 1) + x2;
        float function3 = (float) Math.sqrt(Math.pow(x3,2) + 1) + x3;

        DecimalFormat formatResults = new DecimalFormat("0.000");

        System.out.println("f on 10000" + "\t" + formatResults.format(function1));
        System.out.println("f on 100000" + "\t" + formatResults.format(function2));
        System.out.println("f on 1000000" + "\t" + formatResults.format(function3));
    }

    public static void anotherFunctionDouble()
    {
        double x1 = 10000;
        double x2 = 100000;
        double x3 = 1000000;

        double function1 = Math.sqrt(Math.pow(x1,2) + 1) + x1;
        double function2 = Math.sqrt(Math.pow(x2,2) + 1) + x2;
        double function3 = Math.sqrt(Math.pow(x3,2) + 1) + x3;

        DecimalFormat formatResults = new DecimalFormat("0.000");

        System.out.println("f on 10000" + "\t" + formatResults.format(function1));
        System.out.println("f on 100000" + "\t" + formatResults.format(function2));
        System.out.println("f on 1000000" + "\t" + formatResults.format(function3));
    }

}
