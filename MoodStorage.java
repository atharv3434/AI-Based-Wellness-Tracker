import java.io.*;
import java.util.*;

public class MoodStorage {
    private static final String FILE_PATH = "mood_history.txt";

    public static void saveMoods(List<MoodEntry> moodHistory) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(FILE_PATH))) {
            oos.writeObject(moodHistory);
        } catch (IOException e) {
            System.out.println("❌ Error saving mood history.");
        }
    }

    public static List<MoodEntry> loadMoods() {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(FILE_PATH))) {
            return (List<MoodEntry>) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            return new ArrayList<>();
        }
    }
}
