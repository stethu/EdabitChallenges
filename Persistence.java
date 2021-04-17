import java.util.List;
import java.util.ArrayList;
//https://edabit.com/challenge/fKZ6m9rDHDvgp6aeu
public class Persistence {
    public static int additivePersistence(int n) {
        return calcPersistence('+', n);
    }
  
    public static int multiplicativePersistence(int n) {
        return calcPersistence('*', n);
    }
    private static int calcPersistence(char persistenceType, int n)
    {
        if (persistenceType != '+' && persistenceType != '*')
        {
            return -1;
        }
        if (n/10 == 0)
        {
            return 0;
        }
		int persistence = 1;
        List<Integer> digitBuffer = new ArrayList<>();
        while (true)
        {
            while (n != 0)
            {
                digitBuffer.add(n%10);
                n /= 10;
            }
            if (persistenceType == '*')
            {
                n = 1;
            }
            for (int digit : digitBuffer)
            {
                if (persistenceType == '*')
                {
                    n *= digit;
                }
                else
                {
                    n += digit;
                }
            }
            if (n/10 == 0)
            {
                break;
            }
            digitBuffer.clear();
            persistence++;
        }
        return persistence;
    }
}
