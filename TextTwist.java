public class TextTwist {
    private static boolean containsAllChars(String wordToCheck, String charsAllowed)
    {
        while (wordToCheck.length() > 0)
        {
            if (!charsAllowed.contains(Character.toString(wordToCheck.charAt(0))))
            {
                return false;
            }
            charsAllowed = charsAllowed.replaceFirst(Character.toString(wordToCheck.charAt(0)), "");
            wordToCheck = wordToCheck.replaceFirst(Character.toString(wordToCheck.charAt(0)), "");
        }
        return true;
    }
    public static int totalPoints(String[] guesses, String word) {
        int totalPoints = 0;
		for (String guess : guesses)
        {
            if (!containsAllChars(guess, word))
            {
                continue;
            }
            switch (guess.length())
            {
            case 3:
                totalPoints += 1;
                break;
            case 4:
                totalPoints += 2;
                break;
            case 5:
                totalPoints += 3;
                break;
            case 6:
                totalPoints += 54;
                break;
            default:
                break;
            }
        }
        return totalPoints;
	}
}
