 
 import java.util.ArrayList;
import java.util.List;

public class InventorySystem {

    // Product class
      static class Product {
        private int productId;
        private String name;
        private double price;
        private int quantity;

        public Product(int productId, String name, double price, int quantity) {
            this.productId = productId;
            this.name = name;
            this.price = price;
            this.quantity = quantity;
        }

        public void displayProduct() {
            System.out.println("Product ID: " + productId);
            System.out.println("Name: " + name);
            System.out.println("Price: $" + price);
            System.out.println("Quantity: " + quantity);
            System.out.println("-----------------------");
        }
    }

    // Store class
    static class Store {
        private static String storeName;
        private static String storeLocation;

        private List<Product> products;

        public Store() {
            products = new ArrayList<>();
        }

        public static void setStoreDetails(String name, String location) {
            storeName = name;
            storeLocation = location;
        }

        public static void displayStoreDetails() {
            System.out.println("Store Name: " + storeName);
            System.out.println("Store Location: " + storeLocation);
            System.out.println("=======================");
        }

        public void addProduct(Product product) {
            products.add(product);
        }

        public void displayAllProducts() {
            System.out.println("All Products in Store:");
            System.out.println("=======================");
            for (Product product : products) {
                product.displayProduct();
            }
        }
    }

    // main method
    public static void main(String[] args) {
        // Set store details
        Store.setStoreDetails("TechMart", "Downtown City");

        // Create store instance
        Store myStore = new Store();

        // Create and add products
        Product p1 = new Product(101, "Laptop", 1200.50, 5);
        Product p2 = new Product(102, "Smartphone", 799.99, 10);
        Product p3 = new Product(103, "Headphones", 199.95, 15);

        myStore.addProduct(p1);
        myStore.addProduct(p2);
        myStore.addProduct(p3);

        // Display store and product details
        Store.displayStoreDetails();
        myStore.displayAllProducts();
    }
}
