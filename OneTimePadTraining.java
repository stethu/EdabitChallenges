public class OneTimePadTraining {
    private static boolean isStringANumber(String stringToCheck)
    {
        try
        {
            for (int i = 0; i < stringToCheck.length(); i++)
            {
                Integer.parseInt(Character.toString(stringToCheck.charAt(i)));
            }
            return true;
        }
        catch (NumberFormatException nfex)
        {
            return false;
        }
    }
    private static String fillPad(String pad, int targetLength)
    {
        while (pad.length() < targetLength)
        {
            pad += pad;
        }
        return pad;
    }
    public static String encrypt(String plncode, String pad) {
        String cypcode = "";
        if (!isStringANumber(plncode) || !isStringANumber(pad))
        {
            return null;
        }
        cypcode += pad.substring(0, 5);
        pad = pad.substring(5, pad.length());
        pad = fillPad(pad, plncode.length());
        for (int i = 0; i < plncode.length(); i++)
        {
            int temp = (Integer.parseInt(Character.toString(plncode.charAt(i))) - 
                        Integer.parseInt(Character.toString(pad.charAt(i)))) % 10;
            cypcode += (temp < 0) ? String.valueOf(temp + 10) : String.valueOf(temp);
        }
        return cypcode;
	}

	public static String decrypt(String cypcode, String pad) {
        String plncode = "";
		if (!cypcode.substring(0, 5).equals(pad.substring(0, 5)))
        {
            return "Error: Key IDs don't match.";
        }
        if (!isStringANumber(plncode) || !isStringANumber(pad))
        {
            return null;
        }
        cypcode = cypcode.substring(5, cypcode.length());
        pad = pad.substring(5, pad.length());
        pad = fillPad(pad, cypcode.length());
        for (int i = 0; i < cypcode.length(); i++)
        {
            plncode += String.valueOf((Integer.parseInt(Character.toString(cypcode.charAt(i))) +
                                      Integer.parseInt(Character.toString(pad.charAt(i)))) % 10);
        }
        return plncode;
	}
}
