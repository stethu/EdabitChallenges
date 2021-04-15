//https://edabit.com/challenge/vpSCPsQKcQwnFdMS4
public class RecursionCountTheDigits {
    public static int digitsCount(long n) {
		if (n < 10 && n > -10)
        {
            return 1;
        }
        return 1 + digitsCount(n/10);
	}
}
