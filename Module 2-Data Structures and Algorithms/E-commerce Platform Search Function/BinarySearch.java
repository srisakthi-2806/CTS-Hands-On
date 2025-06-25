import java.util.Arrays;
import java.util.Comparator;

public class BinarySearch {
    public static Product binarySearch(Product[] products, String key) {
        Arrays.sort(products, Comparator.comparing(p -> p.productName.toLowerCase())); // sort array

        int left = 0, right = products.length - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            int cmp = products[mid].productName.compareToIgnoreCase(key);
            if (cmp == 0) return products[mid];
            else if (cmp < 0) left = mid + 1;
            else right = mid - 1;
        }
        return null;
    }
}
