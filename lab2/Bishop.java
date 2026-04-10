package chess;

public class Bishop extends Piece {
    public Bishop(Position pos, String color) { super(pos, color); }

    @Override
    public boolean isLegalMove(Position target) {
        int dr = Math.abs(target.getRow() - position.getRow());
        int dc = Math.abs(target.getCol() - position.getCol());
        return dr == dc && dr != 0;
    }
}