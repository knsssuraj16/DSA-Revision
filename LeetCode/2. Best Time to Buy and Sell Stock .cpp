class Solution {
public:
    int maxProfit(vector<int>& prices) {
        int mx= 0;
        
        int n =  prices.size();
        stack<int> st;
        for(int i =0 ; i<n  ; i++){
           if(st.size() == 0){
               st.push(prices[i]);
           }else{
               bool flag = false;
              int ele = st.top();
               while(st.size()>0){
                   if(st.top() >prices[i]){
                       st.pop();
                        flag= true;
                   }else{
                       break;
                   }
               }
               
               if(flag){
                   st.push(prices[i]);
               }
               
           }
            
            mx= max(mx,prices[i] - st.top());
        }
        
        return mx;
    }
};