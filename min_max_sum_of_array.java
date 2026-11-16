//find min, max and sum of elements in a number array
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arraySize = sc.nextInt();
		int[] nums= new int[arraySize];
		for(int i=0;i<arraySize;i++){
		    nums[i]=sc.nextInt();
		}
		int min=nums[0], max=nums[0], sum=0;
		for(int x:nums){
		    if(x<min) min=x;
		    if(x>max) min=x;
		    sum+=x;
		}
		System.out.printf("%d %d %d",min,max,sum);
	}
}
