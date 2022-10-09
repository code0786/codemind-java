import java.util.*;
class Solution{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int test = scan.nextInt();
        while(test-->0){
            int a = scan.nextInt();
            int b = scan.nextInt();
            int count = 0;
            for(int i = a ; i <= b ; i++){
                if(i%10==2 || i%10==3 || i%10==9){
                    count++;
                }
            }
            System.out.format("%d
",count);
        }
    }
}