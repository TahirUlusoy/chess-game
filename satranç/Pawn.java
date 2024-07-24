import java.util.Arrays;
public class Pawn  extends Piece{
	
	public Pawn(String color) {
		super(color);	
	}
	
	public boolean canMove(String newPos){
		String [] moves = this.getAllMoves();
		if(Arrays.asList(moves).contains(newPos))
			return true;
		return false;
	}
	
	public String getTip() { 
		return "Pawn";
	}
	
	public String [] getAllMoves() {
		
		String moves = null;
		String location = this.getPosition();
		
		if(this.getColor().equals("white") && location.equals("a2")) {
			moves="a3 a4 b3";
		}
		else if(this.getColor().equals("white") && location.equals("a3")) {
			moves="a4 b4";
		}
		else if(this.getColor().equals("white") && location.equals("a4")) {
			moves="a5 b5";
		}
		else if(this.getColor().equals("white") && location.equals("a5")) {
			moves="a6 b6";
		}
		else if(this.getColor().equals("white") && location.equals("a6")) {
			moves="a7 b7";
		}
		else if(this.getColor().equals("white") && location.equals("a7")) {
			moves="a8 b8";
		}
		else if(this.getColor().equals("white") && location.equals("a8")) {
			moves="";
		}
		else if(this.getColor().equals("white") && location.equals("b2")) {
			moves="a3 b3 b4 c3";
		}
		else if(this.getColor().equals("white") && location.equals("b3")) {
			moves="a4 b4 c4";
		}
		else if(this.getColor().equals("white") && location.equals("b4")) {
			moves="a5 b5 c5";
		}
		else if(this.getColor().equals("white") && location.equals("b5")) {
			moves="a6 b6 c6";
		}
		else if(this.getColor().equals("white") && location.equals("b6")) {
			moves="a7 b7 c7";
		}
		else if(this.getColor().equals("white") && location.equals("b7")) {
			moves="a8 b8 c8";
		}
		else if(this.getColor().equals("white") && location.equals("b8")) {
			moves="";
		}
		else if(this.getColor().equals("white") && location.equals("c2")) {
			moves="b3 c3 c4 d3";
		}
		else if(this.getColor().equals("white") && location.equals("c3")) {
			moves="b4 c4 d4";
		}
		else if(this.getColor().equals("white") && location.equals("c4")) {
			moves="b5 c5 d5";
		}
		else if(this.getColor().equals("white") && location.equals("c5")) {
			moves="b6 c6 d6";
		}
		else if(this.getColor().equals("white") && location.equals("c6")) {
			moves="b7 c7 d7";
		}
		else if(this.getColor().equals("white") && location.equals("c7")) {
			moves="b8 c8 d8";
		}
		else if(this.getColor().equals("white") && location.equals("c8")) {
			moves="";
		}
		else if(this.getColor().equals("white") && location.equals("d2")) {
			moves="c3 d3 d4 e3";
		}
		else if(this.getColor().equals("white") && location.equals("d3")) {
			moves="c4 d4 e4";
		}
		else if(this.getColor().equals("white") && location.equals("d4")) {
			moves="c5 d5 e5";
		}
		else if(this.getColor().equals("white") && location.equals("d5")) {
			moves="c6 d6 e6";
		}
		else if(this.getColor().equals("white") && location.equals("d6")) {
			moves="c7 d7 e7";
		}
		else if(this.getColor().equals("white") && location.equals("d7")) {
			moves="c8 d8 e8";
		}
		else if(this.getColor().equals("white") && location.equals("d8")) {
			moves="";
		}
		else if(this.getColor().equals("white") && location.equals("e2")) {
			moves="d3 e3 e4 f3";
		}
		else if(this.getColor().equals("white") && location.equals("e3")) {
			moves="d4 e4 f4";
		}
		else if(this.getColor().equals("white") && location.equals("e4")) {
			moves="d5 e5 f5";
		}
		else if(this.getColor().equals("white") && location.equals("e5")) {
			moves="d6 e6 f6";
		}
		else if(this.getColor().equals("white") && location.equals("e6")) {
			moves="d7 e7 f7";
		}
		else if(this.getColor().equals("white") && location.equals("e7")) {
			moves="d8 e8 f8";
		}
		else if(this.getColor().equals("white") && location.equals("e8")) {
			moves="";
		}
		else if(this.getColor().equals("white") && location.equals("f2")) {
			moves="e3 f3 f4 g3";
		}
		else if(this.getColor().equals("white") && location.equals("f3")) {
			moves="e4 f4 g4";
		}
		else if(this.getColor().equals("white") && location.equals("f4")) {
			moves="e5 f5 g5";
		}
		else if(this.getColor().equals("white") && location.equals("f5")) {
			moves="e6 f6 g6";
		}
		else if(this.getColor().equals("white") && location.equals("f6")) {
			moves="e7 f7 g7";
		}
		else if(this.getColor().equals("white") && location.equals("f7")) {
			moves="e8 f8 g8";
		}
		else if(this.getColor().equals("white") && location.equals("f8")) {
			moves="";
		}
		else if(this.getColor().equals("white") && location.equals("g2")) {
			moves="f3 g3 g4 h3";
		}
		else if(this.getColor().equals("white") && location.equals("g3")) {
			moves="f4 g4 h4";
		}
		else if(this.getColor().equals("white") && location.equals("g4")) {
			moves="f5 g5 h5";
		}
		else if(this.getColor().equals("white") && location.equals("g5")) {
			moves="f6 g6 h6";
		}
		else if(this.getColor().equals("white") && location.equals("g6")) {
			moves="f7 g7 h7";
		}
		else if(this.getColor().equals("white") && location.equals("g7")) {
			moves="f8 g8 h8";
		}
		else if(this.getColor().equals("white") && location.equals("g8")) {
			moves="";
		}
		else if(this.getColor().equals("white") && location.equals("h2")) {
			moves="g3 h3 h4";
		}
		else if(this.getColor().equals("white") && location.equals("h3")) {
			moves="g4 h4";
		}
		else if(this.getColor().equals("white") && location.equals("h4")) {
			moves="g5 h5";
		}
		else if(this.getColor().equals("white") && location.equals("h5")) {
			moves="g6 h6";
		}
		else if(this.getColor().equals("white") && location.equals("h6")) {
			moves="g7 h7";
		}
		else if(this.getColor().equals("white") && location.equals("h7")) {
			moves="g8 h8";
		}
		else if(this.getColor().equals("white") && location.equals("h8")) {
			moves="";
		}
		
		//black pawn
		else if(this.getColor().equals("black") && location.equals("a7")) {
			moves="a6 a5 b6";
		}
		else if(this.getColor().equals("black") && location.equals("a6")) {
			moves="a5 b5";
		}
		else if(this.getColor().equals("black") && location.equals("a5")) {
			moves="a4 b4";
		}
		else if(this.getColor().equals("black") && location.equals("a4")) {
			moves="a3 b3";
		}
		else if(this.getColor().equals("black") && location.equals("a3")) {
			moves="a2 b2";
		}
		else if(this.getColor().equals("black") && location.equals("a2")) {
			moves="a1 b1";
		}
		else if(this.getColor().equals("black") && location.equals("a1")) {
			moves="";
		}
		else if(this.getColor().equals("black") && location.equals("b7")) {
			moves="a6 b6 b5 c6";
		}
		else if(this.getColor().equals("black") && location.equals("b6")) {
			moves="a5 b5 c5";
		}
		else if(this.getColor().equals("black") && location.equals("b5")) {
			moves="a4 b4 c4";
		}
		else if(this.getColor().equals("black") && location.equals("b4")) {
			moves="a3 b3 c3";
		}
		else if(this.getColor().equals("black") && location.equals("b3")) {
			moves="a2 b2 c2";
		}
		else if(this.getColor().equals("black") && location.equals("b2")) {
			moves="a1 b1 c1";
		}
		else if(this.getColor().equals("black") && location.equals("b1")) {
			moves="";
		}
		else if(this.getColor().equals("black") && location.equals("c7")) {
			moves="b6 c6 c5 d6";
		}
		else if(this.getColor().equals("black") && location.equals("c6")) {
			moves="b5 c5 d5";
		}
		else if(this.getColor().equals("black") && location.equals("c5")) {
			moves="b4 c4 d4";
		}
		else if(this.getColor().equals("black") && location.equals("c4")) {
			moves="b3 c3 d3";
		}
		else if(this.getColor().equals("black") && location.equals("c3")) {
			moves="b2 c2 d2";
		}
		else if(this.getColor().equals("black") && location.equals("c2")) {
			moves="b1 c1 d1";
		}
		else if(this.getColor().equals("black") && location.equals("c1")) {
			moves="";
		}
		else if(this.getColor().equals("black") && location.equals("d7")) {
			moves="c6 d6 d5 e6";
		}
		else if(this.getColor().equals("black") && location.equals("d6")) {
			moves="c5 d5 e5";
		}
		else if(this.getColor().equals("black") && location.equals("d5")) {
			moves="c4 d4 e4";
		}
		else if(this.getColor().equals("black") && location.equals("d4")) {
			moves="c3 d3 e3";
		}
		else if(this.getColor().equals("black") && location.equals("d3")) {
			moves="c2 d2 e2";
		}
		else if(this.getColor().equals("black") && location.equals("d2")) {
			moves="c1 d1 e1";
		}
		else if(this.getColor().equals("black") && location.equals("d1")) {
			moves="";
		}
		else if(this.getColor().equals("black") && location.equals("e7")) {
			moves="d6 e6 e5 f6";
		}
		else if(this.getColor().equals("black") && location.equals("e6")) {
			moves="d5 e5 f5";
		}
		else if(this.getColor().equals("black") && location.equals("e5")) {
			moves="d4 e4 f4";
		}
		else if(this.getColor().equals("black") && location.equals("e4")) {
			moves="d3 e3 f3";
		}
		else if(this.getColor().equals("black") && location.equals("e3")) {
			moves="d2 e2 f2";
		}
		else if(this.getColor().equals("black") && location.equals("e2")) {
			moves="d1 e1 f1";
		}
		else if(this.getColor().equals("black") && location.equals("e1")) {
			moves="";
		}
		else if(this.getColor().equals("black") && location.equals("f7")) {
			moves="e6 f6 f5 g6";
		}
		else if(this.getColor().equals("black") && location.equals("f6")) {
			moves="e5 f5 g5";
		}
		else if(this.getColor().equals("black") && location.equals("f5")) {
			moves="e4 f4 g4";
		}
		else if(this.getColor().equals("black") && location.equals("f4")) {
			moves="e3 f3 g3";
		}
		else if(this.getColor().equals("black") && location.equals("f3")) {
			moves="e2 f2 g2";
		}
		else if(this.getColor().equals("black") && location.equals("f2")) {
			moves="e1 f1 g1";
		}
		else if(this.getColor().equals("black") && location.equals("f1")) {
			moves="";
		}
		else if(this.getColor().equals("black") && location.equals("g7")) {
			moves="f6 g6 g5 h6";
		}
		else if(this.getColor().equals("black") && location.equals("g6")) {
			moves="f5 g5 h5";
		}
		else if(this.getColor().equals("black") && location.equals("g5")) {
			moves="f4 g4 h4";
		}
		else if(this.getColor().equals("black") && location.equals("g4")) {
			moves="f3 g3 h3";
		}
		else if(this.getColor().equals("black") && location.equals("g3")) {
			moves="f2 g2 h2";
		}
		else if(this.getColor().equals("black") && location.equals("g2")) {
			moves="f1 g1 h1";
		}
		else if(this.getColor().equals("black") && location.equals("g1")) {
			moves="";
		}
		else if(this.getColor().equals("black") && location.equals("h7")) {
			moves="g6 h7 h6";
		}
		else if(this.getColor().equals("black") && location.equals("h6")) {
			moves="g5 h5";
		}
		else if(this.getColor().equals("black") && location.equals("h5")) {
			moves="g4 h4";
		}
		else if(this.getColor().equals("black") && location.equals("h4")) {
			moves="g3 h3";
		}
		else if(this.getColor().equals("black") && location.equals("h3")) {
			moves="g2 h2";
		}
		else if(this.getColor().equals("black") && location.equals("h2")) {
			moves="g1 h1";
		}
		else if(this.getColor().equals("black") && location.equals("h1")) {
			moves="";
		}
		
		String[] array=moves.split(" ");
		return array;
	}
	
}
