package Opgave2;

public class Product {
    private String name;
    private double price;
    private String[] tags;

    public Product(String name, double price, String[] tags) {
        this.name = name;
        this.price = price;
        this.tags = tags;
    }

    public double getPrice() {
        return this.price;
    }

    public void printInfo() {
        System.out.println("Name: " + this.name);
        System.out.println("Price: " + this.price);
        System.out.println("Tags: ");
        for (String tag : tags) {
            System.out.println(tag);
        }
    }

    public boolean hasTag(String targetTag) {
        for (String tag : tags) {
            if (tag.equals(targetTag)) {
                return true;
            }
        }
        return false;
    }



}
