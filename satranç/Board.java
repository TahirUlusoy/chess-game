import java.util.Arrays;
public class Board {
	
	private Piece[][] board = new Piece[8][8]; //harf column sayi sutun
	
	public Board(){
		for(int i=0;i<8;i++) {
			for(int k=0;k<8;k++) {
			board[i][k]=null;
			}
		}
	}
	
	public boolean blackSahIlearadaTasVArMi(){ //siyah sahi tehdit eden diger beyaz tasla arada tas var mi diye bakiyor 
		int x;
		char y;
		String location=findBlackKing();
		String[] moves=null;
		String son="";
		int count=1;
		for(int i=0;i<8;i++) {	
			for(int j=0;j<8;j++) {
				if(this.board[i][j]!=null && this.board[i][j].getColor().equals("white") ) {
					moves=this.board[i][j].getAllMoves();
					for(int k=0;k<moves.length;k++) {
						if(location.equals(moves[k])) {  
							String temp2=this.board[i][j].getPosition();  //sah ceken tasin yeri
							if(location.charAt(0)==temp2.charAt(0)) { // ayni harfdeyse
								if(temp2.charAt(1)-48<location.charAt(1)-48) {
									for(int n=(temp2.charAt(1)-48);n<(location.charAt(1)-48);n++) {
										son+=location.charAt(0);
										son+=n;
										if(this.getPiece(son)==null) {
											count++;
										}
										son="";
									}
										if(count==(location.charAt(1)-48)-(temp2.charAt(1)-48)) {  //arada tas yoksa
										return true;
										}
								}
								count=1;
								if(temp2.charAt(1)-48>location.charAt(1)-48) {
									for(int n=(temp2.charAt(1)-48);n>(location.charAt(1)-48);n--) {
										son+=location.charAt(0);
										son+=n;
										if(this.getPiece(son)==null) {
											count++;
										}
										son="";
									}
										if(count==(temp2.charAt(1)-48)-(location.charAt(1)-48)) {
										return true;
										}
								}
								count=1;
							}
							count=1;
							if((location.charAt(0)!=temp2.charAt(0)) && (location.charAt(1)==temp2.charAt(1))) { //ayni sayidaysa
								if(temp2.charAt(0)<location.charAt(0)) {
									for(char n=temp2.charAt(0);n<location.charAt(0);n++) {
										son+=n;
										son+=location.charAt(1)-48;
										if(this.getPiece(son)==null) {
											count++;
										}
										son="";
									}
										if(count==(location.charAt(0)-48)-(temp2.charAt(0)-48)) {
										return true;
										}
								}
								count=1;
								if(temp2.charAt(0)>location.charAt(0)) {
									for(char n=temp2.charAt(0);n>location.charAt(0);n--) {
										son+=n;
										son+=location.charAt(1)-48;
										if(this.getPiece(son)==null) {
											count++;
										}
										son="";
									}
										if(count==(temp2.charAt(1)-48)-(location.charAt(1)-48)) {
										return true;
										}
								}
								count=1;
							}
							count=1;
							if((temp2.charAt(0)<location.charAt(0)) &&(temp2.charAt(1)<location.charAt(1))) {
								x=temp2.charAt(1)-48;
								y=temp2.charAt(0);
								while(x< location.charAt(1)&& y<location.charAt(0)) {
									son+=y;
									son+=x;
									if(this.getPiece(son)==null) {
										count++;
									}
									son="";
									x++;
									y++;	
								}
									if(count==((location.charAt(1)-48)-(temp2.charAt(1)-48))) {
									return true;
									}
							}
							count=1;
							if((temp2.charAt(0)>location.charAt(0)) &&(temp2.charAt(1)>location.charAt(1))) {
									x=location.charAt(1)-48;
									y=location.charAt(0);
									while(x< temp2.charAt(1)&& y<temp2.charAt(0)) {
										son+=y;
										son+=x;
										if(this.getPiece(son)==null) {
											count++;
										}
										son="";
										x++;
										y++;	
									}
										if(count==((temp2.charAt(1)-48)-(location.charAt(1)-48))) {
										return true;
										}
							}
							count=1;	
							if((temp2.charAt(0)>location.charAt(0)) &&(temp2.charAt(1)<location.charAt(1))) {
									x=temp2.charAt(1)-48;
									y=location.charAt(0);
									while(x< location.charAt(1)-48 && y<temp2.charAt(0)) {
										son+=y;
										son+=x;
										if(this.getPiece(son)==null) {
											count++;
										}
										son="";
										x++;
										y++;	
									}
										if(count==((temp2.charAt(1)-48)-(location.charAt(1)-48))) {
										return true;
										}	
							}
							count=1;	
							if((location.charAt(0)>temp2.charAt(0)) &&(location.charAt(1)<temp2.charAt(1))) {
									x=temp2.charAt(1)-48;
									y=temp2.charAt(0);
									while(x> location.charAt(1)-48 && y<location.charAt(0)) {
										son+=y;
										son+=x;
										if(this.getPiece(son)==null) {	
											count++;
										}
										son="";
										x--;
										y++;			
									}
										if(count==((temp2.charAt(1)-48))-(location.charAt(1)-48)) {	
										return true;
										}	
							}
							count=1;
						}
					}
				}		
			}
		}
		return false;
	}
	
	public boolean whiteSahIlearadaTasVArMi(){ //beyaz sahi tehdit eden diger siyah tasla arada tas var mi diye bakiyor
		int x;
		char y;
		String location=findWhiteKing();
		String[] moves=null;
		String son="";
		int count=1;
		for(int i=0;i<8;i++) {	
			for(int j=0;j<8;j++) {
				if(this.board[i][j]!=null && this.board[i][j].getColor().equals("black") ) {
					moves=this.board[i][j].getAllMoves();
					for(int k=0;k<moves.length;k++) {
						if(location.equals(moves[k])) {
							String temp2=this.board[i][j].getPosition();
							if(location.charAt(0)==temp2.charAt(0)) {
								if(temp2.charAt(1)-48<location.charAt(1)-48) {
									for(int n=(temp2.charAt(1)-48);n<(location.charAt(1)-48);n++) {
										son+=location.charAt(0);
										son+=n;
										if(this.getPiece(son)==null) {
											count++;
										}
										son="";
									}
										if(count==(location.charAt(1)-48)-(temp2.charAt(1)-48)) {
										return true;
										}
								}
								count=1;
								if(temp2.charAt(1)-48>location.charAt(1)-48) {
									for(int n=(temp2.charAt(1)-48);n>(location.charAt(1)-48);n--) {
										son+=location.charAt(0);
										son+=n;
										if(this.getPiece(son)==null) {
											count++;
										}
										son="";
									}
										if(count==(temp2.charAt(1)-48)-(location.charAt(1)-48)) {
										return true;
										}
								}
								count=1;
							}
							count=1;
							if((location.charAt(0)!=temp2.charAt(0)) && (location.charAt(1)==temp2.charAt(1))) {
								if(temp2.charAt(0)<location.charAt(0)) {
									for(char n=temp2.charAt(0);n<location.charAt(0);n++) {
										son+=n;
										son+=location.charAt(1)-48;									
										if(this.getPiece(son)==null) {
											count++;
										}
										son="";
									}
										if(count==(location.charAt(0)-48)-(temp2.charAt(0)-48)) {
										return true;
										}
								}
								count=1;
								if(temp2.charAt(0)>location.charAt(0)) {
									for(char n=temp2.charAt(0);n>location.charAt(0);n--) {
										son+=n;
										son+=location.charAt(1)-48;
										if(this.getPiece(son)==null) {
											count++;
										}
										son="";
									}
										if(count==(temp2.charAt(1)-48)-(location.charAt(1)-48)) {
										return true;
										}
								}
								count=1;
							}
							count=1;
							if((temp2.charAt(0)<location.charAt(0)) &&(temp2.charAt(1)<location.charAt(1))) {
								x=temp2.charAt(1)-48;
								y=temp2.charAt(0);
								while(x< location.charAt(1)&& y<location.charAt(0)) {
									son+=y;
									son+=x;
									if(this.getPiece(son)==null) {
										count++;
									}
									son="";
									x++;
									y++;	
								}
									if(count==((location.charAt(1)-48)-(temp2.charAt(1)-48))) {
									return true;
									}
							}
							count=1;	
							if((temp2.charAt(0)>location.charAt(0)) &&(temp2.charAt(1)>location.charAt(1))) {
									x=location.charAt(1)-48;
									y=location.charAt(0);
									while(x< temp2.charAt(1)&& y<temp2.charAt(0)) {
										son+=y;
										son+=x;
										if(this.getPiece(son)==null) {
											count++;
										}
										son="";
										x++;
										y++;	
									}
									if(count==((temp2.charAt(1)-48)-(location.charAt(1)-48))) {
										return true;
									}
								}
							count=1;	
							if((temp2.charAt(0)>location.charAt(0)) &&(temp2.charAt(1)<location.charAt(1))) {
									x=temp2.charAt(1)-48;
									y=location.charAt(0);
									while(x< location.charAt(1)-48 && y<temp2.charAt(0)) {
										son+=y;
										son+=x;
										if(this.getPiece(son)==null) {
											count++;
										}
										son="";
										x++;
										y++;	
									}
									if(count==((temp2.charAt(1)-48)-(location.charAt(1)-48))) {
										return true;
									}	
							}
							count=1;
							if((location.charAt(0)>temp2.charAt(0)) &&(location.charAt(1)<temp2.charAt(1))) {
									x=temp2.charAt(1)-48;
									y=temp2.charAt(0);
									while(x> location.charAt(1)-48 && y<location.charAt(0)) {
										son+=y;
										son+=x;
										if(this.getPiece(son)==null) {
											count++;
										}
										System.out.println("count "+count);
										son="";
										x--;
										y++;		
									}
									if(count==((temp2.charAt(1)-48))-(location.charAt(1)-48)) {
										return true;
									}	
							}
							count=1;
						}
					}
				}
			}
		}
		return false;
	}
	
	public boolean tasYeme() { //once sahi tehdit eden tasi bulup,sonra o tasi yiyebilen tas var mi diye bakiyor
		if(check("black")) {
			String location=findBlackKing();
			String[] moves=null;
			String[] moves2=null;
			String temp2="";
			for(int i=0;i<8;i++) {			
				for(int j=0;j<8;j++) {
					if(this.board[i][j]!=null && this.board[i][j].getColor().equals("white") ) {
						moves=this.board[i][j].getAllMoves();
						for(int k=0;k<moves.length;k++) {						
							if(location.equals(moves[k])) {
								temp2=this.board[i][j].getPosition();	 //sah ceken tas							
								for(int m=0;m<8;m++) {
									for(int n=0;n<8;n++) {										
										if(this.board[m][n]!=null && this.board[m][n].getColor().equals("black") && (!this.board[m][n].getTip().equals("King")) ) {										
											moves2=this.board[m][n].getAllMoves();
											for(int l=0;l<moves2.length;l++) {
												if(temp2.equals(moves2[l])) {
													return false;  //sah ceken tasi yiyebiliyorsa
												}
											}
										}
									}	
								}
							}
						}
					}
				}
			}
		}
		
		if(check("white")) {
			String location=findWhiteKing();
			String[] moves=null;
			String[] moves2=null;
			String temp2="";
			for(int i=0;i<8;i++) {
				for(int j=0;j<8;j++) {
					if(this.board[i][j]!=null && this.board[i][j].getColor().equals("black") ) {
						moves=this.board[i][j].getAllMoves();
						for(int k=0;k<moves.length;k++) {						
							if(location.equals(moves[k])) {
								temp2=this.board[i][j].getPosition();								
								for(int m=0;m<8;m++) {
									for(int n=0;n<8;n++) {										
										if(this.board[m][n]!=null && this.board[m][n].getColor().equals("white") && (!this.board[m][n].getTip().equals("King")) ) {										
											moves2=this.board[m][n].getAllMoves();
											for(int l=0;l<moves2.length;l++) {
												if(temp2.equals(moves2[l])) {
													return false;
												}
											}
										}
									}	
								}
							}
						}
					}
				}
			}
		}
		return true;
	}
	
	public boolean sahinOnuneTasCekme() {  //sahin onune tas cekerek mat olmasini engelliyor mu
		boolean check=true;
		
		if(check("black")) {
			int count2=0;
			String location=findBlackKing();
			String[] moves=null;
			String[] moves2=null;
			String[] moves3=null;  //sahi ceken tasin moves lari
			String temp2="";
			for(int i=0;i<8;i++) {	
				for(int j=0;j<8;j++) {	
					if(this.board[i][j]!=null && this.board[i][j].getColor().equals("white") ) {
						moves=this.board[i][j].getAllMoves();
						for(int k=0;k<moves.length;k++) {						
							if(location.equals(moves[k])) {
								temp2=this.board[i][j].getPosition();			//sahi ceken tas		
								moves3=this.getPiece(temp2).getAllMoves();			
								for(int m=0;m<8;m++) {		
									for(int n=0;n<8;n++) {																		
										if(this.board[m][n]!=null && this.board[m][n].getColor().equals("black") && (!this.board[m][n].getTip().equals("King")) ) {										
											moves2=this.board[m][n].getAllMoves();
											for(int p=0;p<moves3.length;p++) {
												for(int s=0;s<moves2.length;s++) {
													if(moves3[p].equals(moves3[s])) {
														count2++;
													}
												}
											}
										}	
									}	
								}
							}
						}
					}
				}
			}
			if(count2==1) {
				check=false;
			}
			count2=0;
		}
		
		if(check("white")) {
			int count=0;
			String location=findWhiteKing();
			String[] moves=null;
			String[] moves2=null;
			String[] moves3=null;
			String temp2="";
			for(int i=0;i<8;i++) {	
				for(int j=0;j<8;j++) {	
					if(this.board[i][j]!=null && this.board[i][j].getColor().equals("black") ) {
						moves=this.board[i][j].getAllMoves();
						for(int k=0;k<moves.length;k++) {						
							if(location.equals(moves[k])) {
								temp2=this.board[i][j].getPosition();			//sahi ceken tas		
								moves3=this.getPiece(temp2).getAllMoves();			//sahi ceken tasin moves lari
								for(int m=0;m<8;m++) {		
									for(int n=0;n<8;n++) {																		
										if(this.board[m][n]!=null && this.board[m][n].getColor().equals("white") && (!this.board[m][n].getTip().equals("King")) ) {										
											moves2=this.board[m][n].getAllMoves();
											for(int p=0;p<moves3.length;p++) {
												for(int s=0;s<moves2.length;s++) {
													if(moves3[p].equals(moves2[s])) {
														count++;
													}
												}
											}
										}
									}	
								}
							}
						}
					}
				}
			}
			if(count==1) {
				check=false;
			}
			count=0;
		}	
		return check;
			
	}
	
	public String findBlackKing() { 
		String location="";
		for(int i=0;i<8;i++) {			
			for(int j=0;j<8;j++) {
				if(this.board[i][j]!=null) {
					if(this.board[i][j].getTip().equals("King")) {
						if(this.board[i][j].getColor().equals("black")) {
						location=this.board[i][j].getPosition();
						}
					}
				}
			}
		}
		return location;
	}
	
	public String findWhiteKing() {
		String location="";
		for(int i=0;i<8;i++) {			
			for(int j=0;j<8;j++) {
				if(this.board[i][j]!=null) {
					if(this.board[i][j].getTip().equals("King")) {
						if(this.board[i][j].getColor().equals("white")) {
						location=this.board[i][j].getPosition();
						}
					}
				}
			}
		}
		return location;
	}
	//coordinate2 :row coordinate1:column
	public boolean putPiece(Piece p, String pos){
		if(pos.equals("a1") ||pos.equals("a2") ||pos.equals("a3") ||pos.equals("a4") ||pos.equals("a5") ||pos.equals("a6") ||pos.equals("a7") ||pos.equals("a8") ||pos.equals("b1") ||pos.equals("b2") ||pos.equals("b3") ||pos.equals("b4") ||pos.equals("b5") ||pos.equals("b6") ||pos.equals("b7") ||pos.equals("b8") ||pos.equals("c1") ||pos.equals("c2") ||pos.equals("c3") ||pos.equals("c4") ||pos.equals("c5") ||pos.equals("c6") ||pos.equals("c7") ||pos.equals("c8") ||pos.equals("d1") ||pos.equals("d2") ||pos.equals("d3") ||pos.equals("d4") ||pos.equals("d5") ||pos.equals("d6") ||pos.equals("d7") ||pos.equals("d8") ||pos.equals("e1") ||pos.equals("e2") ||pos.equals("e3") ||pos.equals("e4") ||pos.equals("e5") ||pos.equals("e6") ||pos.equals("e7") ||pos.equals("e8") ||pos.equals("f1") ||pos.equals("f2") ||pos.equals("f3") ||pos.equals("f4") ||pos.equals("f5") ||pos.equals("f6") ||pos.equals("f7") ||pos.equals("f8") ||pos.equals("g1") ||pos.equals("g2") ||pos.equals("g3") ||pos.equals("g4") ||pos.equals("g5") ||pos.equals("g6") ||pos.equals("g7") ||pos.equals("g8") ||pos.equals("h1") ||pos.equals("h2") ||pos.equals("h3") ||pos.equals("h4") ||pos.equals("h5") ||pos.equals("h6")||pos.equals("h7") ||pos.equals("h8") ) {
		int coordinate1 =9999;
		if(pos.charAt(0)=='a') {
			coordinate1=0;
		}
		else if(pos.charAt(0)=='b') {
			coordinate1=1;
		}
		else if(pos.charAt(0)=='c') {
			coordinate1=2;
		}
		else if(pos.charAt(0)=='d') {
			coordinate1=3;
		}
		else if(pos.charAt(0)=='e') {
			coordinate1=4;
		}
		else if(pos.charAt(0)=='f') {
			coordinate1=5;
		}
		else if(pos.charAt(0)=='g') {
			coordinate1=6;
		}
		else if(pos.charAt(0)=='h') {
			coordinate1=7;
		}
		int coordinate2=8-(pos.charAt(1)-48);
		
		board[coordinate2][coordinate1] = p;
		p.setPosition(pos);
			return true;
		}
		return false;
	}
	
	public Piece getPiece(String pos) {
		int coordinate1 =9999;
		Piece copy=null;
		if(pos.charAt(0)=='a') {
			coordinate1=0;
		}
		else if(pos.charAt(0)=='b') {
			coordinate1=1;
		}
		else if(pos.charAt(0)=='c') {
			coordinate1=2;
		}
		else if(pos.charAt(0)=='d') {
			coordinate1=3;
		}
		else if(pos.charAt(0)=='e') {
			coordinate1=4;
		}
		else if(pos.charAt(0)=='f') {
			coordinate1=5;
		}
		else if(pos.charAt(0)=='g') {
			coordinate1=6;
		}
		else if(pos.charAt(0)=='h') {
			coordinate1=7;
		}
		int coordinate2 = 8-(pos.charAt(1)-48);
		
		if(coordinate1>=8 && coordinate2>=8)
			System.exit(0);
		else
		copy = board[coordinate2][coordinate1];
		return copy;
	}
	
	public boolean check(String color){    
		String location="";
		if(color.equals("white") && whiteSahIlearadaTasVArMi()) {
			location=findWhiteKing();
			for(int i=0;i<8;i++) {
				for(int j=0;j<8;j++) {
					if(this.board[i][j]!=null && this.board[i][j].getColor().equals("black") && (!(this.board[i][j].getTip().equals("King")))) {
						String [] array=this.board[i][j].getAllMoves();
						for(int k=0;k<array.length;k++) {
							if(array[k].equals(location)) {
								return true;
							}
						}
					}
				}
			}	
		}
		
		if(color.equals("black") && blackSahIlearadaTasVArMi()) {
			location=findBlackKing();
			for(int i=0;i<8;i++) {
				for(int j=0;j<8;j++) {
					if(this.board[i][j]!=null && this.board[i][j].getColor().equals("white") && (!(this.board[i][j].getTip().equals("King")))) {
						String [] array=this.board[i][j].getAllMoves();
						for(int k=0;k<array.length;k++) {
							if(array[k].equals(location)) {
								return true;
							}
						}
					}
				}
			}	
		}
		return false;
	}
	
	public boolean checkMate(String color){ 
		String [] array=new String[1000];
		int count=0;
		String location="";
		String [] tempArray2=null;
		
		if(color.equals("white") && check("white") && tasYeme() && sahinOnuneTasCekme()) {
			location=findWhiteKing();
			for(char i=0;i<8;i++) {
				for(int j=0;j<8;j++) {
					if((this.board[i][j]!=null) &&((this.board[i][j].getTip().equals("Bishop")) || (this.board[i][j].getTip().equals("Rook")) || (this.board[i][j].getTip().equals("Queen")) || (this.board[i][j].getTip().equals("Pawn")) || (this.board[i][j].getTip().equals("Knight"))) && (this.board[i][j]!=null) && (this.board[i][j].getColor().equals("black"))) {
						String [] tempArray=this.board[i][j].getAllMoves();
						for(int k=0;k<tempArray.length;k++) {
							array[count]=tempArray[k];
							count++;
						}
					}
				}
			}
			String patDurumu=findBlackKing();
			String [] blackKing=this.getPiece(patDurumu).getAllMoves();
			for(int s=0;s<blackKing.length;s++) {
				array[count]=blackKing[s];
				count++;
			}
			tempArray2=this.getPiece(location).getAllMoves();
			int count2=tempArray2.length;
			int count3=1;
			int i=0;
			while(i<tempArray2.length) {
				if(Arrays.asList(array).contains(tempArray2[i])) {
					count3++;
				}
				i++;
			}
			if(count3==count2) { //king in gidecegi yer yoksa
				return true;
			}
		}
		
		if(color.equals("black") && check("black") && tasYeme() && sahinOnuneTasCekme()) {	
			location=findBlackKing();
			for(int i=0;i<8;i++) {
				for(int j=0;j<8;j++) {
					if((this.board[i][j]!=null) &&((this.board[i][j].getTip().equals("Bishop")) || (this.board[i][j].getTip().equals("Rook")) || (this.board[i][j].getTip().equals("Queen")) || (this.board[i][j].getTip().equals("Pawn")) || (this.board[i][j].getTip().equals("Knight"))) && (this.board[i][j]!=null) && (this.board[i][j].getColor().equals("white"))) {
						String [] tempArray=this.board[i][j].getAllMoves();
						for(int k=0;k<tempArray.length;k++) {
							array[count]=tempArray[k];
							count++;
						}
					}
				}
			}
			String patDurumu=findWhiteKing();
			String [] whiteKing=this.getPiece(patDurumu).getAllMoves();
			for(int s=0;s<whiteKing.length;s++) {
				array[count]=whiteKing[s];
				count++;
			}
			tempArray2=this.getPiece(location).getAllMoves();
			int count2=tempArray2.length;
			int count3=0;
			int i=0;
			while(i<tempArray2.length) {
				if(Arrays.asList(array).contains(tempArray2[i])) {
					count3++;
				}
				i++;
			}
			if(count3==count2) { //king in gidecegi yer yoksa
				return true;
			}
		}
		return false;
	}
	
	public boolean isEmpty(String pos) {	
		if(this.getPiece(pos)==null)
			return true;
		return false;	
	}
	
}
