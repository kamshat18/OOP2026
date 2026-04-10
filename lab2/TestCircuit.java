package circuit;

public class TestCircuit {
    public static void main(String[] args) {
        Circuit a = new Resistor(3.0);
        Circuit b = new Resistor(3.0);
        Circuit c = new Resistor(6.0);
        Circuit d = new Resistor(3.0);
        Circuit e = new Resistor(2.0);

        Circuit f = new Series(a, b);      // 3+3 = 6 Ω
        Circuit g = new Parallel(c, d);    // 6||3 = 2 Ω
        Circuit h = new Series(g, e);      // 2+2 = 4 Ω
        Circuit circuit = new Parallel(h, f);   // 4||6 = 2.4 Ω

        System.out.println("R = " + circuit.getResistance()); // 2.4

        circuit.applyPotentialDiff(12.0);
        System.out.println("I = " + circuit.getCurrent()); // 5 A
        System.out.println("P = " + circuit.getPower());   // 60 W
    }
}