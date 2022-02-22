#include <bits/stdc++.h>
using namespace std;
int fibonaci( vector<int>& fibo,int n){
    if(n == 0 || n ==1 ){
        fibo[0]=0;
        fibo[1]=1;
    }

    if(fibo[n] != -1){
        return fibo[n]
    }
    fibo[n] = fibonaci(fibo,n-1) +fibonaci(fibo,n-2);
}
bool isPrime(int n){
    int count = 0;
    for(int i=2; i<n; i++){
        if(n % i == 0){
            count++;
        }
    }
    if(count ==2 ){
        return true;
    }
    return false;
}
int main(){
    int n;
    
    cin >>n ;
    
    vector<int> fibo(n+1,-1);
    
    fibonaci(fibo,n);

    for(int i =0; i<=nl i++){
        if(isPrime(fibo[i])){
            cout <<fibo[i]; 
        }
        
    }
   
    return 0;
}