package UC1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class UC1_FeetMeasurementEquality {

    public static class Feet{
        private final double v;

        Feet(double v){
            this.v = v;
        }

        @Override
        public boolean equals(Object obj){
            if(this == obj) return true;

            if(obj == null) return false;

            if(getClass() != obj.getClass()) return false;

            Feet f = (Feet) obj;
            return Double.compare(this.v , f.v) == 0;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try{
            double v1 = sc.nextDouble();
            double v2 = sc.nextDouble();

            Feet q1 = new Feet(v1);
            Feet q2 = new Feet(v2);

            if(q1.equals((q2))) {
                System.out.println("Both values are equal");
            }
            else{
                System.out.println("Values are not equal");
            }
        }
        catch (InputMismatchException e){
            System.out.println("Enter numeric values only.");
        }
    }
}
