// Question 1:
// Write a program that takes as input an array of positive and negative numbers (0 excluded). The objective is to 
// return those items from the array whose sum is 0. If no such items exist return “No Elements found”
// Example: For an input array [-4, 1, 3, -2, -1], 
// one of the possible results would be 3, -2, -1 since their sum is 0.
// Note: If there are more than 1 combination of such items, you can return any 1 of them.


import java.util.Scanner;

public class newOne{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int arr[] = new int[N];
        for(int i=0;i<N;i++){
            arr[i] = sc.nextInt();
        }
        int x = 0;
        for(int i=0;i<N;i++) {
            int sum=0;
            for(int j=i;j<N;j++)
            {
                sum=sum+arr[j];
                if(sum==0)
                {
                    x=1;
                    break;
                }
            }
        }
        if(x==1)
            System.out.println("Elements Found");
        else
            System.out.println("No Elements Found");
    }
    }
