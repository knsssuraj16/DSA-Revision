#include <bits/stdc++.h>
using namespace std;
void multiple(int A[2][2],int M[2][2]){
    int fv = A[0][0] * M[0][0] + A[0][1] * M[1][0];
    int sv = A[0][0] * M[0][1] + A[0][1] * M[1][1];
    int tv = A[1][0] * M[0][0] + A[1][1] * M[1][0];
    int lv = A[1][0] * M[0][1] + A[1][1] * M[1][1];

    A[0][0]= fv;
    A[0][1] = sv;
    A[1][0] = tv;
    A[1][1] = lv; 
}
void pow(int A[2][2], int n){
    if(n ==0 || n==1){
        return ;
    }

    pow(A,n/2);

    multiple(A,A);
    if(n % 2 != 0){
        int M[2][2] ={{1,1},{1,0}};
        multiple(A,M);
    }
}
int fibo(int n){
    int A[2][2] ={{1,1},{1,0}};
    if(n ==0){
        return 0;
    }
    pow(A,n-1);
    return A[0][0];
}
int32_t main(){
   
   int n; 
   cin >> n;
   cout << fibo(n);
    
    return 0;
}