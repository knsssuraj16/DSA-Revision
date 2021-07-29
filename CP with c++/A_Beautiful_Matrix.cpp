#include <bits/stdc++.h>
using namespace std;
#define endl ("\n")
#define fast ios_base::sync_with_stdio(false), cin.tie(nullptr), cout.tie(nullptr);




    

int32_t main(){
    fast
    int n=5,m=5;
    int r,c;
    for(int i =0; i< 5; i++){
        for(int j=0; j<n ; j++){
             int a;
             cin >>a;
             if(a == 1){
                  r=i;
                  c=j;
                    
             }  
        }
    }

    int tr=2;
    int tc=2;
    int count=0;
    while(r!=tr || c!=tc){
        if(r>tr){
            r--;
            count++;
        }else if (r<tr){
            r++;
            count++;
        }
        if(c>tc){
            c--;
            count++;
        }else if (c<tc){
            c++;
            count++;
        }
        
    }

    cout<<count;
    
   
    return 0;
}