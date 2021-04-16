import java.util.ArrayList;
import java.util.List;

public class ProductOfDigitsOfSum {
    //https://edabit.com/challenge/PZh6svj6RjiQishTG
    public static long sumDigProd(long number, long ... numberList) {
        List<Long> tempBuffer = new ArrayList<>();
        boolean isOneDigitNumber = false;
		for (long num : numberList)
        {
            number += num;
        }
        do
        {
            tempBuffer.add(number % 10);
            number /= 10;
            if (number == 0)
            {
                number = 1;
                for (long num : tempBuffer)
                {
                    number *= num;
                }
                if (number/10 == 0)
                {
                    isOneDigitNumber = true;
                }
                tempBuffer.clear();
            }
        }while(!isOneDigitNumber);
        
        return number;
	}
}
