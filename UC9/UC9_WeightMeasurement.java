package UC9;

public class UC9_WeightMeasurement {
    public static boolean demonstrateLengthEquality(Length l1, Length l2){
        return l1.equals(l2);
    }

    public static boolean demonstrateLengthComparison(double v1, LengthUnit unit1, double v2, LengthUnit unit2){
        Length l1 = new Length(v1, unit1);
        Length l2 = new Length(v2, unit2);

        return demonstrateLengthEquality(l1, l2);
    }

    public static Length demonstrateLengthConversion(double v, LengthUnit fromUnit, LengthUnit toUnit){
        Length l = new Length(v, fromUnit);

        return l.convertTo(toUnit);
    }

    public static Length demonstrateLengthConversion(Length l, LengthUnit toUnit){
        return l.convertTo(toUnit);
    }

    public static Length demonstrateLengthAddition(Length l1, Length l2){
        return l1.add(l2);
    }

    public static Length demonstrateLengthAddition(Length l1, Length l2, LengthUnit targetUnit){
        return l1.add(l2, targetUnit);
    }

    public static boolean demonstrateWeightEquality(Weight w1, Weight w2){
        return w1.equals(w2);
    }

    public static boolean demonstrateWeightComparison(double v1, WeightUnit unit1, double v2, WeightUnit unit2){
            Weight w1 = new Weight(v1, unit1);
            Weight w2 = new Weight(v2, unit2);

            return demonstrateWeightEquality(w1, w2);
    }

    public static Weight demonstrateWeightConversion(double v, WeightUnit fromUnit, WeightUnit toUnit){
        Weight w = new Weight(v, fromUnit);

        return w.convertTo(toUnit);
    }

    public static Weight demonstrateWeightConversion(Weight w, WeightUnit toUnit){
        return w.convertTo(toUnit);
    }

    public static Weight demonstrateWeightAddition(Weight w1, Weight w2){
        return w1.add(w2);
    }

    public static Weight demonstrateWeightAddition(Weight w1, Weight w2, WeightUnit targetUnit){
        return w1.add(w2, targetUnit);
    }

    public static void main(String[] args) {
        Weight w1 = new Weight(1, WeightUnit.KILOGRAM);
        Weight w2 = new Weight(1500, WeightUnit.GRAM);

        System.out.println("Equality = " + demonstrateWeightEquality(w1, w2));

        System.out.println("Comparison = " + demonstrateWeightComparison(1, WeightUnit.KILOGRAM, 1000, WeightUnit.TONNE));

        System.out.println("Conversion = " + demonstrateWeightConversion(10, WeightUnit.TONNE, WeightUnit.POUND));

        System.out.println("Conversion = " + demonstrateWeightConversion(w1, WeightUnit.MILLIGRAM));

        System.out.println("Addition = " + demonstrateWeightAddition(w1 , w2));

        System.out.println("Addition = " + demonstrateWeightAddition(w1, w2, WeightUnit.POUND));
    }
}
