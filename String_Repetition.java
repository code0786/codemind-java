import java.util.*;
class Love{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		long n = sc.nextLong();
		long len = s.length();
		long a = 0;
		for(int i = 0 ; i < len ;i++){
		    if(s.charAt(i)=='a'){
		        a++;
		    }
		}
		long l = n/len;
		a*=l;
		for(int i = 0 ; i < n%len ; i++){
	        if(s.charAt(i)=='a'){
	            a++;
	        }
	    }
		System.out.format("%d",a);
	}
}