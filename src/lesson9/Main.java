package lesson9;

public class Main {
    public static void main(String[] args) {
        Author AlexPushkin = new Author("Александр", "Пушкин");
        Book Ruslan_and_Ludmila = new Book("Руслан и Людмила", 1820, AlexPushkin);

        Ruslan_and_Ludmila.setDataPublication(1820);
        System.out.println(Ruslan_and_Ludmila);
        System.out.println(AlexPushkin);

    }
}