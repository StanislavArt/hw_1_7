public class Main {
    public static void main(String[] args) {
        // task1
        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = lastName + " " + firstName + " " + middleName;

        System.out.printf("ФИО сотрудника — %s%n", fullName );

        //task2
        System.out.printf("Данные ФИО сотрудника для заполнения отчета — %s%n", fullName.toUpperCase());

        //task3
        fullName = "Иванов Семён Семёнович";

        // variation 1
        System.out.printf("Вариант 1. Данные ФИО сотрудника — %s%n", fullName.replace('ё', 'е'));

        // variation 2: используются функции split(), contains()
        String[] buf = fullName.split(" ");
        System.out.print("Вариант 2. Данные ФИО сотрудника —");
        for (int i=0; i < buf.length; i++) {
            if (buf[i].contains("ё")) {
                System.out.print(" " + buf[i].replace('ё', 'е'));
            } else {
                System.out.print(" " + buf[i]);
            }
        }
    }
}