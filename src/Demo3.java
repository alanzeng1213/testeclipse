
public class Demo3 {

	public static void main(String[] args) {
		
//		int result =0;
//		int x =-123;
//		while(x!=0){
//			result*=10;
//			result += x%10;
//			x= x/10;
//		}
//		
//		System.out.println(result); 
		String [] strs = {"flower","flowe","iflioweght"};
		System.out.println(longestCommonPrefix2(strs)); 
	}
	
	public String longestCommonPrefix(String[] strs) {    // ["flower","flowe","flioweght"]  fl
		if (strs.length==0){
			return "";
		}
		String root = strs[0];
		StringBuilder prefix = new StringBuilder();
		for (int i = 0; i<root.length(); i+=1){
			char chinroot = root.charAt(i);
			for (String x : strs){
				if (i >= x.length() || x.charAt(i) != chinroot){
					return prefix.toString();
				}
			}
			prefix.append(chinroot);
		}
		return prefix.toString();
	}
	
	
	 public static String longestCommonPrefix2(String[] strs) {  //"flower","iflow","flight"
	        
	        if(strs == null || strs.length == 0)    return "";
		    String pre = strs[0];
		    int i = 1;
		    while(i < strs.length){
		        while(strs[i].startsWith(pre) == false) {
		        	 pre = pre.substring(0,pre.length()-1);
		        }
		        i++;
		    }
		    return pre;
	    }
}
