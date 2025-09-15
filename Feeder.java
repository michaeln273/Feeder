import java.util.Random;

public class Feeder {
    /**
     * The amount of food, in grams, currently in the bird feeder; initialized
     * in the constructor and always greater than or equal to zero
     */
    private int currentFood;
    public Feeder(int food) {
        this.currentFood = food;
    }

    private int rand(int lower, int upper) {
        return (int)(Math.random() * (upper - lower)) + lower;
    }

    /**
     * Simulates one day with numBirds birds or possibly a bear at the bird
     * feeder, as described in part (a) Precondition: numBirds > 0
     */
    public void simulateOneDay(int numBirds)
    {
        int condition = this.rand(0, 100);

        if (condition > 95) {
            this.currentFood = 0;
            return;
        }

        int ate = this.rand(10, 50);
        for (int i = 0; i < numBirds; i++) {
            if (ate > this.currentFood) {
                this.currentFood = 0;
                return;
            }

            this.currentFood -= ate;
        }
    }

    /**
     * Returns the number of days birds or a bear found food to eat at the
     * feeder in this simulation, as described in part (b) Preconditions:
     * numBirds > 0, numDays > 0
     */
    public int simulateManyDays(int numBirds, int numDays) 
    {
        int days = 0;
        while (numDays > 0) {
            simulateOneDay(numBirds);
            numDays--;
            days++;
            if (this.currentFood == 0) {
                return days;
            }
        }

        return days;
    }

    public int getCurrentFood()
    {
        return this.currentFood;
    }
}
