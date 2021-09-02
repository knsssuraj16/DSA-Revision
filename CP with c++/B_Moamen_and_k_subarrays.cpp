#include <bits/stdc++.h>
using namespace std;
#define endl ("\n")

#define int long long
#define fast ios_base::sync_with_stdio(false), cin.tie(nullptr), cout.tie(nullptr);




    

int32_t main(){
    fast
    int t;
    cin >> t;
    while(t--){
        int n,k;
        cin>>n >>k;
        vector< int> arr;
        vector< int> sarr;
        for(int i= 0; i< n;i++){
            int a;
            cin >> a;
            arr.push_back(a);
        }


        map<int,int> index;
	    for(int i=0;i<n;i++)
         index[arr[i]]=i;
         
        sort(arr.begin(),arr.end());
	
	
	    for(int i=0;i<n-1;i++){
	     int i1 = index[arr[i]];
	     int i2 = index[arr[i+1]];
	     if(i1+1!=i2)k--;
	    }
	
        //    cout << k<<endl;

        

        if(k<=0){

         cout<<"No"<<endl;
        }else{

         cout<<"Yes"<<endl;
        }


    }


    
   
    return 0;
}