package Day3;

public class TernaryOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//var=exp ? result 1: result 2;
		
		
		// example1
		
		/*
		int a = 200,b =100;
		
		int x =  (a<b) ? a: b;
		
		System.out.println(x);
		
		*/
		
		//example2
		/*
		int x = (1 ==1 ) ? 100 : 200;
		
		System.out.println(x);
		*/
		
		
		
		//example3
		
		int x = (1==2) ? 200 :100;
		
		System.out.println(x);
		
		
		
		//example4
		
		int person_age = 16;
		
		String res = (person_age >=18)? "Eligible" : "Not Eligible" ;
		
		System.out.println(res);
	}

}
