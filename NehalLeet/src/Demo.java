
public class Demo {
	public int countHi(String str) {
		  if(str.length()<2)
		  return 0;
		  if(str.substring(0,2).equals("hi"))
		  return 1+countHi(str.substring(2));
		  return countHi(str.substring(1));
		}
	public int findMaxForm(String[] strs, int m, int n) {
	    int[][] dp = new int[m+1][n+1];
	    for (String s : strs) {
	        int[] count = count(s);
	        for (int i=m;i>=count[0];i--) 
	            for (int j=n;j>=count[1];j--) 
	                dp[i][j] = Math.max(1 + dp[i-count[0]][j-count[1]], dp[i][j]);
	    }
	    return dp[m][n];
	}
	    
	public int[] count(String str) {
	    int[] res = new int[2];
	    for (int i=0;i<str.length();i++)
	        res[str.charAt(i) - '0']++;
	    return res;
	 }
	public static void main()
	{
		Demo d=new Demo();
		//d.countHi("xxhixx");
		String a[]={"10", "0001", "111001", "1", "0"};
		System.out.println(d.findMaxForm(a, 5, 4));
	}
}