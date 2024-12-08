import java.util.Objects;

public class BuildingBlock {
    private String material;
    private String color;
    private int hardness;
    private double weight;
    private String type;

    public BuildingBlock(String material, String color, int hardness, double weight, String type) {
        this.material = material;
        this.color = color;
        this.hardness = hardness;
        this.weight = weight;
        this.type = type;
    }

    public String getMaterial() { return material; }
    public void setMaterial(String material) { this.material = material; }
    public String getColor() { return color; }
    public void setColor(String color) { this.color = color; }
    public int getHardness() { return hardness; }
    public void setHardness(int hardness) { this.hardness = hardness; }
    public double getWeight() { return weight; }
    public void setWeight(double weight) { this.weight = weight; }
    public String getType() { return type; }
    public void setType(String type) { this.type = type; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BuildingBlock that = (BuildingBlock) o;
        return hardness == that.hardness &&
                Double.compare(that.weight, weight) == 0 &&
                Objects.equals(material, that.material) &&
                Objects.equals(color, that.color) &&
                Objects.equals(type, that.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(material, color, hardness, weight, type);
    }

    @Override
    public String toString() {
        return "BuildingBlock{" +
                "material='" + material + '\'' +
                ", color='" + color + '\'' +
                ", hardness=" + hardness +
                ", weight=" + weight +
                ", type='" + type + '\'' +
                '}';
    }
}
