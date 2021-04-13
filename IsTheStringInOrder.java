import java.util.Arrays;

//https://edabit.com/challenge/KWbrmP9uYSnYtwkAB
public class IsTheStringInOrder {
    public static boolean isInOrder(String str){
        char [] strAsChar = str.toCharArray();
        Arrays.sort(strAsChar);
        String temp = new String(strAsChar);
        if (str.equals(temp))
        {
            return true;
        }
        return false;
    }
}
