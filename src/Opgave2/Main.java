package Opgave2;

public class Main {
    static Product[] products = new Product[4];

    public static void main() {
        products[0] = new Product("Laptop", 5999, new String[]{"electronics", "new"});
        products[1] = new Product("Mouse", 199, new String[]{"electronics", "sale"});
        products[2] = new Product("Keyboard", 499, new String[]{"electronics", "sale"});
        products[3] = new Product("Monitor", 2499, new String[]{"electronics"});

        for (Product product : products) {
            if (product.hasTag("sale")) {
                product.printInfo();
                System.out.println();
            }
        }

        int mostExpensiveIndex = 0;
        for (int i = 0; i < products.length; i++) {
            if (products[i].getPrice() > products[mostExpensiveIndex].getPrice()) {
                mostExpensiveIndex = i;
            }

        }
        System.out.println("Most expensive product is: ");
        products[mostExpensiveIndex].printInfo();
        System.out.println();

        findProductsBetween(500, 6000);

    }

    static public void findProductsBetween(int min, int max) {
        for (Product product : products) {
            if (product.getPrice() >= min && product.getPrice() <= max) {
                product.printInfo();
                System.out.println();
            }
        }
    }


}
