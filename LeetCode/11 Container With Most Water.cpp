class Solution {
public:
    int maxArea(vector<int>& height) {
        int i = 0;
        int j = height.size()-1;
        int mx = 0;
        while(i<j){
            int len = j - i  ;
            int hie = min(height[i], height[j]);
            mx = max(mx,len * hie);
            if(height[i] < height[j]){
                i++;
            }else{
                j--;
            }
        }
        return mx;
        
    }
};