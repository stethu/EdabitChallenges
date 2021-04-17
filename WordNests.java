//https://edabit.com/challenge/qRRYmmyTRBhJJNMwq
public class WordNests {
    public static boolean validWordNest(String word, String nest) {
		while(nest.length() > word.length())
        {
            //Check double occurrence or no occurence of word in nest
            if (nest.indexOf(word) != nest.lastIndexOf(word) || 
                nest.indexOf(word) == -1)
            {
                return false;
            }
            nest = nest.replace(word, "");
        }
        return nest.equals(word);
    }
}
