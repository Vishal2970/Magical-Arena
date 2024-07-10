import java.util.Random;

public class dice {
    private Random random;
    private int sides;

    public dice(int sides) {
        this.sides = sides;
        this.random = new Random();
    }

    public int roll() {
        return random.nextInt(sides) + 1;
    }
}
