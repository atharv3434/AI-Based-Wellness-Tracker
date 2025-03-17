import java.util.*;

public class MoodManager {
    private List<MoodEntry> moodHistory;
    private Scanner sc;

    public MoodManager() {
        this.moodHistory = MoodStorage.loadMoods();
        this.sc = new Scanner(System.in);
    }

    public void logMood() {
        System.out.print("How are you feeling today? (Happy, Sad, Anxious, Stressed, Neutral): ");
        String mood = sc.nextLine().toLowerCase();

        moodHistory.add(new MoodEntry(mood));
        MoodStorage.saveMoods(moodHistory);
        System.out.println("✅ Mood Logged Successfully!");
    }

    public void viewMoodHistory() {
        if (moodHistory.isEmpty()) {
            System.out.println("📄 No mood logs found.");
            return;
        }

        System.out.println("\n📜 Your Mood History:");
        for (int i = 0; i < moodHistory.size(); i++) {
            System.out.println((i + 1) + ". " + moodHistory.get(i));
        }
    }

    public void getAISuggestion() {
        if (moodHistory.isEmpty()) {
            System.out.println("📌 No mood data available for AI suggestions.");
            return;
        }

        String latestMood = moodHistory.get(moodHistory.size() - 1).getMood();
        System.out.println("🤖 AI Suggestion for Mood: " + latestMood);
        System.out.println(AIAssistant.getWellnessTip(latestMood));
    }

    public void deleteMoodLog() {
        viewMoodHistory();
        System.out.print("Enter mood log number to delete: ");
        int index = sc.nextInt() - 1;
        sc.nextLine();

        if (index >= 0 && index < moodHistory.size()) {
            moodHistory.remove(index);
            MoodStorage.saveMoods(moodHistory);
            System.out.println("✅ Mood Log Deleted Successfully!");
        } else {
            System.out.println("❌ Invalid entry number.");
        }
    }
}
