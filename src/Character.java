
public interface Character {

	public boolean isAlive();
	public void lostHP(int amount);
	public void gainedHP(int amount);
	
	public void increaseStrength(int amount);

	public void decreaseStrength(int amount);

	public void increaseWisdom(int amount);

	public void decreaseWisdom(int amount);

	public void increaseAgility(int amount);
	
	public void decreaseAgility(int amount);

}
