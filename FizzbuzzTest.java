public class FizzbuzzTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			/*for(int i = 1; i <= 100; i++){
				String test = "";
				test += (i % 3) == 0 ? "fizz" : "";
				test += (i % 5) == 0 ? "buzz" : "";
				System.out.println(!test.isEmpty() ? test : i);
			}*/

		for(int i = 1; i <= 100; i++) {                    // count from 1 to 100
		      if (((i % 3) == 0) && ((i % 5) == 0))            // A multiple of both?
		        System.out.print("fizzbuzz");    
		      else if ((i % 3) == 0) System.out.print("fizz"); // else a multiple of 5?
		      else if ((i % 5) == 0) System.out.print("buzz"); // else a multiple of 7?
		      else System.out.print(i);                        // else just print it
		      System.out.print(" "); 
		    }
		  }
}
