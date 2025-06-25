public class Main {
    public static void main(String[] args) {
        Product[] products = {
            new Product(1, "Laptop", "Electronics"),
            new Product(2, "Shoes", "Footwear"),
            new Product(3, "Watch", "Accessories"),
            new Product(4, "Book", "Education"),
            new Product(5, "Mobile", "Electronics")
        };

        
        Product found1 = LinearSearch.linearSearch(products, "Watch");
        System.out.println("Linear Search Result: " + (found1 != null ? found1 : "Not Found"));

       
        Product found2 = BinarySearch.binarySearch(products, "Watch");
        System.out.println("Binary Search Result: " + (found2 != null ? found2 : "Not Found"));
    }
}
