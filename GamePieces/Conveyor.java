/* This class represents a conveyor component. */

public class Conveyor extends Component {
	
	//Overlapping is currently in Wire/Conveyor instead of Component in case we have more components later.
	private boolean overlapping;
	
	public Conveyor(int x, int y, int cost, boolean overlapping) {
		super(x, y, cost);
		this.overlapping = overlapping;
	}
	
	public void setOverlapping(boolean overlapping) {
		this.overlapping = overlapping;
	}
	
	public boolean getOverlapping() {
		return overlapping;
	}
}

