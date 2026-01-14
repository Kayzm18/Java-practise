public class Main {
    public static void main(String[] args) {

        Inventory inventory = new Inventory();

        Item item1 = new Item("Generic item", 20);
        Fruit fruit = new Fruit("Apple", 20, "Fuji");
        Weapon weapon = new Weapon("Sword", 2, 75, "Melee");

        inventory.addItem(item1);
        inventory.addItem(fruit);
        inventory.addItem(weapon);

        inventory.displayInventory();
    }
}
