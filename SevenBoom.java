/**
 * SevenBoom
 */
import java.util.Arrays;

 //https://edabit.com/challenge/CKqfEowjmSTw2jsso
public class SevenBoom 
{
    public static String sevenBoom(int[] arr) 
    {
        String arrAsString = Arrays.toString(arr);
        if (arrAsString.contains("7"))
        {
            return "Boom!";
        }
        return "there is no 7 in the array";
    }
}