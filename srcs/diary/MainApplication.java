package diary;
import java.util.Scanner;

public class MainApplication {

    private static final Scanner scanner = new Scanner(System.in);
    private static final Diaries diaries = new Diaries();


    public static void main(String[] args) {
        boolean continueLoop = true;

        while (continueLoop) {
            mainMenu();

            String username = scanner.nextLine();

            switch (username) {
                case "1":
                    registerDiary();
                    break;
                case "2":
                    loginDiary();
                    break;
                case "3":
                    continueLoop = false;
                    System.out.println("Thank you for using our application.");
                    break;

                default:
                    System.out.println("Invalid input. Please try again.");

            }

        }
    }


    private static void mainMenu() {
        System.out.println("""
                ============== DIARY APPLICATION ==============
                1. Register Diary
                2. Login Diary
                3. Logout Diary
                ===============================================
               
                """);
    }

    private static void registerDiary() {
        System.out.println("Enter Username: ");
        String username = scanner.nextLine();
        System.out.println("Enter Password: ");
        String password = scanner.nextLine();
        diaries.addDiary(username, password);
        System.out.println("Diary registered successfully!");

    }

    private static void loginDiary() {
        System.out.println("Enter Username: ");
        String username = scanner.nextLine();
        System.out.println("Enter Password: ");
        String password = scanner.nextLine();

        try {
            Diary diary = diaries.findByUsername(username);
            diary.unlockDiary(password);

            System.out.println("Diary logged successfully!");
            diaryMenu(diary);

        } catch (IllegalArgumentException exception){
            System.out.println(exception.getMessage());

    }
}

private static void diaryMenu(Diary diary) {
        boolean logout = false;
        while (!logout) {

        System.out.println("""
                    ================ DIARY MENU ================
                    1. Create Entry
                    2. Find Entry
                    3. Update Entry
                    4. Delete Entry
                    5. Logout Entry & Logout
                    ============================================
        """);

        System.out.print("Select an option: ");
        String option = scanner.nextLine();


            switch (option) {

                case "1":
                    System.out.print("Enter Title: ");
                    String title = scanner.nextLine();

                    System.out.print("Enter Body: ");
                    String body = scanner.nextLine();

                    diary.createEntry(title, body);
                    System.out.println("Entry created successfully.");
                    break;

                case "2":
                    System.out.print("Enter Entry ID: ");
                    int id = Integer.parseInt(scanner.nextLine());

                    Entry entry = diary.findEntryById(id);

                    if (entry != null) {
                        System.out.println("Title: " + entry.getTitle());
                        System.out.println("Body : " + entry.getBody());
                    } else {
                        System.out.println("Entry not found.");
                    }
                    break;

                case "3":
                    System.out.print("Enter Entry ID: ");
                    int updateId = Integer.parseInt(scanner.nextLine());

                    System.out.print("Enter New Title: ");
                    String newTitle = scanner.nextLine();

                    System.out.print("Enter New Body: ");
                    String newBody = scanner.nextLine();

                    diary.updateEntry(updateId, newTitle, newBody);

                    System.out.println("Entry updated successfully.");
                    break;

                case "4":
                    System.out.print("Enter Entry ID: ");
                    int deleteId = Integer.parseInt(scanner.nextLine());

                    diary.deleteEntry(deleteId);

                    System.out.println("Entry deleted successfully.");
                    break;

                case "5":
                    diary.lockDiary();
                    logout = true;
                    System.out.println("Diary locked. Logout successful.");
                    break;

                default:
                    System.out.println("Invalid option.");

            }

        }

    }
}
