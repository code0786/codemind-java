import java.util.*;
class Love{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int one = sc.nextInt();
        int two = sc.nextInt();
        if(one%2==0 && (one>0||two%2==0))
            System.out.format("YES");
        else
            System.out.format("NO");
    }
}