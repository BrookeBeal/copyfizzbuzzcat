
public class CopyFizzBuzzCat {

	public static void main(String[] args) {
	
	
				
				for (int i = 1; i<101; i++){
					
					if  ((i%3 != 0 && i%5!= 0) &&  (i%2 !=0 && i%10!=0)){
					
					
					System.out.println(i);
					}
					
					if ((i%2==0)&& (i%3==0))
						System.out.println("CopyFizz");
					
					if ((i%3==0) && (i%5 == 0))
						System.out.println("FizzBuzz");
				
					
					if ((i%2==0) && (i%3 == 0) && (i%5==0))
						System.out.println("CopyFizzBuzz");
					
					if ((i%2==0) && (i%3 == 0) && (i%5==0) && (i%10==0))
						System.out.println("CopyFizzBuzzCat");
				
					
				

					else if (i%2==0)
						 System.out.println("Copy");
					
					else if (i%3==0)
						System.out.println("Fizz");
					
					else if (i%5==0)
						System.out.println("Buzz");
					
					else if (i%10==0)
						 System.out.println("Cat");
					
					
				    
					
				
				
				    }

				}
		
	}


