public class EdabitsEncryptionScheme {
    public static String encryption(String s) {
		s = s.replace(" ", "");
        int length = s.length();
        int numberOfRows = (int)Math.sqrt(length);
        int numberOfColumns = numberOfRows;
        int numberOfCells = numberOfColumns * numberOfRows;
        while (numberOfCells < length)
        {
            if (numberOfColumns == numberOfRows)
            {
                numberOfColumns++;
            }
            else
            {
                numberOfRows++;
            }
            numberOfCells = numberOfColumns * numberOfRows;
        }
        String [][] grid = new String[numberOfRows][numberOfColumns];
        for (int i = 0; i < numberOfRows; i++)
        {
            for (int j = 0; j < numberOfColumns; j++)
            {
                if (s.length() > 0)
                {
                    grid[i][j] = Character.toString(s.charAt(0));
                    s = s.replaceFirst(Character.toString(s.charAt(0)), "");
                }
                else
                {
                    break;
                }
            }
        }
        for (int i = 0; i < numberOfColumns; i++)
        {
            for (int j = 0; j < numberOfRows; j++)
            {
                if (grid[j][i] != null)
                {
                    s += grid[j][i];
                }
            }
            s += " ";
        }
        //Delete last space
        s = s.substring(0, s.length() - 1);
        return s;
    }
}
