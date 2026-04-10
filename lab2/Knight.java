package chess;
public class Knight extends Piece {
    public Knight(Position pos, String color) { super(pos, color); }

    @Override
    public boolean isLegalMove(Position target) {
        int dr = Math.abs(target.getRow() - position.getRow());
        int dc = Math.abs(target.getCol() - position.getCol());
        return (dr==2 && dc==1) || (dr==1 && dc==2);
    }
}