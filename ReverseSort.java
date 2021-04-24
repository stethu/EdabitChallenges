import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ReverseSort {
    public static String reverseSort(String str) {
        List<String> wordList = new ArrayList<>();
        String retString = "";
        boolean wordAdded = false;
		String[] words = str.split(" ");
        Arrays.sort(words, String.CASE_INSENSITIVE_ORDER.reversed());
        for (String word : words)
        {
            wordAdded = false;
            if (wordList.size() == 0)
            {
                wordList.add(word);
                continue;
            }
            for (String s : wordList)
            {
                if (word.length() > s.length())
                {
                    wordList.add(wordList.indexOf(s), word);
                    wordAdded = true;
                    break;
                }
            }
            if (!wordAdded)
            {
                wordList.add(word);
            }
        }
        for (String word : wordList)
        {
            retString += word + " ";
        }
        return retString.substring(0, retString.length() - 1);
    }
}
