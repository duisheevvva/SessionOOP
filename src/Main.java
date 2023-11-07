import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        Filosofy filosofy1 = new Filosofy("Gulumkan", 4, "Voina", "Aizat");
        Filosofy filosofy2 = new Filosofy("Gulbarchyn", 3, "Love", "Datka");
        Filosofy[] filosofies = {filosofy1, filosofy2};

//        System.out.println("Write author name: ");
//        filosofy1.getFilosofByAuthor(filosofies, scanner.nextLine());


        Luchniki luchniki1 = new Luchniki("Nurlan", 14, "HoursLuchnik", "3");
        Luchniki luchniki2 = new Luchniki("Nurislam", 13, "HoursLuchnik", "4");

        Rysary rysary1 = new Rysary("Mederbek", 4, "qwrety", 26);
        Rysary rysary2 = new Rysary("Avaz", 3, "qwrety", 20);


        Filosofy newFilosofy = null;
        for (int i = 0; i < filosofies.length; i++) {
            for (int j = 0; j < filosofies.length - 1; j++) {
                if (filosofies[j].getCount() < filosofies[j + 1].getCount()) {
//                    newFilosofy.setCount(filosofies[j].getCount());
                    newFilosofy = filosofies[j];
                    filosofies[j] = filosofies[j + 1];
                    filosofies[j + 1] = newFilosofy;
                }
            }
        }
        System.out.println(Arrays.toString(filosofies));


    }

}