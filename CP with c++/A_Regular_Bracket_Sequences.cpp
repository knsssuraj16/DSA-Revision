// { Driver Code Starts
#include<bits/stdc++.h>
using namespace std;
static int cont;
void solve(int n,string psf){
    
        //  cout<<n;
    if(n==0){
       
         cont--;
    //   cout<< "count: "<<cont;
        if(cont>=0){
            cout<<psf<<"\n";
        }
        return;
    }
     if(cont>=0){
        solve(n-1,"("+psf+")");
        solve(n-1,psf+"()"); 
     }
   

}
int main(){
	int tc;
	cin >> tc;
	while(tc--){
	
        int n ;
        cin>>n;
        
        cont= n;
         solve(n,"");
	}
	return 0;
}  // } Driver Code Ends