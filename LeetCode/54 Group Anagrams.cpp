class Solution {
public:
    
    string findScore(string str){
        sort(str.begin(),str.end());
        return str;
    }
    vector<vector<string>> groupAnagrams(vector<string>& strs) {
        
        unordered_map <string , vector<string >> mp;
        
        for(int i =0 ;i< strs.size(); i++){
            string s = findScore(strs[i]);
            mp[s].push_back(strs[i]);
        }
        
         vector<vector<string>> res;
        
        for(auto a : mp){
            res. push_back(a.second);
        }
        
        return res;
    }
};