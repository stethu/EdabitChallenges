import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * TheCentrifugeProblem
 */
public class TheCentrifugeProblem {
    //Source: https://www.geeksforgeeks.org/check-if-is-possible-to-get-given-sum-from-a-given-set-of-elements/
    private static int[] CalcPossibleSums(int[] arr, int N) 
    {
        int[] possibleSums = new int[1000];
        possibleSums[0] = 1;
        Arrays.sort(arr);

        for (int i = 0; i < N; ++i) 
        {
            int val = arr[i];
            if (possibleSums[val] == 1)
            {
                continue;
            }
            for (int j = 0; j + val < 1000; ++j)
            {
                if (possibleSums[j] == 1)
                {
                    possibleSums[j + val] = 1;
                }
            }
        }
        return possibleSums;
    }
    private static List<Integer> GetPrimeDivisors(int number)
    {
        List<Integer> primeList = new ArrayList<>();
        List<Integer> primeDivisors = new ArrayList<>();
        boolean isPrime = true;
        for (int i = 2; i <= number; i++)
        {
            isPrime = true;
            for (int n : primeList)
            {
                if (i % n == 0)
                {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime)
            {
                primeList.add(i);
            }
        }
        for (int p : primeList)
        {
            if (number % p == 0)
            {
                primeDivisors.add(p);
            }
        }
        return primeDivisors;
    }
    public static boolean cFuge(int n, int k) {
		if (k > n ||
            n <= 1 ||
            k <= 1)
        {
            return false;
        }
        List<Integer> primeDivisors = GetPrimeDivisors(n);
        int[] possibleSums = CalcPossibleSums(primeDivisors.stream().mapToInt(i->i).toArray(), primeDivisors.size());
        if (n - k < 1000 &&
            k < 1000)
        {
            return possibleSums[n - k] == 1 && possibleSums[k] == 1;
        }
        return false;
    }
}