class Solution{
    int t[101][101];
public:

    int solve(int arr[], int i,int j){
        if(i >= j){
            return 0;
        }
        
        if(t[i][j] != -1){
            return t[i][j];
        }
        int mn= INT_MAX;
        for(int k =i; k<=j-1; k++){
            int temp = solve(arr,i,k) + solve(arr,k+1,j) + (arr[i-1]*arr[k]*arr[j]);
            mn= min(temp,mn);
        }
        
        t[i][j] = mn;
        
        return t[i][j];
    }
    int matrixMultiplication(int N, int arr[])
    {   memset(t,-1,sizeof t);
       return solve(arr,1,N-1);
    }
};