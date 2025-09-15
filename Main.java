public class Main
{
    public static void main(String[] args)
    {
        Feeder f = null;

        f = new Feeder(500);
        f.simulateOneDay(12);
        System.out.println("current food: " + f.getCurrentFood());

        f = new Feeder(1000);
        f.simulateOneDay(22);
        System.out.println("current food: " + f.getCurrentFood());

        f = new Feeder(100);
        f.simulateOneDay(5);
        System.out.println("current food: " + f.getCurrentFood());




        f = new Feeder(2400);
        System.out.println(f.simulateManyDays(10, 4) + " days");

        f = new Feeder(250);
        System.out.println(f.simulateManyDays(10, 5) + " days");

        f = new Feeder(0);
        System.out.println(f.simulateManyDays(5, 10) + " days");
    }
}
