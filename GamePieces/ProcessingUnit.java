/* This class represents a Processing unit object. */

public class ProcessingUnit extends Immovable {
	
	private Direction direction;
	
	public ProcessingUnit(int x, int y, Direction direction) {
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
		//returns the coordinates of the entire block, two xy pairs.
	}
}

