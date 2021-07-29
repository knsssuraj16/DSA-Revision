#include <bits/stdc++.h>
using namespace std;
#define endl ("\n")
#define fast ios_base::sync_with_stdio(false), cin.tie(nullptr), cout.tie(nullptr);




    

int32_t main(){
    fast
    string  s;
    
    cin>>s;
    bool flag= false;
    for(int i =0; i< s.length(); i++){
        if(s[i] =='H'){
            flag= true;
        }else  if(s[i] =='Q'){
            flag= true;
        }else  if(s[i] =='9'){
            flag= true;
        }
    }

    if(flag){
        cout<<"YES";
    }else{
        cout<<"NO";
    }
       

    

    
   
    return 0;
}