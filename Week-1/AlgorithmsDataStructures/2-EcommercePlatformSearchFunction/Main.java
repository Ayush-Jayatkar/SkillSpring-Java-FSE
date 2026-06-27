public class Main {
    public static void main(String[] args) {

        // Array for Linear Search (unsorted is fine)
        Product[] productsForLinear = {
            new Product(1, "Laptop", "Electronics"),
            new Product(2, "Phone", "Electronics"),
            new Product(3, "Watch", "Accessories"),
            new Product(4, "Tablet", "Electronics"),
            new Product(5, "Camera", "Photography")
        };

        // Array for Binary Search (MUST be sorted alphabetically by name)
        Product[] productsForBinary = {
            new Product(5, "Camera", "Photography"),
            new Product(1, "Laptop", "Electronics"),
            new Product(2, "Phone", "Electronics"),
            new Product(4, "Tablet", "Electronics"),
            new Product(3, "Watch", "Accessories")
        };

        // Test Linear Search
        System.out.println("=== Linear Search ===");
        Product result1 = LinearSearch.linearSearch(productsForLinear, "Watch");
        if (result1 != null) {
            System.out.println("Found: " + result1.productName + " | Category: " + result1.category);
        } else {
            System.out.println("Product not found.");
        }

        // Test Binary Search
        System.out.println("\n=== Binary Search ===");
        Product result2 = BinarySearch.binarySearch(productsForBinary, "Watch");
        if (result2 != null) {
            System.out.println("Found: " + result2.productName + " | Category: " + result2.category);
        } else {
            System.out.println("Product not found.");
        }

        // Test not found case
        System.out.println("\n=== Searching for non-existent product ===");
        Product result3 = LinearSearch.linearSearch(productsForLinear, "Headphones");
        if (result3 != null) {
            System.out.println("Found: " + result3.productName);
        } else {
            System.out.println("Product not found.");
        }
    }
}