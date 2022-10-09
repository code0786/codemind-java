import java.util.*;
class Love{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int rev = 0;
		while(n>0){
		    rev = rev*10 + (n%10);
		    n/=10;
		}
		while(rev>0){
		    if((rev%10)%2!=0){
		        System.out.format("%d",(rev%10)*(rev%10));
		    }
		    rev/=10;
		}
	}
}
