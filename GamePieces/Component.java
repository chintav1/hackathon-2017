/* This class represents the game pieces that the player can place. */
 
public class Component extends Block {
	
	private int cost;
	
	public Component(int x, int y, int cost) {
		super(x, y);
		this.cost = cost;
	}
	
	public void setCost(int cost) {
		this.cost = cost;
	}
	
	public int getCost() {
		return cost;
	}
}

