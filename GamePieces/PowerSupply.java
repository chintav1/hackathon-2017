/* This class represents a Power supply object. */
package GameLogic;
public class PowerSupply extends Immovable {
	
	//Variable declaration
	private Direction direction;
	
	//Constructor takes in a coordinate pair which is the coordinates of the output block.
	//Also takes in a direction.
	public PowerSupply(int x, int y, Direction direction) {
		super(x, y);
		this.direction = direction;
	}
	
	//Returns an array containing all the coordinate pairs the block occupies. (in [x,y,x,y,x,y,x,y])
	public int[] getCoordinates() {
		int[] xys = new int[8];
		xys[0] = x;
		xys[1] = y;
		
		switch (direction) {
			case NORTH: xys[2] = x;
						xys[3] = y++;
						xys[4] = x++;
						xys[5] = y;
						xys[6] = x++;
						xys[7] = y++;
						break;
			case SOUTH: xys[2] = x;
						xys[3] = y--;
						xys[4] = x--;
						xys[5] = y;
						xys[6] = x--;
						xys[7] = y--;
						break;
			case EAST:  xys[2] = x--;
						xys[3] = y;
						xys[4] = x;
						xys[5] = y++;
						xys[6] = x--;
						xys[7] = y++;
						break;
			case WEST:  xys[2] = x++;
						xys[3] = y;
						xys[4] = x;
						xys[5] = y--;
						xys[6] = x++;
						xys[7] = y--;
						break;
			default:	break;
		} return xys;
	}
	
	//Returns the block that actually makes the connection, where wire must be to get power.
	public int[] getConnectionPoint() {
		if (direction == NORTH) {
			return [x, y--];
		} else if (direction == SOUTH) {
			return [x, y++];
		} else if (direction == EAST) {
			return [x++, y];
		} else {
			return [x--, y];
		}
	}
	
	//Setter
	public void setDirection(Direction direction) {
		this.direction = direction;
	}
	
	//Getter
	public Direction getDirection() {
		return direction;
	}
}

