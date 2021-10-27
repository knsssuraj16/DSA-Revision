class Solution {
public:
    string minWindow(string s, string t) {
        unordered_map <char,int> mp ;
        
        for(int  i =0 ; i< t.length(); i++){
            mp[t[i]]++;
        }
        int n = s.length();
        // cout<< n<<endl;
        int needCount = mp.size();
        int i =0, j =0;
        int ansi=0, ansj=0;
        int ansLen = INT_MAX;
        while(j <= n){
          
            
             // cout<< i<<" "<<j<<endl;
            if(needCount == 0){
                // cout<< i<<" "<<j<<endl;
                if((j-i) < ansLen){
                   ansLen = j-i;
                    ansi= i; 
                    ansj = j;
                    
               }
                
             if(mp.find(s[i]) != mp.end()){
                 mp[s[i]]++;
                if(mp[s[i]] == 1){
                    needCount++;
                }
             }
                i++;
                
                
            }else{            
            if(j < n && mp.find(s[j]) != mp.end()){
                mp[s[j]]--;
                if(mp[s[j]] == 0){
                    needCount--;
                    
                }
               j++;
            }else
              j++;
            }
            
            
        }
        
        return s.substr(ansi,ansj-ansi);
        
    }
};