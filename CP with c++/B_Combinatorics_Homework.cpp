#include <iostream>
#include <algorithm>
using namespace std;

int main() {
	int t;
	cin>>t;
	while(t--)
	{
	    long long arr[3],m;
	    cin>>arr[0]>>arr[1]>>arr[2]>>m;
	    sort(arr, arr+3);
	    long long sum=0;
	    for(int i=0;i<3;i++)
	        sum=sum+arr[i]-1;
	    if(m>sum)
	        cout<<"NO";
	    else{
	        long long x=arr[2]-arr[1]-arr[0];
	        if(x<=m+1)
	            cout<<"YES";
	        else
	            cout<<"NO";
	    }
	    cout<<endl;
	}
	return 0;
}