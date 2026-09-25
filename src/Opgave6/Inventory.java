package Opgave6;

import java.util.ArrayList;

public class Inventory {
    private String playerName;
    private ArrayList<Item> items;
    private int maxCapacity;

    public Inventory(String playerName, int maxCapacity) {
        this.playerName = playerName;
        this.items = new ArrayList<>();
        this.maxCapacity = maxCapacity;
    }

    public String getPlayerName() {
        return this.playerName;
    }

    public void addItem(Item item) {
        if (this.items.size() < this.maxCapacity) {
            items.add(item);
            System.out.println(item.getName() + " has been added to " + this.playerName + "'s inventory");
        } else {
            System.out.println("Max capacity reached, " + item.getName() + " couldn't be added to the inventory");
        }
    }

    public int getTotalValue() {
        int sum = 0;
        for (Item item : items) {
            sum += item.getValue();
        }
        return sum;
    }

    public ArrayList<Item> findItemsByType(String type) {
        ArrayList<Item> itemsWithType = new ArrayList<>();
        for (Item item : items) {
            if (item.getType().equals(type)) {
                itemsWithType.add(item);
            }
        }
        return itemsWithType;
    }

    public void printInventory() {
        System.out.println(this.playerName + "'s inventory:");
        for (Item item : items) {
            System.out.println(item);
        }
    }

}
