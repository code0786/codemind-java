import java.util.*;
class Love{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		int n = 0 , c = 0;
		for(int i = 0 ; i < s.length() ; i++){
		    if(s.charAt(i)=='R'){
		        n++;
		    }
		    else{
		        n--;
		    }
		    if(n==0){
		        c++;
		    }
		}
		System.out.format("%d",c);
	}
}
