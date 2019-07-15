import java.time.LocalDate;
import java.util.Arrays;


public class Demo {

	public static void main(String[] args) {
		


		int [] nums ={3,4,3,5,6,6,7,8,7};
		
		int m =0;
		
		for (int i = 0; i < nums.length; i++) {
			
			for (int j =i+1; j< nums.length-m;j++){
				if (nums[j] == nums[i]){
					int temp = nums[j];
					nums[j] = nums[nums.length-m-1];
					nums[nums.length-m-1] = temp;
					m++;
				}
			}
		}
		
		int []newNums = Arrays.copyOf(nums, nums.length-m);
		for (int n: newNums){
			System.out.print(n+" ");
			
		}
	}
	
	
	public static void testArr(){
		
		int [] nums ={3,4,3,5,6,6,7,8,7};
		
		int n =0;
		int len = nums.length;
		
		for (int i=0;i<len-n;i++){
			
			for (int j =i+1; j<len-n ; j++){
				
				if (nums[j]== nums[i]){
					
					n++;
					int temp = nums[j];
					nums[j] = nums[len-n-1];
					nums[len-n-1] = temp;
				}
				
			}
			
		}
	}
}
