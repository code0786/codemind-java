import java.util.*;
class Solution{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String s[] = sc.nextLine().split(" ");
        String res = "";
        for(int i=s.length-1;i>=0;i--){
            res+=s[i]+" ";
        }
        System.out.println(res.substring(0,res.length()-1));
    }
}