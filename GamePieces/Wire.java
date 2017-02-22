/* This class represents a wire component. 
 * Overlapping is currently in Wire/Conveyor instead of Component in case we have more components later. */
package GameLogic;
public class Wire extends Component {
	
	//Variable declaration
	private boolean overlapping;
	
	//Constructor takes in a coordinate pair whether it is overlapping or not.
	public Wire(int x, int y, int cost, boolean overlapping) {
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

