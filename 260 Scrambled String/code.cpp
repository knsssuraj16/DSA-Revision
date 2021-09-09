class Solution {
public:
    unordered_map<string, bool> mp;
    bool isScramble(string a, string b) {
        
        if(a.length() != b.length()){
            return false;
        }
        
        if(a.compare(b) == 0){
            return true;
        }
        
        if (a.length()<=1){
            return false;
        }
        
        string key = a;
        key.push_back(' ');
        key.append(b);
        if(mp.find(key) != mp.end()){
            return mp[key];
        }
        
        
        bool flag= false;
        int n = a.length();
        for(int i = 1; i<=n-1; i++){
            if(isScramble(a.substr(0,i),b.substr(0,i))&&
               isScramble(a.substr(i,n-i),b.substr(i,n-i)) || 
              
               isScramble(a.substr(0,i),b.substr(n-i,i))&&
               isScramble(a.substr(i,n-i),b.substr(0,n-i))){
                flag = true;
            }
        }
        
        mp[key] = flag;
        
        return flag;
        
    }
};