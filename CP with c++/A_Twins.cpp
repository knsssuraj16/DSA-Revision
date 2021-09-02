#include <bits/stdc++.h>
using namespace std;
#define endl ("\n")
#define fast ios_base::sync_with_stdio(false), cin.tie(nullptr), cout.tie(nullptr);




    

int32_t main(){
    fast
    int  n ;
    
    cin>>n;
    int arr[n];
   for(int i=0; i< n; i++){
       cin>>arr[i];

   }

   int i =0;
   int j=(n-1);

    if(n==1){
       cout<<"1";
       return 0;
   }
   sort(arr,arr+n,greater<int>() );
  
    int myTot=0;
    int broTot=0;
    int count=0;
   while(i<=j){

       if(myTot<= broTot+arr[j]){
           myTot +=arr[i];
           i++;
           count++;
       }else{
           broTot+=arr[j];
           j--;
       }

   } 

   cout<< count;
    

    
   
    return 0;
}