import java.text.DecimalFormat;

public class Zadanie_1
{
    public static void calculatePolynomial()
    {
        float a = 1f;
        float b = 3000.001f;
        float c = 3f;
        float x1True = -0.001f;
        float x2True = -3000f;

        float delta = (float)((Math.pow(b,2))- (4 * a * c));
        float div = 2 * a;

        // Evaluation

        if (delta > 0)
        {
            float sol1 = (float)((-b + Math.sqrt(delta)) / div);
            float sol2 = (float)((-b - Math.sqrt(delta)) / div);

            float x1WithoutError = (float) ((-2 * c)/(b + Math.sqrt(delta)));
            float x2WithoutError = (float) ((-2 * c)/(b - Math.sqrt(delta)));

            // For the error values x1 and x2 with the normal formula.

            float error1X1 = Math.abs((x1True - sol1)/x1True) * 100;
            float error2X2 = Math.abs((x2True - sol2)/x2True) * 100;
            float error1X1WE = Math.abs((x1True - x1WithoutError)/x1True) * 100;
            float error2X2WE = Math.abs((x2True - x2WithoutError)/x2True) * 100;

            DecimalFormat formatResults = new DecimalFormat("0.000");

            System.out.println("Solution 1: " + "\t" + formatResults.format(sol1));
            System.out.println("Solution 2: " + "\t" + formatResults.format(sol2));
            System.out.println("X1 without the error:" + "\t" + formatResults.format(x1WithoutError));
            System.out.println("X2 without the error:" + "\t" + formatResults.format(x2WithoutError));
            System.out.println("Error %: " + "\t" + formatResults.format(error1X1));
            System.out.println("Error %: " + "\t" + formatResults.format(error2X2));
            System.out.println("Error % WE: " + "\t" + formatResults.format(error1X1WE));
            System.out.println("Error % WE: " + "\t" + formatResults.format(error2X2WE));
        }

    }

    public static void calculatePolynomialDouble()
    {
        double a = 1;
        double b = 3000.001;
        double c = 3;
        double x1True = -0.001;
        double x2True = -3000;

        double delta = ((Math.pow(b,2))- (4 * a * c));
        double div = 2 * a;

        // Evaluation

        if (delta > 0)
        {
            double sol1 = ((-b + Math.sqrt(delta)) / div);
            double sol2 = ((-b - Math.sqrt(delta)) / div);

            double x1WithoutError = ((-2 * c)/(b + Math.sqrt(delta)));
            double x2WithoutError = ((-2 * c)/(b - Math.sqrt(delta)));

            // For the error values x1 and x2 with the normal formula.

            double error1X1 = Math.abs((x1True - sol1)/x1True) * 100;
            double error2X2 = Math.abs((x2True - sol2)/x2True) * 100;
            double error1X1WE = Math.abs((x1True - x1WithoutError)/x1True) * 100;
            double error2X2WE = Math.abs((x2True - x2WithoutError)/x2True) * 100;

            DecimalFormat formatResults2 = new DecimalFormat("0.000");

            System.out.println("Solution 1: " + "\t" + formatResults2.format(sol1));
            System.out.println("Solution 2: " + "\t" + formatResults2.format(sol2));
            System.out.println("X1 without the error:" + "\t" + formatResults2.format(x1WithoutError));
            System.out.println("X2 without the error:" + "\t" + formatResults2.format(x2WithoutError));
            System.out.println("Error %: " + "\t" + formatResults2.format(error1X1));
            System.out.println("Error %: " + "\t" + formatResults2.format(error2X2));
            System.out.println("Error % WE: " + "\t" + formatResults2.format(error1X1WE));
            System.out.println("Error % WE: " + "\t" + formatResults2.format(error2X2WE));
        }

    }
}
