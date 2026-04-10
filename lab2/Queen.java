package chess;

public class Queen extends Piece {
    public Queen(Position pos, String color) { super(pos, color); }

    @Override
    public boolean isLegalMove(Position target) {
        int dr = Math.abs(target.getRow() - position.getRow());
        int dc = Math.abs(target.getCol() - position.getCol());
        if (dr==0 && dc==0) return false;
        return dr==0 || dc==0 || dr==dc; // прямая ИЛИ диагональ
    }
}