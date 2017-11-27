class AllUniqueModule
{
	static boolean isUniqueInString(int pIndex, String pString)
	{
		char c = pString.charAt(pIndex);
		int appearCount = 0;

		for(int i = 0; i < pString.length(); i++)
		{
			if(Character.compare(c, pString.charAt(i)) == 0)
				appearCount++;
		}

		if(appearCount>1)
			return false;
		return true;
	}

	static boolean areThereDuplicates(String pString)
	{
		boolean answer = false;
		int strIt = 0;
		while(!answer && strIt < pString.length())
		{
			System.out.print("Is "+pString.charAt(strIt)+" unique? ");
			answer = !isUniqueInString(strIt++, pString);
			System.out.print(!answer+"\n");
		}

		return answer;
	}

	public static void main(String args[])
	{
		System.out.println(areThereDuplicates(args[0]));
	}
}
