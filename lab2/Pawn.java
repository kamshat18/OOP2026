package chess;

public class Pawn extends Piece {
    public Pawn(Position pos, String color) { super(pos, color); }

    @Override
    public boolean isLegalMove(Position target) {
        int dr = target.getRow() - position.getRow(); // направленная!
        int dc = Math.abs(target.getCol() - position.getCol());
        if (dc != 0) return false; // только вперёд (бой упрощён)
        if (color.equals("white")) {
            if (dr == 1) return true;
            if (dr == 2 && position.getRow() == 1) return true;
        } else {
            if (dr == -1) return true;
            if (dr == -2 && position.getRow() == 6) return true;
        }
        return false;
    }
}