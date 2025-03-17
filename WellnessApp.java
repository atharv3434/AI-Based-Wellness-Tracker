import java.util.Scanner;

public class WellnessApp {
    private static MoodManager moodManager = new MoodManager();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("🧠 Welcome to AI-Based Mental Wellness Tracker 🧠");

        while (true) {
            System.out.println("\n1. Log Mood");
            System.out.println("2. View Mood History");
            System.out.println("3. Get AI Wellness Suggestion");
            System.out.println("4. Delete Mood Log");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");
            int choice = sc.nextInt();
            sc.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    moodManager.logMood();
                    break;
                case 2:
                    moodManager.viewMoodHistory();
                    break;
                case 3:
                    moodManager.getAISuggestion();
                    break;
                case 4:
                    moodManager.deleteMoodLog();
                    break;
                case 5:
                    System.out.println("Exiting... Stay happy & healthy! 🌿");
                    sc.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice, try again!");
            }
        }
    }
}
