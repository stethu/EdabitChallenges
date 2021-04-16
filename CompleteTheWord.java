public class CompleteTheWord {
    //https://edabit.com/challenge/t9S9nNr79pLqjXgqb
    public static boolean canComplete(String initial, String word) {
        int recentIndex = -1;
		for (char c : initial.toCharArray())
        {
            recentIndex = word.indexOf(c);
            if (recentIndex == -1)
            {
                return false;
            }
            word = word.substring(recentIndex + 1, word.length());
        }
        return true;
	}
}
