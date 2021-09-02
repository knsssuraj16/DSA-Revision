#include<bits/stdc++.h>
using namespace std;
main(){
	int t;
	scanf("%d",&t);
	while(t--){
		long long n;
		scanf("%lld",&n);
		n++;
        // cout<< n<<endl;
        n/=2;
        
        // cout<< n<<endl;
        n=(n>3?n:3);
        
        // cout<< n<<endl;
        n*=5;
        
        // cout<< n<<endl;
		printf("%lld\n",n);
	}
}