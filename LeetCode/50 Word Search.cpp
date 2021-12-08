class Solution {
public:
    void dfs(vector<vector<char>>& board,vector<vector<bool>> &vis, string &word,int wc,int i ,int j,bool &check){
        if(i< 0|| j<0|| i>= board.size() || j>= board[0].size() || vis[i][j] ||board[i][j] != word[wc] ){
            return ;
        }
        // cout<<wc;
        vis[i][j]= true;
        if(wc == word.length()-1){
            check =true;
            return;
        }
        
         dfs(board,vis,word,wc+1,i-1,j,check);
        
        dfs(board,vis,word,wc+1,i,j-1,check);
        
        dfs(board,vis,word,wc+1,i+1,j,check);
        
        dfs(board,vis,word,wc+1,i,j+1,check);
       
        
         vis[i][j]= false;
    }
    bool exist(vector<vector<char>>& board, string word) {
        vector<vector<bool>>  vis(board.size(),vector<bool> (board[0].size(), false));
        
        int wc=0;
        bool check=false;
        for(int i =0; i< board.size(); i++){
            for(int j =0; j< board[0].size(); j++){
                if(board[i][j] == word[0]){
                    dfs(board,vis,word,0,i,j,check);
                    if(check){
                        return true;
                    }
                }
            }
        }
        
        return false;
    }
};