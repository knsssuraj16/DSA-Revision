#include<bits/stdc++.h>
using namespace std;


long long cost_calculator(long long v[], long long k, long long l, long long n, long long number)
{
	long long increment = 0;
	long long decrement = 0;
	for(long long i=0; i<n; i++)
	{
		if(v[i]>number)
		{
			decrement += v[i] - number;
		}
		else if(v[i]<number)
		{
			increment += number - v[i];
		}
	}
	if(decrement>increment)
	{
		return INT_MAX;
	}
	return (decrement * k) + ((increment - decrement)*l);
}
long long myCode(long long n,long long k,long long  l,long long  arr[]){
    //  int n;
    // long long k,l;
    // cin>>n;
    // cin>>k>>l;
    
    // int arr[n];
    long long mn=INT_MAX;
    long long mx= INT_MIN;
    for(int i=0;i<n;i++){
        // cin>>arr[i];
        mn= min(arr[i],mn);
        mx= max(arr[i],mx);
        
    }
    
  
    long long tot =INT_MAX;
    
   // cout<<"max"<<mx;
    
    for(long long j= mn ; j<=mx; j++){
        long long  dec=0;
        long long inc=0;
        long long locTot;
        for(long long i=0;i<n;i++){
      
               if(arr[i] > j){
                    dec += (arr[i]- j);

               } else if(arr[i]<j){
                    inc += ( j -arr[i]);

               }
  		  }
        
        if(dec > inc ){
             continue;
        }
        
        
        locTot =  (dec * k) +((inc - dec) * l);
       
        tot = min(tot,locTot);
        
   // cout<<"tot"<<tot;
   // cout<<"loc"<<locTot;
        
    }
    return tot;
        // cout<<tot<<endl;
   
}


long long  hisCode(long long n,long long k,long long  l,long long v[]){
    // long long n, k, l;
	// cin >> n >> k >> l;
	// vector<long long>v;
	// for(long long i=0; i<n; i++)
	// {
	// 	long long element;
	// 	cin >> element;
	// 	v.push_back(element);
	// }
	long long minimum=9999999, maximum=-1;
	for(long long i=0; i<n; i++)
	{
		if(v[i]<minimum)
		{
			minimum = v[i];
		}
		if(v[i]>maximum)
		{
			maximum = v[i];
		}
	}
	long long cost = INT_MAX;
	for(long long i=minimum; i<=maximum; i++)
	{
		cost = min(cost, cost_calculator(v, k, l, n, i));
	}
	return cost;
}
int main(){
   

// 1 <= n <= 1000
// 1 <= k, I <= 10^9
// 1 <= a[i] <= 1000
// Time Limit: 1 second

int cnt =1;
while(cnt<= 1000){

    long long n = rand() % 1000+1 ;
    long long k = rand() % 10000000000+1 ;
    long long l = rand() % 10000000000+1 ;
    
        
        long long arr[n];
        for(long long i =0; i< n;i++){
            arr[i]=rand() % 1000 +1;
        }
        long long myans= myCode(n, k, l, arr);
        long long hisAns= hisCode(n, k, l, arr);
            if(myans != hisAns){
                cout<<n<<" "<<k<<" "<<l<<"\n";
                for(long long i =0; i< n;i++){
                cout<< arr[i]<<" ";
                }
        }
    //    cout<< "success"<<endl;
    //  cout<< hisCode(n, k, l, arr)<<endl;
     cnt++;

}

    // write your code here
    return 0;
}