package Opgave6;

public class Main {

    public static void main(String[] args) {
        Inventory inventory1 = new Inventory("Anna", 10);
        Inventory inventory2 = new Inventory("Mikkel", 10);

        inventory1.addItem(new Item("Iron Sword", 150, "weapon"));
        inventory1.addItem(new Item("Health Potion", 50, "potion"));
        inventory1.addItem(new Item("Wooden Shield", 100, "armor"));
        inventory1.addItem(new Item("Mana Potion", 75, "potion"));
        System.out.println();

        inventory2.addItem(new Item("Steel Axe", 200, "weapon"));
        inventory2.addItem(new Item("Leather Armor", 180, "armor"));
        inventory2.addItem(new Item("Health Potion", 50, "potion"));
        System.out.println();

        inventory1.printInventory();
        System.out.println();
        inventory2.printInventory();
        System.out.println();

        System.out.println("Total items created: " + Item.getTotalItemsCreated());
        System.out.println();

        System.out.println(inventory1.getPlayerName() + "'s inventory value: " + inventory1.getTotalValue());
        System.out.println();
        System.out.println(inventory2.getPlayerName() + "'s inventory value: " + inventory2.getTotalValue());

    }

}
