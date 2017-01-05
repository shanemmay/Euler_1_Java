import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class problem_2 {

	public static void main(String[] args) {
		/*
		 * INSTRUCTIONS:
		 * Find the sum of the even numbers in the 
		 * Fibonacci Numbers that do not exceed 
		 * 4 million
		 */
		int sum = 0;
		
		/*
		 * Getting fibonacci numbers that do not exceed
		 * 4 million
		 */
		Map fibo_nums = new HashMap();
	    fibo_nums.put(1,1);
	    fibo_nums.put(2,2);
	    for(int i = 3; i <= 4000000; i++)
	    {
	    	int test_num = (int) fibo_nums.get(i - 1);
	    	test_num += (int) fibo_nums.get(i - 2);
	    	if ( test_num <= 4000000){
	    	fibo_nums.put(i, test_num); // this line
	    	test_num = (int) fibo_nums.get(i); // and this line can be one
	    	}else{
	    		break;
	    	}
	    }
	    
	    /*
	     * Adding all of the even numbers
	     */
	    for (Object value : fibo_nums.values()) 
	    {
	        if ((int) value % 2 == 0){
	        	sum += (int) value;
	        }
	    }
	    
	    /*
	     * Displaying Answer
	     */
	    System.out.println(sum);
	    System.out.println(fibo_nums);
	}

}
