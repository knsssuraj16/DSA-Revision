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
       int n;
       
       cin>>n;
        string  arrE,arrG;
        cin >> arrE >>arrG; 
        int count =0;
        
        for(int i =0; i< n; i++){
            if(arrG[i] == '1'){
                if(arrE[i] == '0'){
                    count++;
                }else if ((i-1) >=0 && arrE[i-1] =='1'){
                    arrE[i-1]='0';
                    count++;
                }else if (i+1< (n) && arrE[i+1] == '1'){
                    arrE[i+1]='0';
                    count++;
                }
            }
        }
        cout<<count<<endl;

       


    }


    
   
    return 0;
}