package circuit;

public abstract class Circuit {
    public abstract double getResistance();
    public abstract double getPotentialDiff();
    public abstract void   applyPotentialDiff(double V);

    //Закон Ома: I = V / R
    public double getCurrent() {
        return getPotentialDiff() / getResistance();
    }

    // Мощность: P = V² / R
    public double getPower() {
        double V = getPotentialDiff();
        return V * V / getResistance();
    }
}