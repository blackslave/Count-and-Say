/**
 * 	1     讀做 1個1， 所以下一個變成 11  
	11    讀做 2個1， 也就是21  
	21    讀做 1個2 1個1，得到1211
	1211  1個1，1個2，2個1  111221  
 * @author black
 *
 */
public class countAndSay {
	public static void main(String [] args){
		Solution Solution = new Solution();
		System.out.println(Solution.countAndSay(4));
	}
}
