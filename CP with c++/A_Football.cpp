#include <bits/stdc++.h>
using namespace std;
#define endl ("\n")
#define fast ios_base::sync_with_stdio(false), cin.tie(nullptr), cout.tie(nullptr);




    

int32_t main(){
    fast
    string s;
    int count0=0;
    int count1=0;
    cin>>s;
    for(int i=0; i< s.length(); i++){
        
        if(s[i] =='1'){
            if(count0 > 0){
                count0=0;       
            }
                count1++;
            if(count1 == 7){
                cout<<"YES";
                return 0;
            }  
            
            
        }else{
            if(count1 > 0){
                count1=0;       
            }
                count0++;
            if(count0 == 7){
                 cout<<"YES";
                return 0;
            }  
        }
    }
     cout<<"NO";

    
   
    return 0;
}