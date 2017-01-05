
public class problem_1 {

	public static void main(String[] args) {
		/*
		 *  finding the sum of all the numbers below
		 *  1000 and above 0, that are either a multiple of
		 *  3 or 5
		 */
		int sum = 0;
		
		for(int counter = 0;counter < 1000; counter++){
			if(counter % 3 == 0 || counter % 5 == 0){
				sum += counter;
			}
		}
		
		System.out.println(sum);
	}

}
