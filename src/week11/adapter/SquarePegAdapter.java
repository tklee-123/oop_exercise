package week11.adapter;

public class SquarePegAdapter extends RoundPeg {
    private SquarePeg peg;

    public SquarePegAdapter(SquarePeg squarePeg) {
        super(squarePeg.getWidth());
        this.peg = squarePeg;
    }

    @Override
    public int getRadius() {
        return (int) (Math.sqrt(2 * peg.getWidth() * peg.getWidth()) / 2);
    }
}
