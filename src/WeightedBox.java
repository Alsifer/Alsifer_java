public class WeightedBox extends Box {

    private double weight;

    public WeightedBox(double width, double height, double depth, double weight) {
        super(width, height, depth);
        if (weight > 0) {
            this.weight = weight;
        }
    }

    public double getWeight() {
        return this.weight;
    }

    public double getDensity() {
        return this.weight / this.getVolume();
    }

    @Override
    public String toString() {
        return super.toString() + String.format("\nи массой = %.2f кг", this.weight);
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof WeightedBox)) {
            return false;
        }

        WeightedBox box = (WeightedBox) obj;

        if (this.weight != box.getWeight()) {
            return false;
        } else {
            return super.equals(obj);
        }
    }
}