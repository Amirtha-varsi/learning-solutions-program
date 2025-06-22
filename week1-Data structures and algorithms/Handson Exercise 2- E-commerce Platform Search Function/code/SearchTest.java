
// SearchTest.java
import java.util.Arrays;

public class SearchTest {
    public static void main(String[] args) {
        Product[] products = {
                new Product(101, "Shoes", "Fashion"),
                new Product(102, "Laptop", "Electronics"),
                new Product(103, "Phone", "Electronics"),
                new Product(104, "Watch", "Fashion"),
                new Product(105, "Headphones", "Electronics")
        };

        System.out.println(" Linear Search:");
        Product foundLinear = ProductSearch.linearSearch(products, "Watch");
        System.out.println(foundLinear != null ? foundLinear : "Product not found.");

        // Sort products before binary search
        Arrays.sort(products, (a, b) -> a.productName.compareToIgnoreCase(b.productName));

        System.out.println("\n Binary Search:");
        Product foundBinary = ProductSearch.binarySearch(products, "Watch");
        System.out.println(foundBinary != null ? foundBinary : "Product not found.");
    }
}
