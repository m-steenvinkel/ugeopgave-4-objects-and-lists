package Opgave6;

public class Item {
    private String name;
    private int value;
    private String type;
    private static int totalItemsCreated = 0;

    public Item(String name, int value, String type) {
        this.name = name;
        this.value = value;
        this.type = type;
        totalItemsCreated++;
    }

    public String getName() {
        return this.name;
    }

    public int getValue() {
        return this.value;
    }

    public String getType() {
        return this.type;
    }

    public static int getTotalItemsCreated() {
        return totalItemsCreated;
    }

    public String toString() {
        return "Name: " + this.name + " Value: " + this.value + " Type: " + this.type;
    }



}
