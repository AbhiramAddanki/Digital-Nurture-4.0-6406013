public class ProductSearchTest {
    public static void main(String[] args) {
        Product[] products = {
            new Product(101, "Laptop", "Electronics"),
            new Product(102, "Sneakers", "Footwear"),
            new Product(103, "Shampoo", "Personal Care"),
            new Product(104, "T-shirt", "Clothing"),
            new Product(105, "Smartphone", "Electronics")
        };

        String searchName = "T-shirt";

        // Linear Search
        Product foundLinear = ProductLinearSearch.search(products, searchName);
        System.out.println("Linear Search Result: " + (foundLinear != null ? foundLinear : "Product not found"));

        // Binary Search
        Product foundBinary = ProductBinarySearch.search(products, searchName);
        System.out.println("Binary Search Result: " + (foundBinary != null ? foundBinary : "Product not found"));
    }
}
