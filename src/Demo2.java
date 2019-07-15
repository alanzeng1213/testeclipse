import java.util.HashMap;
import java.util.Map;


public class Demo2 {

	public static void main(String[] args) {
		
		int nums[]= {2,7,11,15,1};
		int target =8;
		twoSum(nums,target);
	}
	  public static int[] twoSum(int[] nums, int target) {    //  [2, 7, 11, 15,1]   8   
	        int [] result = new int[2];
			Map<Integer,Integer> maps = new HashMap<>();
			int i =0;
			while (i<nums.length) {
				maps.put(nums[i],i);
				i++;
				if (maps.containsKey(target-nums[i])) {
	                result[0] = maps.get(target-nums[i]);
	                result[1] = i;
					break;
				}
				
			}
	        return result;
	    }
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  public int [] getNum (int nums[], int target){
		  
		  int result[] = new int[2];
		  
		  
		  Map<Integer,Integer> maps = new HashMap<>();
		  
		  int n =0 ;
		  
		  //while (n< nums.length)
		  return result;
	  }
	  
	  
	  
	  
	  
}
