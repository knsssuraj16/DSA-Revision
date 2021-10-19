class Solution {
public:
    int trap(vector<int>& arr) {
        
        int n = arr.size();
         vector<int> lfB(n);
         vector<int> rib(n);
        int mx = INT_MIN;
        for(int i = 0 ;i< n; i++ ){
           mx=  max(mx,arr[i]);
            lfB[i] = mx;
        } 
        
        mx =INT_MIN; 
        for(int i = n-1 ;i>= 0; i-- ){
           mx=  max(mx,arr[i]);
            rib[i] = mx;
        }
        int tot = 0;
        for(int i =0;i< n; i++){
            tot += min(lfB[i], rib[i]) - arr[i];
        }
        return tot;
        
        
        
        
    }
};