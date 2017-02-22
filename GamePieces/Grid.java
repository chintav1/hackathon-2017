package GameLogic;

public class Grid{
	// 2D array representing the board
	private Block[][] map;
	// The number of blocks of type Component on the map
	private int numBlocks;
	
	// Keep a reference to the starting block
	private int startX;
	private int startY;
	
	// Constructor that creates a 'default map'. Start block is at (0,0).
	// Finish block is at (11,11).
	public Grid(){
		map = new Block[12][12];
		numBlocks = 0;
		startX = 0;
		startY = 0;
		
		for(int j = 0; j < 12; j++){
			for(int i = 0; i < 12; i++){
				map[j][i] = new EmptyBlock(i,j);
			}
		}
		map[startY][startX] = new StartingBlock(0,0);
		map[11][11] = new FinalBlock(11,11);
		
	}
	
	// Load a predefined map into the 2d array along with the number of blocks
	// on the map, and the coordinates of the start block
	public void loadLevel(Block[][] mapSeed, int numBlocksSeed, int stX, int stY){
		map = mapSeed;
		numBlocks = numBlocksSeed;
		startX = stX;
		startY = stY;
	}
	
	// Insert a block type into the specified x and y coordinates
	public boolean insertBlock(Block block, int x, int y){
		if(map[y][x] instanceof EmptyBlock){
			map[y][x] = block;
			numBlocks++;
			return true;
		}
		else{
			return false;
		}
	}
	
	// Delete the block at the specified x and y coordinates
	public boolean deleteBlock(int x, int y){
		if(map[y][x] instanceof Component){
			map[y][x] = new EmptyBlock(x,y);
			numBlocks--;
			return true;
		}
		else{
			return false;
		}
	}
	
	// Conveyor Search
	public boolean conveyorSearch(){
		StartingBlock sb = (StartingBlock) map[startY][startX];
		sb.search(map);
		return true;
	}
	
	// Prints out current board state
	public void printMap(){
		System.out.println("~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~");
		
		Block block;
		
		for(int j = 0; j < 12; j++){
			System.out.print("~ ");
			for(int i = 0; i < 12; i++){
				block = map[j][i];
				if (block instanceof EmptyBlock){
					System.out.print("E ");
				}
				else if (block instanceof PowerSupply){
					System.out.print("S ");
				}
				else if (block instanceof ProcessingUnit){
					System.out.print("P ");
				}
				else if (block instanceof Crate){
					System.out.print("C ");
				}
				else if (block instanceof Wire){
					System.out.print("W ");
				}
				else if (block instanceof Conveyor){
					System.out.print("V ");
				}
				else if (block instanceof StartingBlock){
					System.out.print("B ");
				}
				else if (block instanceof FinalBlock){
					System.out.print("F ");
				}
			}
			System.out.println("~\n");
		}
		System.out.println("~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~\n");
	}
}
