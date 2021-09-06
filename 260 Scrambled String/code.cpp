#include <bits/stdc++.h>
using namespace std;
#define endl ("\n")
#define fast ios_base::sync_with_stdio(false), cin.tie(nullptr), cout.tie(nullptr);


class Solution{
    
int dp[201][201][2];
public:
    int solve(string &str,int i,int j,bool isTrue){
        
        if(i>j){
            return 0;
        }
        if(i==j){
            if(isTrue){
                return str[i] == 'T';
            }else{
                return str[i] == 'F';;
            }
        }
    
        if(dp[i][j][isTrue] != -1){
            return dp[i][j][isTrue]; 
        }
         int sum =0 ;
        for(int k = i+1; k<= j-1 ;k=k+2 ){
            int lt = solve(str,i,k-1,true);
            int lf = solve(str,i,k-1,false);
            int rt = solve(str,k+1,j,true);
            int rf = solve(str,k+1,j,false);
           
            if(str[k] == '&'){
                if(isTrue){
                    sum +=(lt * rt);
                }else{
                    sum += ((lf * rf) + (lf * rt) +( lt * rf));
                }
            } else if(str[k] == '|'){
                 if(isTrue){
                     
                    sum += ((lt * rt) + (lf * rt) +( lt * rf));
                }else{
                    
                    sum +=(lf * rf);
                }
            } else if(str[k] == '^'){
                if(isTrue){
                     
                    sum += ( (lf * rt) +( rf * lt));
                }else{
                    
                    sum +=(lf * rf) +(lt * rt);
                }
            }
        }
         dp[i][j][isTrue] = sum%1003;
        return dp[i][j][isTrue];
    }
    int countWays(int N, string S){
        memset(dp ,-1, sizeof (dp));
      


        return   solve(S,0,S.length()-1,true);;
    }
};

// { Driver Code Starts.

int main(){
    int t;
    cin>>t;
    while(t--){
        int N;
        cin>>N;
        string S;
        cin>>S;
        
        Solution ob;
        cout<<ob.countWays(N, S)<<"\n";
        
    }
    return 0;
} 