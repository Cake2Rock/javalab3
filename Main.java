import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        BuildingBlock[] blocks = {
            new BuildingBlock("Wood", "Brown", 3, 2.5, "Decorative"),
            new BuildingBlock("Stone", "Gray", 7, 5.0, "Building"),
            new BuildingBlock("Glass", "Transparent", 2, 3.0, "Decorative"),
            new BuildingBlock("Iron", "Silver", 9, 7.5, "Building"),
            new BuildingBlock("Brick", "Red", 6, 4.5, "Building")
        };

        Arrays.sort(blocks, Comparator
            .comparingInt(BuildingBlock::getHardness)
            .thenComparing(Comparator.comparingDouble(BuildingBlock::getWeight).reversed())
        );

        System.out.println("Відсортовані блоки:");
        for (BuildingBlock block : blocks) {
            System.out.println(block);
        }
    }
}
