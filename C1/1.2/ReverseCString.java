/*
 * Write code to reverse a C-Style String.
 * (C-String means that “abcd” is
 * represented as five characters,
 * including the null character.)
*/
class ReverseCString
{
	static char[] reverseCString(char[] pString)
	{
		int strLen = pString.length;
		char[] reverseString = new char[strLen];
		for(int i =(strLen-2);i>=0;i--)
		{
			reverseString[(strLen-2)-i] = pString[i];
		}
		reverseString[strLen-1] = '\n';
		return reverseString;
	}

	public static void main(String args[])
	{
		char[] chararray = {'a','b','c','\n'}; 
		System.out.println(reverseCString(chararray));
	}
}
