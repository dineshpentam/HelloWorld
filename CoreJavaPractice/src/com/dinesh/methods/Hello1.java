package com.dinesh.methods;





public class Hello1 
{
	
	public static void main(String[] args) {
		
		boolean isPrime = isPrime(67);
		if(isPrime == true)
		{
			System.out.println("given Number is prime");
			
		}else
		{
			System.out.println("given number is not prime");
		}
		
		
	}
	
	public static boolean isPrime(int Number)
	{
	   boolean isPrime = true;	
	   
	   for(int i=2;i < Number/2;i++)
	   {
		   if(Number%i==0)
		   {
			   isPrime = false;
		   }
		  
	   } return isPrime;
	   
	   
	}
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	/*public static void main(String[] args) {
	 boolean isPrime =isPrime(7);
	 if(isPrime == true){
		 System.out.println("The input is a prime number");
	 }else{
		 System.out.println("The input is not a prime number");
	 }
	}
    public static boolean isPrime(int number){
    
		boolean isPrime = true;
		for(int i = 2; i < number/2; i++){
			if(number % i == 0){
				isPrime = false;
			}
		}
    	return isPrime;
    }

}*/


