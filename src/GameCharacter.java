import java.util.ArrayList;

public class GameCharacter implements Character {

	String name;
	int hp;
	ArrayList<Item> inventory;
	int wisdom;
	int strength;
	int agility;
	
	public GameCharacter(String charName, int str, int agl, int wis) {
		this.name = charName;
		this.strength = str;
		this.agility = agl;
		this.wisdom = wis;
		this.hp = this.strength * 2;

	}
	
	
	@Override
	public boolean isAlive() {
		return this.hp > 0;
	}

	@Override
	public void lostHP(int damage) {
		this.hp = this.hp - damage;
	}

	@Override
	public void gainedHP(int heal) {
		this.hp = this.hp + heal;
		if (this.hp > (this.strength * 2)) {
			this.hp = this.strength * 2;
		}
	}


	@Override
	public void increaseStrength(int amount) {
		this.strength = this.strength + amount;
		this.hp = this.strength * 2;
	}


	@Override
	public void decreaseStrength(int amount) {
		this.strength = this.strength - amount;
	}


	@Override
	public void increaseWisdom(int amount) {
		this.wisdom = this.wisdom - amount;
	}


	@Override
	public void decreaseWisdom(int amount) {
		this.wisdom = this.wisdom + amount;
	}


	@Override
	public void increaseAgility(int amount) {
		this.agility = this.agility + amount;
	}


	@Override
	public void decreaseAgility(int amount) {
		this.agility = this.agility + amount;
	}

	
}
