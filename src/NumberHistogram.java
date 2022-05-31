import java.util.*;
public class NumberHistogram {

	public static void main (String args[]) {
		Scanner scan = new Scanner (System.in);
		Random random = new Random();
	
		int nums[] = {2,4,5,8,16,2,3,5,9,0,9,12,6};
		//1
		
		//2
		System.out.println(nums[0]);
		
		//3
		System.out.println(nums[1]);
		
		//4
		System.out.println(nums[3]);
		
		//5
		System.out.println(nums[nums.length-1]);
		
		//6
		System.out.println(nums.length);
		
		//7
		System.out.println(nums[nums.length-1]);
		//8
		
		//9
		for(int val : nums) {
			System.out.print(val);
			
		}
		//10
		if(nums[0]==6 ||nums[nums.length-1] == 6 ) {
			System.out.println("true");
			
		}
		
		//11
		boolean aboveTen = false;
		for(int i =0; i<nums.length; i++) {
			int n1 = nums[i];
			if(n1>10) {
				aboveTen = true;
				break;
			}}
			if(aboveTen == true) {
				System.out.println("Above ten!");
			}
		//12
			boolean six1 = false;
			for(int j =0; j<nums.length; j++) {
				int n2 = nums[j];
				if(n2==6) {
					six1 = true;
					break;
				}}	
			if(six1 == true) {
				System.out.println("I see six!");}
		//13
			boolean within1 = false;
			for(int j =0; j<nums.length; j++) {
				int n3 = nums[j];
				if(n3>2 && n3<8) {
					within1 = true;
					break;
				}}	
			if(within1 == true) {
				System.out.println("The number is within 2 and 8!");}
		//Number Histogram app
			int data [] =new int [25];
			
			for(int h = 0; h<data.length; h++) {
				int n5 = random.nextInt(10); 
				data[h]= n5;
			}
			
			for(int lol : data) {
				System.out.print(lol);}
			int count;
			
			int histogram[] = new int[10];
			for (int x = 0; x < histogram.length; x++) {
				count =0;
				for (int y = 0; y < data.length; y++) {
					int h1 =data[y];
					if(x == h1) {
					count++;
					
					}}
					System.out.println(x +" occured in the data set " +count +" times");
					}
				}
			}
	

