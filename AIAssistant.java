import java.util.HashMap;
import java.util.Map;

public class AIAssistant {
    private static final Map<String, String> wellnessTips = new HashMap<>();

    static {
        wellnessTips.put("happy", "🎉 Great! Keep up the positivity. Try sharing your joy with a friend!");
        wellnessTips.put("sad", "💙 It's okay to feel sad. Try journaling or listening to calming music.");
        wellnessTips.put("anxious", "🧘‍♂️ Take deep breaths. Meditation or a short walk can help ease anxiety.");
        wellnessTips.put("stressed", "🌿 Try a 5-minute break. Stretching or drinking water can refresh your mind.");
        wellnessTips.put("neutral", "⚖️ Maintaining balance is great. Keep doing what makes you feel good!");
    }

    public static String getWellnessTip(String mood) {
        return wellnessTips.getOrDefault(mood, "🤖 I'm not sure about this mood. Try self-care and mindfulness.");
    }
}
