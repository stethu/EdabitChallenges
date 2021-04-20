import java.util.ArrayList;
import java.util.List;

public class VowelFamilies {
    private static String vowels = "aeiouy";
    public static String[] sameVowelGroup(String[] words) {
        if (words.length < 2)
        {
            return words;
        }
        List<String> retList = new ArrayList<>();
        String forbiddenVowels = "";
        for (char c : vowels.toCharArray())
        {
            if (!words[0].contains(Character.toString(c)))
            {
                forbiddenVowels += Character.toString(c);
            }
        }
        for (String word : words)
        {
            if (!word.matches(".*[" + forbiddenVowels + "].*"))
            {
                retList.add(word);
            }
        }
        return retList.toArray(new String[0]);
	}
}
