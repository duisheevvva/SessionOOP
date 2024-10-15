package task5;

public class Flower {
    String flowerName;
    int freshness;
    int price;

    public double getMaxPrice(Flower[] flowers) {
        double maxPrice = flowers[0].price;

        for (Flower flower : flowers) {
            if (flower.price > maxPrice) {
                maxPrice = flower.price;
            }
        }
        return maxPrice;
    }

    public  void sortByFreshness(Flower[] flowers) {
        int n = flowers.length; // Массивдин узундугун алабыз
        for (int i = 0; i < n - 1; i++) { // Сырткы цикл  массивдеги элементтерди айлантат
            for (int j = 0; j < n - i - 1; j++) { // Ички цикл элементтерди салыштырат
                if (flowers[j].freshness > flowers[j + 1].freshness) { // Эгер j индекстеги гүлдүн жаңылыгы j + 1 индекстеги гүлдөн чоң болсо
                    Flower temp = flowers[j]; // Свежийраак  гүлдү убактылуу сакта алдык
                    flowers[j] = flowers[j + 1]; // j индекстеги гүлдү ойдого жылдырат
                    flowers[j + 1] = temp; // j + 1 индекстеги гүлдү ойдого жылдырат
                }
            }
        }
    }
}


