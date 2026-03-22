package UC9;

public class Weight {
    private final double v;
    private final WeightUnit unit;

    public Weight(double v, WeightUnit unit){
        this.v=v;
        this.unit=unit;
    }

    public double getValue(){
        return v;
    }
    public WeightUnit getUnit(){
        return unit;
    }

    public Weight convertTo(WeightUnit targetUnit){
        double baseValue = this.getUnit().convertToBaseUnit(this.getValue());
        double convertedValue = targetUnit.convertFromBaseUnit(baseValue);

        convertedValue = Math.round(convertedValue * 100.0) / 100.0;

        return new Weight(convertedValue, targetUnit);
    }

    public Weight add(Weight w){
        return addAndConvert(w, this.getUnit());
    }

    public Weight add(Weight w, WeightUnit targetUnit){
        return addAndConvert(w, targetUnit);
    }

    private Weight addAndConvert(Weight w, WeightUnit targetUnit){
        double kg1 = this.getUnit().convertToBaseUnit(this.getValue());
        double kg2 = w.getUnit().convertToBaseUnit(w.getValue());

        double sum = kg1 + kg2;
        double ans = targetUnit.convertFromBaseUnit(sum);

        return new Weight(ans , targetUnit);
    }

    @Override
    public boolean equals(Object obj){
        if(this == obj) return true;
        if(obj == null || !(obj instanceof Weight)) return false;

        Weight w = (Weight) obj;

        return Double.compare(this.getUnit().convertToBaseUnit(this.getValue()), w.getUnit().convertToBaseUnit(w.getValue())) == 0;
    }

    @Override
    public int hashCode(){
        double baseValue = this.getUnit().convertToBaseUnit(this.v);
        long rounded = Math.round(baseValue * 100);
        return Long.hashCode(rounded);
    }

    @Override
    public String toString(){
        return String.format("%.2f %s", getValue(), getUnit());

    }
}
