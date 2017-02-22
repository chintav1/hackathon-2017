/* This class represents a Power supply object. */

public class PowerSupply extends Immovable {
	
	private Direction direction;
	
	public PowerSupply(int x, int y, Direction direction) {
		super(x, y);
		this.direction = direction;
	}
	
	public void setDirection(Direction direction) {
		this.direction = direction;
	}
	
	public Direction getDirection() {
		return direction;
	}
	
	public int[] getCoordinates() {
		//calculate all the xys that the block occupies. returns 4 xy pairs, first is the same as getDirection
	}
	
	public int[] getConnectionPoint() {
		//returns the xy of the block that wires can connect to. returns one xy pair
	}
	
}

