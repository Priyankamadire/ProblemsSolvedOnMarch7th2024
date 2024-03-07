
/*Given an array, rotate the array to the right by k steps, where k is non-negative. For example, if 
our input array is [a, b, c, d, e] and k is 2, then the output should be [d, e, a, b, c].
We can solve this by having two loops again which will make the time complexity O(n^2) or by 
using an extra, temporary array, but that will make the space complexity O(n).

example
input=5
a b c d e
2
output=d e a b c */
import java.util.*;

public class RotateKthArr {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        char c[] = new char[n];
        for(int i=0;i<n;i++){
            c[i]=sc.next().charAt(0);
        }
        int k = sc.nextInt();
        // System.out.print(solve(n,c,k));
        solve(n,c,k);
        printchar(c,n);
    }
    public static void printchar(char arr[],int n){
        for(int i=0;i<n;i++){
            System.out.print(arr[i]);
        }
    }
    public static void solve(int n,char c[],int k){
        k=k%n;
        rev(c,0,n-1);
        rev(c,0,k-1);
        rev(c,k,n-1);

    }
    public static void rev(char arr[],int s,int e){
        while(s<e){
            char t = arr[s];
            arr[s]=arr[e];
            arr[e]=t;
            s++;
            e--;
        }
    }

}