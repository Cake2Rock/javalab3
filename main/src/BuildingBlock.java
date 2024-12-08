import java.util.Objects;

/**
 * Represents a building block with material, color, hardness, weight, and type.
 */
public class BuildingBlock {
    private String material;
    private String color;
    private int hardness;
    private double weight;
    private String type;

    /**
     * Constructs a new BuildingBlock.
     *
     * @param material the material of the block
     * @param color    the color of the block
     * @param hardness the hardness level of the block (1-10)
     * @param weight   the weight of the block in kilograms
     * @param type     the type of the block (e.g., "Decorative", "Building")
     */
    public BuildingBlock(String material, String color, int hardness, double weight, String type) {
        this.material = material;
        this.color = color;
        this.hardness = hardness;
        this.weight = weight;
        this.type = type;
    }

    // Getters for all fields
    public String getMaterial() { return material; }
    public String getColor() { return color; }
    public int getHardness() { return hardness; }
    public double getWeight() { return weight; }
    public String getType() { return type; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BuildingBlock that = (BuildingBlock) o;
        return hardness == that.hardness &&
                Math.abs(that.weight - weight) < 0.0001 && // Compare doubles with tolerance
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
