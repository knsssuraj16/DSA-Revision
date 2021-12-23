#include <bits/stdc++.h>
using namespace std;
#define endl ("\n")
#define pi (3.141592653589)
#define mod 1e9+7

#define float double

#define fast ios_base::sync_with_stdio(false), cin.tie(nullptr), cout.tie(nullptr);


int32_t main(){
    fast
    
    int n ;
    cin >> n;
    
    vector<int> arr(3,0);
    for(int i=0 ;i< n;  i++){
        int a,b,c;
        cin >>a>>b>>c;
        arr[0] += a;
        arr[1] += a;
        arr[2] += a;
    }

    if(arr[0] ==0 && arr[1]==0 && arr[2] ==0 ){
        cout << "YES";
    }else{
        cout << "NO";
    }
    return 0;
}