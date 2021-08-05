#include<bits/stdc++.h>
using namespace std;

int32_t main() {
  ios_base::sync_with_stdio(0);
  cin.tie(0);
  int t; 
  cin >> t;
  while (t--) {
    int n, m; 
    cin >> n >> m;
    ++m;
    cout<< "M: "<<m<<endl;
    int ans = 0;

    
    for (int k = 30; k >= 0 and n < m; k--) {
        
    // cout<< "n >> k: "<<(n >> k)<<endl;
    // cout<< "m >> k: "<<(m >> k)<<endl;
    char res[1000]; 
    itoa(n>>k,res,2);
     cout<<k<<": binery of n: "<<res;
    itoa(m>>k,res,2);
    
    cout<<" of m: "<<res<<endl;
      if ((n >> k & 1) == (m >> k & 1))
       continue;
      if (m >> k & 1) 
      ans |= 1 << k, n |= 1 << k;

      
    }
    // cout << ans << '\n';
  }
  return 0;
}