/**
 * ArraysOfMultiples
 */
//https://edabit.com/challenge/rzpucPyoyEtXPo2BG
public class ArraysOfMultiples {
    public static int[] GetMultiple(int num, int length)
    {
        int retVal[] = new int[length];
        for (int i = 0; i < length; i++)
        {
            retVal[i] = (i+1)*num;
        }
        return retVal;
    }
}