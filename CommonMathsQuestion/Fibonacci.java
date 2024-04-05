

public class Fibonacci{

    // Time Complexity O(N)
    // Space Complexity O(1)
    static int fibonacci(int n)
	{
		if(n==1 || n==2)
		{
			return 1;
		}

		int fibonacciNum =0;
		int n1=1; 
		int n2=1;

		for(int i=3; i<=n; i++)
		{
			fibonacciNum = n1+n2;
			n1=n2;
			n2=fibonacciNum;
		}
		return fibonacciNum;
	}


    // Recursive approach
    // Time Complexity O(2^N)
    // space complexity O(N)

    static int fibonacci2(int n)
	{
		if(n==1 || n==2)
		{
			return 1;
		}
		return fibonacci(n-1)+fibonacci(n-2);
	}


    public static void main(String[] args) {
        
		int n = 6;
		System.out.println(fibonacci(n));
		System.out.println(fibonacci2(n));
    }
}