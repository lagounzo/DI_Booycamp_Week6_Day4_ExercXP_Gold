import java.util.Random;

public class PairOfDice {
    private int diets;
    private int dietx;

    public int getDiets() {
        return diets;
    }

    public void setDiets(int diets) {
        this.diets = diets;
    }

    public int getDietx() {
        return dietx;
    }

    public void setDietx(int dietx) {
        this.dietx = dietx;
    }

    public int dietSum() {
        return diets + dietx;
    }

    public void throwDiet() {
        diets = new Random().nextInt(6);
        dietx = new Random().nextInt(6);
    }

    @Override
    public String toString() {
        return "PairOfDice{" +
                "diets=" + diets +
                ", dietx=" + dietx +
                '}';
    }
}
