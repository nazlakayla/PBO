package structural;

// Target Interface
class RoundHole {
    private double radius;

    public RoundHole(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public boolean fits(RoundPeg peg) {
        return peg.getRadius() <= radius;
    }
}

// Adaptee
class SquarePeg {
    private double width;

    public SquarePeg(double width) {
        this.width = width;
    }

    public double getWidth() {
        return width;
    }
}

// Adapter
class SquarePegAdapter extends RoundPeg {
    private SquarePeg squarePeg;

    public SquarePegAdapter(SquarePeg squarePeg) {
        this.squarePeg = squarePeg;
    }

    @Override
    public double getRadius() {
        // Convert square peg width to an equivalent radius
        return squarePeg.getWidth() * Math.sqrt(2) / 2;
    }
}

// RoundPeg: Compatible Class
class RoundPeg {
    private double radius;

    public RoundPeg() {}

    public RoundPeg(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }
}

// Main Class
public class AdapterPatternExample {
    public static void main(String[] args) {
        RoundHole roundHole = new RoundHole(5);
        RoundPeg roundPeg = new RoundPeg(5);

        System.out.println("Round peg fits: " + roundHole.fits(roundPeg));

        SquarePeg smallSquarePeg = new SquarePeg(5);
        SquarePeg largeSquarePeg = new SquarePeg(10);

        // Adapter allows SquarePeg to fit into RoundHole
        SquarePegAdapter smallPegAdapter = new SquarePegAdapter(smallSquarePeg);
        SquarePegAdapter largePegAdapter = new SquarePegAdapter(largeSquarePeg);

        System.out.println("Small square peg fits: " + roundHole.fits(smallPegAdapter));
        System.out.println("Large square peg fits: " + roundHole.fits(largePegAdapter));
    }
}
