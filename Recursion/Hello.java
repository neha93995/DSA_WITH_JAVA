import java.util.Scanner;


// ab thik hai kr lijiye are yrr kuchh smjh me aaya nhi kyas kya kr di pichhla wala hi rhne do

// aare bhai 
public class Hello {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            int n=sc.nextInt();
            
    
     repeatedElemn(arr1,arr2);
    }


    static void repeatedElemn(int arr[],int arr2[]){
        int i =0,j=arr2.length-1;
        while(i<arr.length &&  j>=0){
            if(arr[i]==arr2[j]){
                System.out.println(arr[i]);
                i++;
                j--;
            }thik 
        // ek hi question tha bs abhi krr rha hmm sorry agar maine jayada time laga diya to nhi n thik hai
            else if((arr[i]>arr2[j])){
                j--;
            }
            else{
                i++;
            }
        }
    }
}
