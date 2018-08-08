/**
 * 所有結果皆由上一序列的結果而成，可用遞迴方式找出最初的結果1，並依次推出11、21、1121
 * 因為判斷時需要先判斷出後一位的值才能決定數量，如21讀做 1個2 1個1，得到1211，需先得到21的後一位1才能知道數量並得出12
 * 所以需在尾數增加判斷字元，以避免再讀取最後一位時造成溢位。最後再將組合出的結果輸出即可。
 * @author black
 *
 */
public class Solution {
	public String countAndSay(int n) {
		if(n==1)	return "1";	
		int count = 1;
		StringBuilder result = new StringBuilder();
		String s = countAndSay(n-1)+"*"; //增加尾數判斷
		char [] tmp = s.toCharArray();
		for(int i=0;i<tmp.length-1;i++)
		{
			if(tmp[i]==tmp[i+1])
			{
				count++;
			}
			else
			{
				result.append(count).append(tmp[i]);
				count=1;
			}
		}
		s = "";
		s = result.toString();
        return s;
    }
/*
  	public String countAndSay(int n) {
		if(n==1)	return "1";	
		int count = 1;
		String result = "";
		String s = countAndSay(n-1)+"*";
		char [] tmp = s.toCharArray();
		for(int i=0;i<tmp.length-1;i++)
		{
			if(tmp[i]==tmp[i+1])
			{
				count++;
			}
			else
			{
				result = result + count + tmp[i];
				count=1;
			}
		}
        return result;
    }	
*/	
}

