package task1;
public class Main {
    public static void main(String[] args) {

        Student student1 = new Student();
        student1.name = "Adilet";
        student1.age = 18;
        student1.group = "Java";

        Student student2 = new Student();
        student2.name = "Fatima";
        student2.age = 20;
        student2.group = "Js";

        Student[] students = {student1,student2};


//        TODO Task 1
        int counterJava =0;
        int counterJs =0;
        for (Student student : students) {
            if (student.group.equals("Java")){
                counterJava++;
            }else {
                counterJs++;
            }
        }
        System.out.println(counterJava);
        System.out.println(counterJs);



//        TODO Task2
        int javaCount = 0;
        int jsCount = 0;
        int totalAge = 0;

        for (Student student : students) {
            if (student.group.equals("Java")) {
                javaCount++;
            } else {
                jsCount++;
            }
            totalAge += student.age;
        }

        double averageAge = (double) totalAge / students.length;

        System.out.println("Java: " + javaCount);
        System.out.println("Js: " + jsCount);
        System.out.println("Средний возраст студентов: " + averageAge);
    }


    }

