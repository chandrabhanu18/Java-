// Binary search and linear search
import java.util.*;
class Day2 {
    public int linearSearch(int n,int arr[]){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==n){
                return i;
            }
        }
        return -1;
    }
    public int BinarySearch(int low,int high,int arr[],int n){
        
        while(low<=high){
            int mid=low+(high-low)/2;
            if(arr[mid]==n){
                return mid;
            }
            else if(arr[mid]<n){
                // low=mid+1;
                return BinarySearch(mid+1,high,arr,n);
            }
            else{
                // high=mid-1;
                return BinarySearch(low,mid-1,arr,n);
            }
        }
        return -1;
    }
    
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7};
        int a[]={-1,1,2,6};
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        Day2 m=new Day2();
        int res_linear=m.linearSearch(n,arr);
        if(res_linear!=-1){
            System.out.println("Element found at "+res_linear+" index");
        }
        else{
            System.out.println("Element not found!!");
        }
        int res_binary=m.BinarySearch(0,a.length-1,a,n);
        if(res_binary!=-1){
            System.out.println("Element found at "+res_binary+" index");
        }
        else{
            System.out.println("Element not found!!");
        }
    }
}