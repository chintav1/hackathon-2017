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
		xys[0] = this.getX();
		xys[1] = this.getY();
		
		switch (direction) {
			case NORTH: xys[2] = this.getX();
						xys[3] = this.getY()+1;
						xys[4] = this.getX()+1;
						xys[5] = this.getY();
						xys[6] = this.getX()+1;
						xys[7] = this.getY()+1;
						break;
			case SOUTH: xys[2] = this.getX();
						xys[3] = this.getY()-1;
						xys[4] = this.getX()-1;
						xys[5] = this.getY();
						xys[6] = this.getX()-1;
						xys[7] = this.getY()-1;
						break;
			case EAST:  xys[2] = this.getX()-1;
						xys[3] = this.getY();
						xys[4] = this.getX();
						xys[5] = this.getY()+1;
						xys[6] = this.getX()-1;
						xys[7] = this.getY()+1;
						break;
			case WEST:  xys[2] = this.getX()+1;
						xys[3] = this.getY();
						xys[4] = this.getX();
						xys[5] = this.getY()-1;
						xys[6] = this.getX()+1;
						xys[7] = this.getY()-1;
						break;
			default:	break;
		} return xys;
	}
	
	//Returns the block that actually makes the connection, where wire must be to get power.
	public int[] getConnectionPoint() {
		if (direction == Direction.NORTH) {
			int[] array = {this.getX(), this.getY()-1};
			return array;
		} else if (direction == Direction.SOUTH) {
			int[] array = {this.getX(), this.getY()+1};
			return array;
		} else if (direction == Direction.EAST) {
			int[] array = {this.getX()+1, this.getY()};
			return array;
		} else {
			int[] array = {this.getX()-1, this.getY()};
			return array;
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

