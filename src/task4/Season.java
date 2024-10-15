package task4;

public class Season {
    String season;
    void getSeason(int monthNumber) {

        if (monthNumber >= 1 && monthNumber <= 12) {
            switch (monthNumber) {
                case 12: case 1: case 2:
                    season = "Зима";
                    break;
                case 3: case 4: case 5:
                    season = "Весна";
                    break;
                case 6: case 7: case 8:
                    season = "Лето";
                    break;
                case 9: case 10: case 11:
                    season = "Осень";
                    break;
                default:
                    season = "Неизвестный сезон";
            }
            System.out.println("Сезон: " + season);
        } else {
            System.out.println("Ошибка: Введено некорректное значение. Месяц должен быть от 1 до 12.");
        }
    }
}
