package task5;

public class Main {
    public static void main(String[] args) {
        Flower flower1 = new Flower();
        flower1.flowerName = "Roza";
        flower1.freshness = 3;
        flower1.price = 120;

        Flower flower2 = new Flower();
        flower2.flowerName = "Roza";
        flower2.freshness = 3;
        flower2.price = 100;

        Flower[] flowers = {flower1,flower2};

        System.out.println("Max price: " + flower1.getMaxPrice(flowers));
        flower1.sortByFreshness(flowers);
    }
}
