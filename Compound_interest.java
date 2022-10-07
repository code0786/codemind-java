import java.util.*;
class Love{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int p = sc.nextInt();
		int r = sc.nextInt();
		int t = sc.nextInt();
		double Com = 1+r/100.0;
		System.out.format("%.2f",Math.pow(Com,t)*p);
	}
}