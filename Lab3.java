class Product{
    String name;
    double price;
    int quantity;

    public Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }
} 

class Lab3{
    static int numProducts = 0;
    static double totalRevenue = 0.0;

    public static void addProduct(Product p) {
        numProducts++;
    }

    public static void sellProduct(Product p, int quantity) {
        if (p.quantity >= quantity) {
            p.quantity -= quantity;
            totalRevenue += p.price * quantity;
        }
    }

    public static void displayStats() {
        System.out.println("Number of products: " + numProducts);
        System.out.println("Total revenue:" + totalRevenue);
    }

    public static void main(String[] args) {
        Product product1 = new Product("Apple", 1.99, 10);
        Product product2 = new Product("Banana", 0.99, 10);

       Lab3.addProduct(product1);
     Lab3.addProduct(product2);

   Lab3.sellProduct(product1,2);
       Lab3.sellProduct(product2, 1);

      Lab3.displayStats();
    }
}



















