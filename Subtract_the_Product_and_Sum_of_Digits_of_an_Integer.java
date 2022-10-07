import java.util.*;
class Love{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int sum = 0 , pro = 1;
		while(n>0){
		    sum+=n%10;
		    pro*=n%10;
		    n/=10;
		}
		System.out.format("%d",pro-sum);
	}
}