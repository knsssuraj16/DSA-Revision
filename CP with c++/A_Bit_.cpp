#include <bits/stdc++.h>
using namespace std;
#define endl ("\n")
#define fast ios_base::sync_with_stdio(false), cin.tie(nullptr), cout.tie(nullptr);




    

int32_t main(){
    fast
    int n;
    cin >> n;
    int count=0;
    while(n--){
      string s;
      cin>>s;
      if(s[2] =='X'){
          if(s[0]=='+' && s[1] =='+'){
              count++;
          }else if (s[0]=='-' && s[1] =='-'){
              count--;
          }
      }else{
           if(s[1]=='+' && s[2] =='+'){
              count++;
          }else if (s[1]=='-' && s[2] =='-'){
              count--;
          }
      }

    }

    cout<<count;

    
   
    return 0;
}