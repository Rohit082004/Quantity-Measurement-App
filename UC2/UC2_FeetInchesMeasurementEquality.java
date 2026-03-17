package UC2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class UC2_FeetInchesMeasurementEquality {
    public static class Feet{
        private final double v;

        Feet(double v){
            this.v=v;
        }

        @Override
        public boolean equals(Object obj){
            if(this == obj) return true;

            if(obj == null) return false;

            if(getClass() != obj.getClass()) return false;

            Feet f = (Feet) obj;
            return Double.compare(this.v, f.v) == 0;
        }
    }

    public static class Inches{
        private final double v;

        Inches(double v){
            this.v=v;
        }

        @Override
        public boolean equals(Object obj){
            if(this == obj) return true;

            if(obj == null) return false;

            if(getClass() != obj.getClass()) return false;

            Inches i = (Inches) obj;
            return Double.compare(this.v, i.v) == 0;
        }
    }

    public static void demonstrateFeetEquality(double v1, double v2){
        Feet f1 = new Feet(v1);
        Feet f2 = new Feet(v2);

        if(f1.equals(f2)){
            System.out.println("Both values are equal");
        }
        else{
            System.out.println("Values are not equal");
        }
    }

    public static void demonstrateInchesEquality(double v1, double v2){
        Inches i1 = new Inches(v1);
        Inches i2 = new Inches(v2);

        if(i1.equals(i2)){
            System.out.println("Both values are equal");
        }
        else{
            System.out.println("Values are not equal");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try{
            double a = sc.nextDouble();
            double b = sc.nextDouble();

            char check = sc.next().charAt(0);

            switch (check){
                case 'f':
                    demonstrateFeetEquality(a, b);
                    break;

                case 'i':
                    demonstrateInchesEquality(a, b);
                    break;

                default:
                    System.out.println("Invalid comparison");
                    break;
            }
        }
        catch (InputMismatchException e){
            System.out.println("Enter only numeric value");
        }
    }
}
