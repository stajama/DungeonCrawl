
public class Item {
	
	String name;
	int effect;
	int amount;
	
	/* 1. Healing
	 * 2. Poison
	 * 3. Increase Strength
	 * 4. Decrease Strength
	 * 5. Increase Wisdom
	 * 6. Decrease Wisdom
	 * 7. Increase Agility
	 * 8. Decrease Agility
	 * 9. Weapon
	 * 10. Armor 
	 */
	
	public Item(String itemName, int effectType, int effectAmount) {
		this.name = itemName;
		this.effect = effectType;
		this.amount = effectAmount;
	}
	
	public void useItem(Character target) {
		switch(this.effect) {
		case 1:
			target.gainedHP(this.amount);
		
		case 2:
			target.lostHP(this.amount);
		
		case 3:
			target.increaseStrength(this.amount);
		
		case 4:
			target.decreaseStrength(this.amount);
		
		case 5:
			target.increaseWisdom(this.amount);
		
		case 6:
			target.decreaseWisdom(this.amount);
		
		case 7:
			target.increaseAgility(this.amount);
			
		case 8:
			target.decreaseAgility(this.amount);
		
		case 9:
			target.lostHP(this.amount);
			
		default:
			break;
		}
		
	}
	
}
