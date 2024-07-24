import java.util.Arrays;
public class Knight extends Piece{
	
	public Knight(String color) {
		super(color);
	}
		
	public boolean canMove(String newPos){
		String [] moves = this.getAllMoves();
		if(Arrays.asList(moves).contains(newPos))
			return true;
		return false;
	}
	
	public String getTip() { 
		return "Knight";
	}
	
	public String [] getAllMoves() {

		String moves = null;
		String location = this.getPosition();
		
		if(location.equals("a1")) {
			moves="b3 c2";
		}
		else if(location.equals("a2")) {
			moves="b4 c1 c3";
		}
		else if(location.equals("a3")) {
			moves="b1 b5 c2 c4";
		}
		else if(location.equals("a4")) {
			moves="b2 b6 c3 c5";
		}
		else if(location.equals("a5")) {
			moves="b3 b7 c4 c6";
		}
		else if(location.equals("a6")) {
			moves="b4 b8 c5 c7";
		}
		else if(location.equals("a7")) {
			moves="b5 c6 c8";
		}
		else if(location.equals("a8")) {
			moves="b6 c7";
		}
		else if(location.equals("b1")) {
			moves="a3 c3 d2";
		}
		else if(location.equals("b2")) {
			moves="a4 c4 d1 d3";
		}
		else if(location.equals("b3")) {
			moves="a1 a5 c1 c5 d2 d4";
		}
		else if(location.equals("b4")) {
			moves="a2 a6 c2 c6 d3 d5";
		}
		else if(location.equals("b5")) {
			moves="a3 a7 c3 c7 d4 d6";
		}
		else if(location.equals("b6")) {
			moves="a4 a8 c4 c8 d5 d7";
		}
		else if(location.equals("b7")) {
			moves="a5 c5 d6 d8";
		}
		else if(location.equals("b8")) {
			moves="a6 c6 d7";
		}
		else if(location.equals("c1")) {
			moves="a2 b3 d3 e2";
		}
		else if(location.equals("c2")) {
			moves="a1 a3 b4 d4 e1 e3";
		}
		else if(location.equals("c3")) {
			moves="a2 a4 b1 b5 d1 d5 e2 e4";
		}
		else if(location.equals("c4")) {
			moves="a3 a5 b2 b6 d2 d6 e3 e5";
		}
		else if(location.equals("c5")) {
			moves="a4 a6 b3 b7 d3 d7 e4 e6";
		}
		else if(location.equals("c6")) {
			moves="a5 a7 b4 b8 d4 d8 e5 e7";
		}
		else if(location.equals("c7")) {
			moves="a6 a8 b5 d5 e6 e8";
		}
		else if(location.equals("c8")) {
			moves="a7 b6 d6 e7";
		}
		else if(location.equals("d1")) {
			moves="b2 c3 e3 f2";
		}
		else if(location.equals("d2")) {
			moves="b1 b3 c4 e4 f1 f3";
		}
		else if(location.equals("d3")) {
			moves="b2 b4 c1 c5 e1 e5 f2 f4";
		}
		else if(location.equals("d4")) {
			moves="b3 b5 c2 c6 e2 e6 f3 f5";
		}
		else if(location.equals("d5")) {
			moves="b4 b6 c3 c7 e3 e7 f4 f6";
		}
		else if(location.equals("d6")) {
			moves="b5 b7 c4 c8 e4 e8 f5 f7";
		}
		else if(location.equals("d7")) {
			moves="b6 b8 c5 e5 f6 f8";
		}
		else if(location.equals("d8")) {
			moves="b7 c6 e6 f7";
		}
		else if(location.equals("e1")) {
			moves="c2 d3 f3 g2";
		}
		else if(location.equals("e2")) {
			moves="c1 c3 d4 f4 g1 g3";
		}
		else if(location.equals("e3")) {
			moves="c2 c4 d1 d5 f1 f5 g2 g4";
		}
		else if(location.equals("e4")) {
			moves="c3 c5 d2 d6 f2 f6 g3 g5";
		}
		else if(location.equals("e5")) {
			moves="c4 c6 d3 d7 f3 f7 g4 g6";
		}
		else if(location.equals("e6")) {
			moves="c5 c7 d4 d8 f4 f8 g5 g7";
		}
		else if(location.equals("e7")) {
			moves="c6 c8 d5 f5 g6 g8";
		}
		else if(location.equals("e8")) {
			moves="c7 d6 f6 g7";
		}
		else if(location.equals("f1")) {
			moves="d2 e3 g3 h2";
		}
		else if(location.equals("f2")) {
			moves="d1 d3 e4 g4 h1 h3";
		}
		else if(location.equals("f3")) {
			moves="d2 d4 e1 e5 g1 g5 h2 h4";
		}
		else if(location.equals("f4")) {
			moves="d3 d5 e2 e6 g2 g6 h3 h5";
		}
		else if(location.equals("f5")) {
			moves="d4 d6 e3 e7 g3 g7 h4 h6";
		}
		else if(location.equals("f6")) {
			moves="d5 d7 e4 e8 g4 g8 h5 h7";
		}
		else if(location.equals("f7")) {
			moves="d6 d8 e5 g5 h6 h8";
		}
		else if(location.equals("f8")) {
			moves="d7 e6 g6 h7";
		}
		else if(location.equals("g1")) {
			moves="e2 f3 h3";
		}
		else if(location.equals("g2")) {
			moves="e1 e3 f4 h4";
		}
		else if(location.equals("g3")) {
			moves="e2 e4 f1 f5 h1 h5";
		}
		else if(location.equals("g4")) {
			moves="e3 e5 f2 f6 h2 h6";
		}
		else if(location.equals("g5")) {
			moves="e4 e6 f3 f7 h3 h7";
		}
		else if(location.equals("g6")) {
			moves="e5 e7 f4 f8 h4 h8";
		}
		else if(location.equals("g7")) {
			moves="e6 e8 f5 h5";
		}
		else if(location.equals("g8")) {
			moves="e7 f6 h6";
		}
		else if(location.equals("h1")) {
			moves="f2 g3";
		}
		else if(location.equals("h2")) {
			moves="f1 f3 g4";
		}
		else if(location.equals("h3")) {
			moves="f2 f4 g1 g5";
		}
		else if(location.equals("h4")) {
			moves="f3 f5 g2 g6";
		}
		else if(location.equals("h5")) {
			moves="f4 f6 g3 g7";
		}
		else if(location.equals("h6")) {
			moves="f5 f7 g4 g8";
		}
		else if(location.equals("h7")) {
			moves="f6 f8 g5";
		}
		else if(location.equals("h8")) {
			moves="f7 g6";
		}
		
		String[] array=moves.split(" ");
		return array;

	}
	
}
