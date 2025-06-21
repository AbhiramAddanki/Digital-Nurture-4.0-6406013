import java.util.Arrays;

public class ProductBinarySearch {
    public static Product search(Product[] products, String targetName) {
        Arrays.sort(products);

        int low = 0;
        int high = products.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;
            String midName = products[mid].getProductName();

            int comparison = midName.compareToIgnoreCase(targetName);
            if (comparison == 0) {
                return products[mid];
            } else if (comparison < 0) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return null;
    }
}
