import java.util.ArrayList;

public class PlayerCharacter extends GameCharacter {

	Item armor;
	Item weapon;
	public PlayerCharacter(String charName, int str, int agl, int wis) {
		super(charName, str, agl, wis);
		this.inventory = new ArrayList<Item>();
		this.inventory.add(new Item("Dirk", 9, 6));
		this.inventory.add(new Item("Potion - Lvl1", 1, 8));
	}
	
	public String getInventory() {
		String itemList = "";
		for (int i = 0; i < this.inventory.size(); i++) {
			itemList = itemList + Integer.toString(i + 1) + ") " + this.inventory.get(i).name));
		}
		return itemList + Integer.toString(this.inventory.size()) + ") Back";
	}
	
	public String getInventory(int itemType) {
		String itemList = "";
		counter = 1;
		for (int i = 0; i < this.inventory.size(); i++) {
			if (this.inventory.get(i).effect == itemType) {
				itemList = itemList + Integer.toString(counter++) + ") " + this.inventory.get(i).name));
			}
		}
		return itemList + Integer.toString(this.inventory.size()) + ") Back";
	}
	
	public void useItem() {
		System.out.println(this.getInventory());
		// TODO: learn java.awt.keylistener or other tool. Player to select object by display number
		// and target by display number.

		// while (true)
		
		//SelectedItem.useOn(ListOfEntities.get(selectedTarget[ofTypeCharacter]);
	}
	
	public void equipWeapon() {
		System.out.println(this.getInventory(9));
		// TODO: write weapon selection code.
		
		this.inventory.add(this.weapon);
		this.weapon = this.inventory.get(selected);
		this.inventory.remove(selected);
	}
}
