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
        int n , m , k;
        cin>> k >> n >> m;
        int arrn[n];
        int arrm[m];
        for(int i= 0 ; i < n ; i++){    
            cin>> arrn[i];
        }
        for(int i= 0 ; i <m; i++){    
            cin>> arrm[i];
        }

        
         vector<int> res;
        int i=0,j=0;

        bool flag =true;
        while( i !=n || j !=m){
       
               if (i != n && arrn[i] == 0) {
                res.push_back(0);
                k++;
                i++;
            } else if (j != m && arrm[j] == 0) {
                res.push_back(0);
                k++;
                j++;
            } else if (i != n && arrn[i] <= k) {
                res.push_back(arrn[i++]);
            } else if (j != m && arrm[j] <= k) {
                res.push_back(arrm[j++]);
            } else {
                flag = false;
                break;
            }

           
     
        }
        if(flag)
        for(auto a: res){
            
            cout<<a<<" ";
        }
        else
        cout<<"-1";

        cout<<"\n";
    }


    
   
    return 0;
}