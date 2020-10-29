public class Pruebas
{
        public static double mExp(double x){

            double term = 1.0;
            double y = term;
            double yOld;
            int i = 1;

            do{
                yOld = y;

                System.out.println(i-1 + " : " + term + " " + y );
                term *= Math.abs(x)/i;
                y+=term;

                if(x<0)
                {y = 1/y;}

                i++;
            }

            while (y != yOld);
            return y;
        }
}

