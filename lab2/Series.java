package circuit;

public class Series extends Circuit {
    private Circuit c1, c2;

    public Series(Circuit c1, Circuit c2) {
        this.c1 = c1; this.c2 = c2;
    }

    // Последовательное: складываем сопротивления
    @Override
    public double getResistance() {
        return c1.getResistance() + c2.getResistance();
    }

    @Override
    public double getPotentialDiff() {
        return c1.getPotentialDiff() + c2.getPotentialDiff();
    }

    // Ток одинаков: I = V/R, напряжение делится пропорционально R
    @Override
    public void applyPotentialDiff(double V) {
        double I = V / getResistance();
        c1.applyPotentialDiff(I * c1.getResistance());
        c2.applyPotentialDiff(I * c2.getResistance());
    }
}