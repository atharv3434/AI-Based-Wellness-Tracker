import java.time.LocalDate;

public class MoodEntry {
    private String mood;
    private LocalDate date;

    public MoodEntry(String mood) {
        this.mood = mood;
        this.date = LocalDate.now();
    }

    public String getMood() { return mood; }
    public LocalDate getDate() { return date; }

    @Override
    public String toString() {
        return "📅 Date: " + date + " | 😊 Mood: " + mood;
    }
}
