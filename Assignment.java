import java.util.Scanner;

public class Assignment {
	
	Scanner sc=new Scanner(System.in);
	
	public void checkPalindrome()  {
		 System.out.println("Enter the number: ");  
	       int num=sc.nextInt();
	       int r,sum=0;
	       int temp=num;    
	       while(num>0)
	       {    
	       r=num%10;    
	       sum=(sum*10)+r;    
	       num=num/10;    
	       }    
	        if(temp==sum)    
	        System.out.println("The entered number "+temp+" is a palindrome number ");    
	        else    
	        System.out.println("The entered number "+temp+" is not a palindrome");    
	}
	public void printPattern() {
		System.out.println("Enter the number: ");  
	       int n =sc.nextInt();
	       for(int i=n; i>=1; i--) {
	           for(int j=1; j<=i; j++) {
	                   System.out.print("*");
	           }
	           System.out.println();
	}

	}
	  public void checkPrimeNumber() {
		  System.out.println("Enter the number: ");
		int num = sc.nextInt();
		int temp=0;
		for(int i=2;i<=num-1;i++) {
			if(num%i==0) {
			temp=temp+1;
		}
		if(temp==0) 
			System.out.println(num+"is prime no");
		else
			System.out.println(num+"is not prime no");
		
}		
}

       public void printFibonacciSeries() {
    	   int a=0, b=1;
   		Scanner sc = new Scanner(System.in);
   		System.out.println("Enter the number till you want to perform the operations");
   		int num =sc.nextInt();
   		for(int i=1; i<=num; i++) {
   			int c=a+b;
   			System.out.println(c);
   			a=b;
   			b=c;
}
       }



public static void main(String[] args) {

    Assignment obj = new Assignment();
    int choice;
    Scanner sc = new Scanner(System.in); 	
    do {

    System.out.println("Enter your choice from below list.\n" + "1. Find palindrome of number.\n"

+ "2. Print Pattern for a given no.\n" + "3. Check whether the no is a  prime number.\n"

+ "4. Print Fibonacci series.\n" + "--> Enter 0 to Exit.\n");

System.out.println();

    
    choice = sc.nextInt();

    switch (choice) {

    case 0:
    choice = 0;
    break;

    case 1: {
    obj.checkPalindrome();
    }
    break;

    case 2: {
    obj.printPattern();
    }
    break;

     case 3: {
    obj.checkPrimeNumber();
    }
    break;

    case 4: {
    obj.printFibonacciSeries();
    }
    break;

    default:
    System.out.println("Invalid choice. Enter a valid no.\n");
    }
    }

     while (choice != 0);
     System.out.println("Exited Successfully!!!");
     sc.close();

 
    }
}


       