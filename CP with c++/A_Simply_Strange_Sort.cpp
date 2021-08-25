#include <bits/stdc++.h>
using namespace std;
#define endl ("\n")

#define fast ios_base::sync_with_stdio(false), cin.tie(nullptr), cout.tie(nullptr);




    

int32_t main(){
    fast
    int t;
    cin >> t;

    while(t--){
        int n;
        cin>>n ;
        int arr[n];
        for(int i =0; i< n;i++){
             int a;
             cin >> a;
            arr[i]=a;
        }

        int count=0;
        bool fla= true;
        // int debug =0 ;
        while(fla){

        //     for(int i =0; i< n;i++){
        //         cout<< arr[i]<<" ";
        //      }
        //   cout<<endl;
            fla =false;
             for(int i =count%2; i<= n-(count%2+1);i=i+2){
                 if(i+1 < n && arr[i] > arr[i+1]){
                     swap(arr[i] , arr[i+1]);
                     fla= true;

                 }
             } 
             if(fla){
                 count++;
             }

            //  if(debug ==100){
            //      cout<< debug<<endl;
            //      break;
            //  }
        }

        cout<<count<< endl;

    }


    
   
    return 0;
}