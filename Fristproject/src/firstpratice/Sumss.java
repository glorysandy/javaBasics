package firstpratice;

public class Sumss {
public static void main (String[]args) {
	
	//sum of odd number (1 to 100)
	int num =0;
	for(int odd=1; odd<=100; odd++) {
		if(odd%2!=0) {
			num= num+ odd;
			}
	}
	System.out.println(num);
	
	// SUM OF EVEN NUMBER (1 TO 100)

	
	int no=0;
	for (int even=2; even<=100; even++) {
		if(even%2==0) {
			no=no+even;
		}
	} System.out.println(no);
	
	//COUNT OF ODD NUMBER (1 TO 100)
	
	int count=0;
	for(int oddno=1;oddno<=100;oddno++) {
		if(oddno%2!=0) {
			count = count+ 1;
					
		}
	}
	System.out.println(count);
	
	//COUNT OF EVEN NUMBER (1 TO 100)
	
	int  counter = 0;
	for(int evenno=2; evenno<=100;evenno++) {
		if(evenno%2==0) {
			counter =counter+1;
		}
	} System.out.println(counter);
	
	// FACTORIAL NUMBER (1*2*3*4)
	
	int number=1;
	for(int fac=1;fac<=4;fac++) {
	
			number = number* fac;	
	} System.out.println(number);
	
	
	// FABONACCI SERIES (1+2=3;1+2+3=6;)
	
	int a=0 , b=1;
	System.out.println(a);
	System.out.println(b);
	
	for(int wrg=2; wrg<=10; wrg++) {
		int c= a+b;
		System.out.println(c);
		a=b;
		b=c;}
	
	
	// FINDING ODD OR EVEN NUMBER
	
	int numbers = 23;
	if (numbers%2==0) {
		System.out.println("its a even number");
	}else {
		System.out.println("its a odd number");
	}
	
	
	//SWAPPING NUMBER USING 3RD VARIBLAE
	
	int s=23, t=4;
	System.out.println("SWAPPING:");
	int m=s;
	s=t;
	t=m;
	System.out.println(s);
	System.out.println(t);
	
	
	//SWAPPING NUMBER WITHOUT 3RD VARIABLE
	
	int j=10, r=20;
	System.out.println("SWAPPING WITHOUT 3RD VARIABLE:");
	j=j+r;
	r=j-r;
	j=j-r;
	System.out.println(j);                                                                                                                               
	System.out.println(r);
	
	//REVERSING
	
	int value=123456, u=0,v=0;
	while(value>0) {
		u = value % 10;
		v =( v*10) + u;
		value= value/10;
	}
	System.out.println( "reverse:"+v);
	
	
}
}



