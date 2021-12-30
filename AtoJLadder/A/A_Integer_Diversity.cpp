#include <bits/stdc++.h>
using namespace std;
#define endl ("\n")
#define pi (3.141592653589)
#define mod 1e9+7

#define float double

#define fast ios_base::sync_with_stdio(false), cin.tie(nullptr), cout.tie(nullptr);
int solved(vector<int > &arr,int n){

    set<int> se;
    int count =0;
    for(int i =0; i< n; i++){
        if(se.find(arr[i]) == se.end()){
            se.insert(arr[i]);
        }else{
            se.insert(-1 * arr[i]);
        }
    }
    return se.size();
}

int32_t main(){
    fast
    int t;
    cin >> t;
    for(int i =1; i<=t; i++){

        int n;
        cin >> n;
        vector<int> arr(n);
        for(auto &a: arr){
            cin >> a;
        }
        cout << solved(arr,n)<<endl;
    }
    return 0;
}