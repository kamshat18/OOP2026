package chess;

public class Position {
    private int row, col; 

    public Position(int row, int col) { this.row=row; this.col=col; }

    public int getRow() { return row; }
    public int getCol() { return col; }

    @Override
    public String toString() {
        return (char)('A' + col) + "" + (row + 1);
    }
}