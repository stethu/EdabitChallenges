public class FindTheDifference {
    //https://edabit.com/challenge/JYaLkHy8cHgCPXAvy
    public static char findTheDifference(String s, String t) {
		for (char c : s.toCharArray())
        {
            String temp = Character.toString(c);
            t = t.replaceFirst(temp, "");
        }
        if (t.length() != 1)
        {
            return 0;
        }
        return t.charAt(0);
	}
}
