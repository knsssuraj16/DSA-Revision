#include<bits/stdc++.h>
using namespace std;
long long merge(long long arr[],int st,int mid,int en){
    int i =st;
    int j = mid+1;
    long long res[en-st+1];
    int ind=0;
    long long count=0;
    while(i<=mid && j <=en){
        if(arr[i]<arr[j]){
            count =count + (arr[i]*(en-j+1));
            res[ind++]= arr[i++];
        }else{
            res[ind++]= arr[j++];
        }
    }
    
    
     while(i<=mid ){
        res[ind++]= arr[i++];
     } 
    while(j<=en ){
        res[ind++]= arr[j++];
     }
    int k =0;
    for(;st<=en; st++){
        arr[st]= res[k++];
    }
    return count;
    
}
long long mSort(long long arr[], int st,int en){
    if(st==en){
        return 0;
    }
    int mid =( st+en)/2;
    long long a =mSort(arr,st,mid);
    long long b= mSort(arr,mid+1,en);
    long long c= merge(arr,st,mid,en);
    return (a+b+c);
}
int main(){
    
    int t;
    cin>>t;
    while(t--){
        int n;
        cin>>n;
        long long arr[n];
        for(int i=0;i<n;i++){
            cin>>arr[i];
        }
        long long tot= mSort(arr,0,n-1);
        cout<<tot<<endl;
    }
    return 0;
}