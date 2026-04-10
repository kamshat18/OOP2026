package circuit;

public class Parallel extends Circuit {
    private Circuit c1, c2;

    public Parallel(Circuit c1, Circuit c2) {
        this.c1 = c1; this.c2 = c2;
    }

    // Параллельное: 1/R = 1/R1 + 1/R2
    @Override
    public double getResistance() {
        return 1.0 / (1.0/c1.getResistance() + 1.0/c2.getResistance());
    }

    @Override
    public double getPotentialDiff() { return c1.getPotentialDiff(); }

    // Напряжение одинаково на обеих ветвях
    @Override
    public void applyPotentialDiff(double V) {
        c1.applyPotentialDiff(V);
        c2.applyPotentialDiff(V);
    }
}