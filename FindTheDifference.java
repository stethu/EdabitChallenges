public class FindTheDifference {
    //https://edabit.com/challenge/JYaLkHy8cHgCPXAvy
    public static char findTheDifference(String s, String t) {
		for (char c : s.toCharArray())
        {
            t = t.replaceFirst(Character.toString(c), "");
        }
        if (t.length() != 1)
        {
            return 0;
        }
        return t.charAt(0);
	}
}
