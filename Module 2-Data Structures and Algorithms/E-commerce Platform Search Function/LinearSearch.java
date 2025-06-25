public class LinearSearch {
    public static Product linearSearch(Product[] products, String key) {
        for (Product p : products) {
            if (p.productName.equalsIgnoreCase(key)) {
                return p;
            }
        }
        return null;
    }
}
