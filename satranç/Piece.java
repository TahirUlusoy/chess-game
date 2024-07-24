public class Piece {
	
	private String position;
	private String color;
	
	public Piece(String color) {
		this.color=color;
	}
	
	public boolean canMove(String newPosition){
		return true;
	}
	
	public String[]  getAllMoves() {		
		return null;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getTip() { 
		return "Piece";
	}
	
}
