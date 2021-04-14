import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        int[] hello = {72, 29, 7, 0, 3};
        int[] hithere = {72, 33, -73, 84, -12, -3, 13, -13, -68};
        int[] sunshine = {83, 34, -7, 5, -11, 1, 5, -9};
        List<int[]> arrList = new ArrayList<>();
        arrList.add(hello);
        arrList.add(hithere);
        arrList.add(sunshine);
        System.out.println(DifferenceCipher.decrypt(hello));
        System.out.println(DifferenceCipher.decrypt(hithere));
        System.out.println(DifferenceCipher.decrypt(sunshine));
        hello = DifferenceCipher.encrypt("Hello");
        hithere = DifferenceCipher.encrypt("Hi there!");
        sunshine = DifferenceCipher.encrypt("Sunshine");
        for (int[] arr : arrList)
        {
            for (int number : arr)
            {
                System.out.print(number + " ");
            }
            System.out.println("");
        }

    }
}
