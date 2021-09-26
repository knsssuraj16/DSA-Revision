long long merge (long long arr, int li, int mid,int rn){
    int si = li;
    long long res[rn-li+1];
    long long tot=0;
    int i=0;
    int ri= mid+1;
    while(li=mid && ri=rn){
        if(arr[li]  arr[ri]){
            
            tot+=(mid+1-li);
            res[i++]= arr[ri++];
              
        }else{
            res[i++]= arr[li++];
        }
    }
    
      while(li=mid ){
       
            res[i++]= arr[li++];
            
        }
    	while(ri=rn ){
       
            res[i++]= arr[ri++];
        }
    int j =0;
    for(;si=rn; si++){
        arr[si] =res[j++];
       
    }
    
    return tot;
    }

long long mergeSort(long long arr, int start,int end){
    if(start == end){
        return 0;
    }
   int  mid = start+(end-start)2;
    long long res = mergeSort(arr,start,mid);
    
    long long res1 = mergeSort(arr,mid+1,end);
    
    long long res2= merge(arr,start,mid,end);
    return res+res1+res2;
}




long long getInversions(long long arr, int n){
     Write your code here.
    
    return mergeSort(arr,0,n-1);
    
}