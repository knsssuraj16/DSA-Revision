#include <bits/stdc++.h>
using namespace std;
#define endl ("\n")
#define fast ios_base::sync_with_stdio(false), cin.tie(nullptr), cout.tie(nullptr);




int s[9];
int main(){
    fast
    int n,k;
    cin>>n>>k;
    memset(s,0, sizeof(s));
    for(int i =0; i<k; i++){
        int loc;
        cin>>loc;
        s[loc] = -1;
    }
    int temp= n;
    while(temp){
        int c = temp % 10;
        if(s[c] == -1){
            n++;
            temp= n;
            continue;
        }
        temp /= 10;
    }
    
    cout<< n;
   
    return 0;
}