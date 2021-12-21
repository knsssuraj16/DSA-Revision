#include <bits/stdc++.h>
using namespace std;
#define endl ("\n")
#define pi (3.141592653589)
#define mod 1e9+7

#define float double

#define fast ios_base::sync_with_stdio(false), cin.tie(nullptr), cout.tie(nullptr);


int32_t main(){
    fast

    
    
    int row=0,col=0;
    
    vector<vector<int>> arr(5,vector<int>(5));
    for(int i =0 ;i< 5; i++){
        for(int j =0;j< 5 ; j++){
            cin >> arr[i][j];
            if(arr[i][j] == 1){
                row= i;
                col =j;
            }
        }

    }

    // cout << (row-2)<<" "<<col<<" "<<endl;

    cout <<(abs(row-2) + abs(col-2));

    // 1,4  2,2 
    return 0;
}