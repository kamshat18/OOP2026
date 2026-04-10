package chess;

public class King extends Piece {
    public King(Position pos, String color) { super(pos, color); }

    @Override
    public boolean isLegalMove(Position target) {
        int dr = Math.abs(target.getRow() - position.getRow());
        int dc = Math.abs(target.getCol() - position.getCol());
        return dr <= 1 && dc <= 1 && !(dr==0 && dc==0);
    }
}