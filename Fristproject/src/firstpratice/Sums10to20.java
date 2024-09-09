package firstpratice;

public class Sums10to20 {
 public static void main(String[]args) {
	 
	 // TO CHECK PALINDROME VALUE 141,242,35453 ETC
	 int zo=141, b=0, c=0, a=zo ;
	 
	 while(a>0) {
		 b=a%10;
		 c= (c*10)+b;
		 a=a/10;
		 
				 
	 }
	 if (zo== c) {
		 System.out.println("PALINDROME");	 }
	 else {
	 System.out.println("ITS A PALINDROME");
 }
	 
	 // PRINT PALINDROME NUMBERS WITH LOOPING :
	 
	 for(int n=1;n<=100;n++) {
		 int pali =n,j=0,i=0;
		 while (pali>0) {
			 i=pali%10;
			 j= (j*10)+i;
			 pali=pali/10;
			 
		 }
		 if (n==j) {
			 System.out.println(n);
		 }
	 }
	 
//TO COUNT THE POLIDROME NUMBERS WITH FOR & WHILE LOOP
	 
	int var=0;
	for(int no=1;no<=10000;no++) {
		int z=no, x=0,y=0;
		while(z>0) {
			x=z%10;
			y= (y*10)+x;
			z=z/10;
			
		}
		if (no == y) {
			var++;
		}

	}		System.out.println(var);
	
	// TO CHECK ARMSTRONG NUMBER WITH WHILE LOOP...
	int arm=153,remainder=0, calculate=0;
	while (arm>0) {
	calculate= arm%10;
	remainder= remainder+ (calculate*calculate*calculate);
	arm= arm /10;
	
	}if (arm == remainder) {
		System.out.println(" ARMSTRONG NUMBER");
	}
	else {
		System.out.println("its not an ARMSTRONG NUMBER");
	}
	
	
	// TO PRINT ARMSTRONG NUMBER...(2 VARIABLES)
	
	for(int s=1;s<=1000; s++) {
	int t=s,u=0,v=0;	
	
	while(t>0) {
		u=t%10;
		v= v+(u*u*u);
		t=t/10;
	}
	if(s==v){
		System.out.println(s);
	}
	}
	
	//COUNTING ARMSTRONG NUMBER.. (3 VARIBLES)
	
	int counter=0;
	for(int e=1;e<=1000;e++) {
		int f=e,g=0,h=0;
		while(f>0) {
			g=f%10;
			h=h+(g*g*g);
			f=f/10;
		}if(e == h) {
			counter++;
	}
	}
	System.out.println(counter);
	
	// NUMBER TRIANGLE...
	
	
	          
	for(int tri =1;tri <=5; tri++) {
	for (int py =1; py <= tri; py++) {
		System.out.print("&");
		
}
	System.out.println();
}
	
	//REVERSE TRIANGLE
	
	for(int number=1; number<=5; number++) {
		for(int reverse=5;reverse>=number; reverse-- ) {
			System.out.print("*");
		}System.out.println();
	}
	
	
	int n=17;
	int count = 0;
	for (int i = 2; i <= n / 2; i++) {
	 

	if (n % i == 0) {
		count=1; }
	if (count==0) {
	
	System.out.println("prime");
	} else {
	System.out.println("not prime");
	}
	
	
	
	

}}}