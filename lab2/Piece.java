package chess;
public abstract class Piece {
    protected Position position;
    protected String color;

    public Piece(Position position, String color) {
        this.position = position;
        this.color = color;
    }

    public abstract boolean isLegalMove(Position target);

    public void move(Position target) {
        if (isLegalMove(target)) {
            position = target;
            System.out.println(getClass().getSimpleName()
                + " moved to " + target);
        } else {
            System.out.println("Illegal move: "
                + getClass().getSimpleName()
                + " can't go to " + target);
        }
    }
}