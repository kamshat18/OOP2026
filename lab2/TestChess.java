package chess;

public class TestChess {
    public static void main(String[] args) {
        Piece[] pieces = {
            new Rook(new Position(0,0), "white"),
            new Knight(new Position(0,1), "white"),
            new Pawn(new Position(1,4), "white"),
            new Pawn(new Position(1,4),"black")
        };
        pieces[0].move(new Position(0,5)); 
        pieces[0].move(new Position(3,5)); 
        pieces[1].move(new Position(2,2)); 
        pieces[2].move(new Position(3,4)); 
        pieces[3].move(new Position(5,6));
    }
}
