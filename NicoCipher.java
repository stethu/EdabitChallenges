import java.util.Arrays;

public class NicoCipher {
    private static int find(int[] array, int value) 
    {
        for(int i = 0; i< array.length; i++) 
        {
             if(array[i] == value)
             {
                 return i;
             }
        }
        return -1;
    }
    public static String nicoCipher(String message, String key) {
		char[] temp = key.toCharArray();
        int[] order = new int[key.length()];
        String encryptedMessage = "";
        Arrays.sort(temp);
        String tempString = new String(temp);
        for (int i = 0; i < key.length(); i++)
        {
            order[i] = tempString.indexOf(key.charAt(i));
            tempString = tempString.replaceFirst(Character.toString(key.charAt(i)), " ");
        }
        int rows = (message.length() % key.length() == 0) ? message.length()/key.length() : message.length()/key.length() + 1;
        int columns = key.length();
        char[][] grid = new char[rows][columns];
        for (int i = 0; i < rows; i++)
        {
            for (int j = 0; j < columns; j++)
            {
                if (message.length() > 0)
                {
                    grid[i][j] = message.charAt(0);
                    message = message.replaceFirst(Character.toString(message.charAt(0)), "");
                }
                else
                {
                    grid[i][j] = ' ';
                }
            }
        }
        for (int i = 0; i < rows; i++)
        {
            for (int j = 0; j < columns; j++)
            {
                encryptedMessage += grid[i][find(order, j)];
            }
        }
        return encryptedMessage;
    }
}
