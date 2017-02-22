/* This class represents a Block. All entities on the board are derived from this class. */
package GameLogic;
public class Block {
	
	//Variable declaration
	private int x, y;
	
	//Constructor takes in a coordinate pair.
	public Block(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	//Setters
	public void setX(int x) {
		this.x = x;
	}
	
	public void setY(int y) {
		this.y = y;
	}
	
	//Getters
	public int getX() {
		return x;
	}
	
	public int getY() {
		return y;
	}
}

