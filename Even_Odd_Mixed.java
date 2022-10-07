import java.util.*;
class Love{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int e = 0 , o = 0 ;
		while(n>0){
		    if((n%10)%2==0){
		        e++;
		    }
		    else{
		        o++;
		    }
		    n /= 10;
		}
		if(e==0){
		    System.out.format("Odd");
		}
		else if(o==0){
		    System.out.format("Even");
		}
		else{
		    System.out.format("Mixed");
		}
	}
}