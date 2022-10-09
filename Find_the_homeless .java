import java.util.*;
class Love{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] people = new int[n];
		int[] house = new int[n];
		for(int i = 0 ; i < n ; i++){
		    people[i] = sc.nextInt();
		}
		for(int i = 0 ; i < n ; i++){
		    house[i] = sc.nextInt();
		}
		int count = 0;
	    for(int i = 0 ; i < n ; i++){
	        int c = 1;
		    for(int j = 0 ; j < n ; j++){
		        if(people[i]<=house[j]){
		            c=0;
		            house[j]=0;
		            break;
		        }
		    }
		    if(c!=0){
		        count++;
		    }
		}
		System.out.format("%d",count);
	}
}