#include <bits/stdc++.h>
using namespace std;
#define endl ("\n")
#define pi (3.141592653589)
#define mod 1e9+7

#define float double

#define fast ios_base::sync_with_stdio(false), cin.tie(nullptr), cout.tie(nullptr);


int32_t main(){
    fast
    int t;
    cin >> t;
    vector<int> arr;
    for(int i =0; i<t; i++){
        int a;
        cin >> a;
        arr.push_back(a);
        
        
    }
    int min =t-1,max =0;
    for(int i =0 ;i< t; i++){
        // cout << arr[i]<<" ";
        
        if(arr[max] < arr[i]){
            max = i;
        }
    }

    for(int i =t-1 ;i>=0; i--){
        // cout << arr[i]<<" ";
        
        if(arr[min] > arr[i]){
            min = i;
        }
    }

   

    max = arr[max] > arr[0] ?max: 0; 
    min = arr[min] < arr[t-1] ?min: t-1; 
    int res=0;
   res += t-min;
   res += max-1;

    cout <<(max < min? res: res -1 ) <<endl;
    return 0;
}