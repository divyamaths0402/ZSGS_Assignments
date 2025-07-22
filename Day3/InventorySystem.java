 
 public class InventorySystem{
      public static void main(String[] args){
        // set store details
        Store.setStoreDetails("TechMart","New York");
        // Create a store with space for 10 products
        Store myStore=new Store(10);
        // Create products
        Product p1 = new Product(101, "Laptop", 1200.00, 5);
        Product p2 = new Product(102, "Mouse", 25.50, 20);
        Product p3 = new Product(103, "Keyboard", 45.99, 15);
        // Add products to store
        myStore.addProduct(p1);
        myStore.addProduct(p2);
        myStore.addProduct(p3);

        // Display store and products
        Store.displayStoreDetails();
        myStore.displayAllProducts();
    
      }
 }
 class Product{

    private int productID;
    private String name;
    private double price;
    private int quantity;
    Product(int productID,String name,double price,int quantity){
           this.productID=productID;
           this.name=name;
           this.price=price;
           this.quantity=quantity;
    }
    public void displayProduct(){
        System.out.println("Product ID: " + productID);
        System.out.println("Name: " + name);
        System.out.println("Price: $" + price);
        System.out.println("Quantity: " + quantity);
    }
}
 
 
 class Store{
      private static String storeName;
      private static String storeLocation;
      private Product[] products;
      private int productCount;
    //   Constructor to initialize array with fixed size
      public Store(int maxProducts){
          products=new Product[maxProducts];
          productCount=0;
      }
    //   static method to set store details
      public static  void setStoreDetails(String name,String location){
            storeName=name;
            storeLocation=location;
      }
    //   static method to display store details
      public static void  displayStoreDetails(){
            System.out.println("Store Name: " + storeName);
            System.out.println("Store Location: " + storeLocation);
      }
      public void addProduct(Product product){
           if(productCount<products.length){
            products[productCount]=product;
            productCount++;
           }
           else{
            System.out.println("Cannot add more products.Inventory full!");

           }
      }
      public void displayAllProducts(){
           if(productCount==0){
            System.out.println("No products in the store");
           }
           else{
            System.out.println("Products in store");
            for(int i=0;i<productCount;i++){
                products[i].displayProduct();
            }
           }
      }

}
