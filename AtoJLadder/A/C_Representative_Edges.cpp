#include <bits/stdc++.h>
using namespace std;
#define endl ("\n")
#define pi (3.141592653589)
#define mod 1e9+7

#define float double

#define fast ios_base::sync_with_stdio(false), cin.tie(nullptr), cout.tie(nullptr);

int helper(vector<int> &arr,int n,int big,int tot){
    
    if(n==0){
        // cout << "reached"<<endl;
        
        return 0;
    }
    int res = 0;
    // int loc = ((arr[0] +arr[n-1]) * ((n-1) - (n-2)+1))/2;

    if( arr[n-1] < big ){
        int res1 = helper(arr,n-1,big,tot);
        int res2 = helper(arr,n-1,arr[n-1],tot);
        return max(res1,res2);
    }else{
         return 1 +  helper(arr,n-1,arr[n-1],tot);
    }
    
}
int solved(vector<int > &arr,int n,int tot){

    return helper(arr,n,101,0);
}

int32_t main(){
    fast
    int t;
    cin >> t;
    for(int i =1; i<=t; i++){

        int n;
        cin >> n;
        vector<int> arr(n);
        int tot =0;
        for(auto &a: arr){
            cin >> a;
            tot += a;
        }
        cout << solved(arr,n,tot)<<endl;
    }
    return 0;
}