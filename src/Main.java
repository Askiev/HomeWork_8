public class Main {
    public static void main(String[] args) {

        task1();
        task2();
        task3();
    }
    private static void task1() {

        String firsName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = lastName + " " + firsName + " " + middleName;
        System.out.println("ФИО сотрудника — " + fullName);
    }
    private static void task2() {

        String fullName = "Ivanov Ivan Ivanovich";
        String upperFullName = fullName.toUpperCase();
        System.out.println("Данные ФИО сотрудника для заполнения отчета —" + upperFullName);
    }
    private static void task3() {

        String fullName = "Иванов Семён Семёнович";
        String fixedFullName = fullName.replace("ё", "e");
        System.out.println("Данные ФИО сотрудника — " + fixedFullName);
    }
}
