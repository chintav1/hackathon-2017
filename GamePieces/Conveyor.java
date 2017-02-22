/* This class represents a conveyor component. 
 * Overlapping is currently in Wire/Conveyor instead of Component in case we have more components later. */
package GameLogic;
public class Conveyor extends Component {
	
	//Variable declarations
	private boolean overlapping;
	
	//Constructor takes in a coordinate pair whether it is overlapping or not.
	public Conveyor(int x, int y, int cost, boolean overlapping) {
		super(x, y, cost);
		this.overlapping = overlapping;
	}
	
	//Setter
	public void setOverlapping(boolean overlapping) {
		this.overlapping = overlapping;
	}
	
	//Getter
	public boolean getOverlapping() {
		return overlapping;
	}
}

