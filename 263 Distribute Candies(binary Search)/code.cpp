Distribute Candies#include<bits/stdc++.h>
using namespace std;

bool check(long long arr[], long long mid , int n,int c){
    
    for(int i=0;i<n;i++){
        int re =(int) arr[i]/mid;
        c-=re;
        if(c<=0){
            return true;
        }
    }
    return false;
}
int main(){
    
    int t;
    cin>>t;
    while(t--){
        int n ;
        cin>>n;
        int c;
        cin>> c;
		long long arr[n];
        for(int i=0; i<n; i++){
           cin>>arr[i];
            
        }
        
        sort(arr,arr+n);
        long long ans=0;
        long long i=0;
        long long j= arr[n-1];
        while(i<=j){
            long long mid = i + (j-i)/2;
            if(check(arr,mid,n,c)){
                ans= mid;
                i= mid+1;
            }else{
                
                 // cout<<"mid"<<mid<<endl;
                j =mid-1;
            }
        }
        cout<<ans<<endl;
    }
    return 0;
}