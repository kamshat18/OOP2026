package circuit;

public class Resistor extends Circuit {
    private double resistance;
    private double potentialDifference = 0;

    public Resistor(double resistance) {
        this.resistance = resistance;
    }

    @Override public double getResistance()  { return resistance; }
    @Override public double getPotentialDiff(){ return potentialDifference; }

    @Override
    public void applyPotentialDiff(double V) {
        potentialDifference = V;
    }
}