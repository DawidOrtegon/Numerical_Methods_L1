public class Zadanie_3
{
    public static void exponentialFunctionFix(double x)
    {
        double begin = 1;
        double e = begin;
        double ePrevious = 0;
        int i = 1;
        // DecimalFormat numberFormat = new DecimalFormat("0.00");

        while (e != ePrevious)
        {
            ePrevious = e;
            begin *= Math.abs(x)/i;
            e += begin;
            i++;

            if(x < 0)
            {
                e = 1/e;
            }
        }
        // System.out.println("The value of e at " + x + " is: " +numberFormat.format(e));
        System.out.println("The value of e at " + x + " is: " +e);

    }

}
