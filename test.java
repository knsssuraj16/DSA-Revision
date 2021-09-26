import java.util.*;
class test{
	
	public static int solve(int arr[],int n){

		if(n<=1){
			return 0;
		}
		if(arr[n-1] >= arr[n-2]){
			
			return solve(arr,n-1);
		}else{

			int gr = arr[n-2];
			int sm = arr[n-1];
			int s = gr-sm;


			int mn= Integer.MAX_VALUE;
			for(int i =s;i >=1; i--){
				arr[n-1] = arr[n-1]+s;
				int loc1 = s+ solve(arr,n-1);
				arr[n-1] = arr[n-1]-s;

				mn= Math.min(mn,loc1);
				arr[n-2] = arr[n-2]-s;
				int loc2 = s+ solve(arr,n-1);
				arr[n-2] = arr[n-2]+s;
				mn= Math.min(mn,loc2);



			}
			return mn;
		}
	}
    public static void main(String arg[]){
       
	
		int arr[] = {7,7,10,2,9};
		System.out.println(solve(arr,5));
    }
}