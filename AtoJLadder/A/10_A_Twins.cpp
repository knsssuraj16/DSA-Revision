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

    vector<int> arr(n);

    int tot =0;
    for(int i =0 ;i< n; i++){
        cin >> arr[i];
        tot += arr[i];
    }

    sort(arr.begin(),arr.end());
    int count =0;

    tot = tot/2;
    for(int i = n-1; i>=0 ;i--){
        tot -=arr[i];
        count++;
        if(tot < 0){
            break;
        }
    }

    cout << count;
    return 0;
}