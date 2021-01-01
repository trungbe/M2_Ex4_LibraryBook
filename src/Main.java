import java.util.Scanner;

public class Main {
    public static final String LAST_OF_MONTH1 = "30";
    public static final String LAST_OF_MONTH2 = "31";
    public static CardManager cardManager = new CardManager();
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int choice;
        do {
            System.out.println("Menu");
            System.out.println("Enter your choice");
            System.out.println("1. Add new card");
            System.out.println("2. Display student by id");
            System.out.println("3. Display student return book on last month");
            System.out.println("0. Exit");
            choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    addNewCard();
                    break;
                case 2:
                    displayStudentById();
                    break;
                case 3:
                    displayStudentReturnBook();
                    break;
                case 0:
                    System.exit(0);
                    break;

            }
        } while (choice != 0);
    }

    public static void addNewCard() {
        System.out.println("Enter name");
        String name = scanner.nextLine();
        System.out.println("Enter student id");
        int studentId = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter birthday");
        String birthday = scanner.nextLine();
        System.out.println("Enter class");
        String classStudent = scanner.nextLine();
        System.out.println("Enter card id");
        int cardId = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter begin date");
        String beginDate = scanner.nextLine();
        System.out.println("Enter end date");
        String endDate = scanner.nextLine();
        System.out.println("Enter book code");
        int bookCode = Integer.parseInt(scanner.nextLine());
        Card card = new Card(name, studentId, birthday, classStudent, cardId, beginDate, endDate, bookCode);
        cardManager.addNewCard(card);
    }

    public static void displayStudentById() {
        System.out.println("Enter student ID");
        int studentId = Integer.parseInt(scanner.nextLine());
        cardManager.displayStudentById(studentId);
    }

    public static void displayStudentReturnBook() {
        String string = cardManager.StudentReturnBook(LAST_OF_MONTH1);
        String string1 = cardManager.StudentReturnBook(LAST_OF_MONTH2);
        System.out.println(string);
        System.out.println(string1);
    }
}
