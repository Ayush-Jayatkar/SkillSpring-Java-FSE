public class LinearSearch {
    public static Product linearSearch(Product[] products, String targetName) {
        for (int i = 0; i < products.length; i++) {
            if (products[i].productName.equalsIgnoreCase(targetName)) {
                return products[i];
            }
        }
        return null;
    }
}