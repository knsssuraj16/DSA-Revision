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
        int arr[n];
        for(int i= 0; i< n;i++){
            cin >> arr[i];
        }

        bool flag= true;

        int last = INT_MIN; // -89459834598
        for(int i= 0; i< n;i++){
           if(last >arr[i] ){
               k--;
           }
           last = arr[i];

        }
        if(k<=0){

         cout<<"No"<<endl;
        }else{

         cout<<"Yes"<<endl;
        }


    }


    
   
    return 0;
}