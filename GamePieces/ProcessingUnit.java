/* This class represents a Processing unit object. */
package GameLogic;
public class ProcessingUnit extends Immovable {
	
	//Variable declaration.
	private Direction direction;
	
	//Constructor takes in a coordinate pair which is the coordinates of the output block.
	//Also takes in a direction.
	public ProcessingUnit(int x, int y, Direction direction) {
		super(x, y);
		this.direction = direction;
	}
	
	//Returns an array containing all of the coordinate pairs the block occupies. (in [x,y,x,y])
	public int[] getCoordinates() {
		int[] xys = new int[4];
		xys[0] = x;
		xys[1] = y;
		
		switch (direction) {
			case NORTH: xys[2] = x;
						xys[3] = y++;
						break;
			case SOUTH: xys[2] = x;
						xys[3] = y--;
						break;
			case EAST:  xys[2] = x--;
						xys[3] = y;
						break;
			case WEST:  xys[2] = x++;
						xys[3] = y;
						break;
			default:	break;	
		} return xys;
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
