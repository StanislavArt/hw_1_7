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
        System.out.printf("Данные ФИО сотрудника — %s%n", fullName.replace('ё', 'е'));
    }
}