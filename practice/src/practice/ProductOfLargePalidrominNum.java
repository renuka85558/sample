package practice;

public class ProductOfLargePalidrominNum {

	public static void main(String[] args) {
		int n = 3;
        System.out.print(larrgestPalindrome(n));
		
	}
	 static int larrgestPalindrome(int n)
	    {
	        int upper_limit = 999;
	     
	         int lower_limit = 100;
	     
	        // Initialize result
	        int max_product = 0;
	         
	        for (int i = upper_limit; i >= lower_limit; i--)
	        {
	            for (int j = i; j >= lower_limit; j--)
	            {
	                
	                int product = i * j;
	                if (product < max_product)
	                    break;
	                int number = product;
	                int reverse = 0,reminder;
	     
	                
	                while (number != 0)
	                {
	                	reminder= number % 10;
	                    reverse = reverse * 10 +reminder;
	                    number /= 10;
	                }
	     
	                // update new product if exist and if
	                // greater than previous one
	                if (product == reverse && product > max_product)
	                    max_product = product;
	            }
	        }
	        return max_product;
	    }
}
