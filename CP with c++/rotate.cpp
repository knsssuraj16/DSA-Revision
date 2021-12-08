#include <iostream>
using namespace std;



void reverse(int *arr,int n){
    
   
    // cout<<arr[n-1]<<endl;
    int i =0; 
    int j=n-1;
    while(i<j){
        int a = arr[i];
        arr[i]= arr[j];
        arr[j]=a;
        i++;
        j--;
    }
}
void rotate(int *arr, int d, int n)
{
    //Write your code here
    // while (d){
    //     int first = input[0];
    //     for(int i =1; i< n; i++){
    //         input[i-1]=input[i];
    //     }
    //     input[n-1]= first;
    // }
    
    reverse(arr,d);
    reverse(arr+d,n-d);
    
    reverse(arr,n);
    
}
int main()
{
	int t;
	cin >> t;
	
	while (t--)
	{
		int size;
		cin >> size;

		int *input = new int[size];

		for (int i = 0; i < size; ++i)
		{
			cin >> input[i];
		}

		int d;
		cin >> d;

		rotate(input, d, size);

		for (int i = 0; i < size; ++i)
		{
			cout << input[i] << " ";
		}
		
		delete[] input;
		cout << endl;
	}

	return 0;
}