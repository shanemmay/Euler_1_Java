import java.util.ArrayList;
import java.util.List;

public class problem_3 {

	public static void main(String[] args) {
		/*
		 * What is the largest prime factor of
		 * 600851475143
		 */
		long given_num = 600851475143L;
		List factors = new ArrayList();
		/*
		 * Getting the Factors of given_num
		 */
		factors.addAll(get_factors(given_num));
		System.out.println("Answer: " + factors.get(factors.size() - 1));
		
	}
	
	public static List get_factors(long num){
		List factors = new ArrayList();
		boolean is_prime = true;
		
		for (long i = 1L; i < num; i++)
		{
			is_prime = true; //resetting is_prime
			if (i > 0 &&  num % i == 0)
			{
				//Testing if i is prime
				for (long j = 2L; j < i; j++)
				{
					if(i % j == 0)
					{
						is_prime = false;
						break;
					}
				}
				if (is_prime)
				{
					System.out.println("Adding :" + i);
					factors.add(i);
				}
			}
			long temp_num = 600800000000L; 
			if( i > temp_num || i < 0){
			System.out.println("i: " + i);
			}
			
		}
		
		return factors;
	}

}
