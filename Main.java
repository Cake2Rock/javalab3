import java.util.Arrays;
import java.util.Comparator;

/**
 * Demonstrates sorting and searching BuildingBlock objects.
 */
public class Main {
    public static void main(String[] args) {
        // Create an array of building blocks
        BuildingBlock[] blocks = {
            new BuildingBlock("Wood", "Brown", 3, 2.5, "Decorative"),
            new BuildingBlock("Stone", "Gray", 7, 5.0, "Building"),
            new BuildingBlock("Glass", "Transparent", 2, 3.0, "Decorative"),
            new BuildingBlock("Iron", "Silver", 9, 7.5, "Building"),
            new BuildingBlock("Brick", "Red", 6, 4.5, "Building")
        };

        // Sort blocks by hardness (ascending) and weight (descending)
        Arrays.sort(blocks, Comparator
            .comparingInt(BuildingBlock::getHardness) // Primary sort by hardness
            .thenComparing(Comparator.comparingDouble(BuildingBlock::getWeight).reversed()) // Secondary sort by weight
        );

        // Display sorted blocks
        System.out.println("Sorted blocks:");
        for (BuildingBlock block : blocks) {
            System.out.println(block);
        }

        // Search for a specific block
        BuildingBlock targetBlock = new BuildingBlock("Stone", "Gray", 7, 5.0, "Building");
        // Check if the target block exists in the array
        boolean found = Arrays.stream(blocks).anyMatch(block -> block.equals(targetBlock));
        System.out.println("Is the block found: " + found);
    }
}
