import java.util.Arrays;
public class King  extends Piece{
	
	public King(String color) {
		super(color);
	}
	
	public boolean canMove(String newPos){
		String [] moves = this.getAllMoves();
		if(Arrays.asList(moves).contains(newPos))
			return true;
		return false;
	}
	
	public String getTip() { 
		return "King";
	}
	
	public String [] getAllMoves() {
		
		String moves = null;
		String location = this.getPosition();
		
		if(location.equals("a1")) {
			moves="a2 b1 b2";
		}
		else if(location.equals("a2")) {
			moves="a1 a3 b1 b2 b3";
		}
		else if(location.equals("a3")) {
			moves="a2 a4 b2 b3 b4";
		}
		else if(location.equals("a4")) {
			moves="a3 a5 b3 b4 b5";
		}
		else if(location.equals("a5")) {
			moves="a4 a6 b4 b5 b6";
		}
		else if(location.equals("a6")) {
			moves="a5 a6 b5 b6 b7";
		}
		else if(location.equals("a7")) {
			moves="a6 a7 b6 b7 b8";
		}
		else if(location.equals("a8")) {
			moves="a7 b7 b8";
		}
		else if(location.equals("b1")) {
			moves="a1 a2 b2 c1 c2";
		}
		else if(location.equals("b2")) {
			moves="a1 a2 a3 b1 b3 c1 c2 c3";
		}
		else if(location.equals("b3")) {
			moves="a2 a3 a4 b2 b4 c2 c3 c4";
		}
		else if(location.equals("b4")) {
			moves="a3 a4 a5 b3 b5 c3 c4 c5";
		}
		else if(location.equals("b5")) {
			moves="a4 a5 a6 b4 b6 c4 c5 c6";
		}
		else if(location.equals("b6")) {
			moves="a5 a6 a7 b5 b7 c5 c6 c7";
		}
		else if(location.equals("b7")) {
			moves="a6 a7 a8 b6 b8 c6 c7 c8";
		}
		else if(location.equals("b8")) {
			moves="a7 a8 b7 c7 c8";
		}
		else if(location.equals("c1")) {
			moves="b1 b2 c2 d1 d2";
		}
		else if(location.equals("c2")) {
			moves="b1 b2 b3 c1 c3 d1 d2 d3";
		}
		else if(location.equals("c3")) {
			moves="b2 b3 b4 c2 c4 d2 d3 d4";
		}
		else if(location.equals("c4")) {
			moves="b3 b4 b5 c3 c5 d3 d4 d5";
		}
		else if(location.equals("c5")) {
			moves="b4 b5 b6 c4 c6 d4 d5 d6";
		}
		else if(location.equals("c6")) {
			moves="b5 b6 b7 c5 c7 d5 d6 d7";
		}
		else if(location.equals("c7")) {
			moves="b6 b7 b8 c6 c8 d6 d7 d8";
		}
		else if(location.equals("c8")) {
			moves="b7 b8 c7 d7 d8";
		}
		else if(location.equals("d1")) {
			moves="c1 c2 d2 e1 e2";
		}
		else if(location.equals("d2")) {
			moves="c1 c2 c3 d1 d3 e1 e2 e3";
		}
		else if(location.equals("d3")) {
			moves="c2 c3 c4 d2 d4 e2 e3 e4";
		}
		else if(location.equals("d4")) {
			moves="c3 c4 c5 d3 d5 e3 e4 e5";
		}
		else if(location.equals("d5")) {
			moves="c4 c4 c6 d4 d6 e4 e5 e6";
		}
		else if(location.equals("d6")) {
			moves="c5 c6 c7 d5 d7 e5 e6 e7";
		}
		else if(location.equals("d7")) {
			moves="c6 c7 c8 d6 d8 e6 e7 e8";
		}
		else if(location.equals("d8")) {
			moves="c7 c8 d7 e7 e8";
		}
		else if(location.equals("e1")) {
			moves="d1 d2 e2 f1 f2";
		}
		else if(location.equals("e2")) {
			moves="d1 d2 d3 e1 e3 f1 f2 f3";
		}
		else if(location.equals("e3")) {
			moves="d2 d3 d4 e2 e4 f2 f3 f4";
		}
		else if(location.equals("e4")) {
			moves="d3 d4 d5 e3 e5 f3 f4 f5";
		}
		else if(location.equals("e5")) {
			moves="d4 d5 d6 e4 e6 f4 f5 f6";
		}
		else if(location.equals("e6")) {
			moves="d5 d6 d7 e5 e7 f5 f6 f7";
		}
		else if(location.equals("e7")) {
			moves="d6 d7 d8 e6 e8 f6 f7 f8";
		}
		else if(location.equals("e8")) {
			moves="d7 d8 e7 f7 f8";
		}
		else if(location.equals("f1")) {
			moves="e1 e2 f2 g1 g2";
		}
		else if(location.equals("f2")) {
			moves="e1 e2 e3 f1 f3 g1 g2 g3";
		}
		else if(location.equals("f3")) {
			moves="e2 e3 e4 f2 f4 g2 g3 g4";
		}
		else if(location.equals("f4")) {
			moves="e3 e4 e5 f3 f5 g3 g4 g5";
		}
		else if(location.equals("f5")) {
			moves="e4 e5 e6 f4 f6 g4 g5 g6";
		}
		else if(location.equals("f6")) {
			moves="e5 e6 e7 f5 f7 g5 g6 g7";
		}
		else if(location.equals("f7")) {
			moves="e6 e7 e8 f6 f8 g6 g7 g8";
		}
		else if(location.equals("f8")) {
			moves="e7 e8 f7 g7 g8";
		}
		else if(location.equals("g1")) {
			moves="f1 f2 g2 h1 h2";
		}
		else if(location.equals("g2")) {
			moves="f1 f2 f3 g1 g3 h1 h2 h3";
		}
		else if(location.equals("g3")) {
			moves="f2 f3 f4 g2 g4 h2 h3 h4";
		}
		else if(location.equals("g4")) {
			moves="f3 f4 f5 g3 g5 h3 h4 h5";
		}
		else if(location.equals("g5")) {
			moves="f4 f5 f6 g4 g6 h4 h5 h6";
		}
		else if(location.equals("g6")) {
			moves="f5 f6 f7 g5 g7 h5 h6 h7";
		}
		else if(location.equals("g7")) {
			moves="f6 f7 f8 g6 g8 h6 h7 h8";
		}
		else if(location.equals("g8")) {
			moves="f7 f8 g7 h7 h8";
		}
		else if(location.equals("h1")) {
			moves="g1 g2 h2";
		}
		else if(location.equals("h2")) {
			moves="g1 g2 g3 h1 h3";
		}
		else if(location.equals("h3")) {
			moves="g2 g3 g4 h2 h4";
		}
		else if(location.equals("h4")) {
			moves="g3 g4 g5 h3 h5";
		}
		else if(location.equals("h5")) {
			moves="g4 g5 g6 h4 h6";
		}
		else if(location.equals("h6")) {
			moves="g5 g6 g7 h5 h7";
		}
		else if(location.equals("h7")) {
			moves="g6 g7 g8 h6 h8";
		}
		else if(location.equals("h8")) {
			moves="g7 g8 h7";
		}
		
		String[] array=moves.split(" ");
		return array;

	}	
	
}
