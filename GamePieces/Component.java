/* This class represents the game pieces that the player can place. */
package GameLogic;
public class Component extends Block {
	
	//Variable declaration
	private int cost;
	
	//Constructor takes in a coordinate pair and a cost.
	public Component(int x, int y, int cost) {
		super(x, y);
		this.cost = cost;
	}
	
	//Setter
	public void setCost(int cost) {
		this.cost = cost;
	}
	
	//Getter
	public int getCost() {
		return cost;
	}
}

