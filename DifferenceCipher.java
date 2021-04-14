import java.util.ArrayList;
import java.util.List;

//https://edabit.com/challenge/KZrmicjc8zCZyGNee
public class DifferenceCipher 
{
    public static int[] encrypt(String str) 
    {
		List<Integer> retArr = new ArrayList<>();
        char recentChar = str.charAt(0);
        retArr.add((int)recentChar);
        for (int i = 1; i < str.length(); i++)
        {
            char tempChar = str.charAt(i);
            retArr.add((int)tempChar - recentChar);
            recentChar = tempChar;
        }
        return retArr.stream().mapToInt(number -> number).toArray();
	}

	public static String decrypt(int[] arr) 
    {
		StringBuilder retString = new StringBuilder();
        int recentInt = arr[0];
        retString.append((char)recentInt);
        for (int i = 1; i < arr.length; i++)
        {
            recentInt += arr[i];
            retString.append((char)(recentInt));
        }
        return retString.toString();
	}
}
