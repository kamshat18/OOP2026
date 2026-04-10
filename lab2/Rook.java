package chess;

public class Rook extends Piece {
    public Rook(Position pos, String color) { super(pos, color); }

    @Override
    public boolean isLegalMove(Position target) {
        return position.getRow() == target.getRow()
            || position.getCol() == target.getCol();
    }
}