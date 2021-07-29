class Solution {
public:
    
    void helpers(vector<vector<int>>& image,int sr,int sc,int newColor,int cur, vector<vector<bool>>& visited){
        if(sr<0 ||sr==image.size() ||sc<0 ||sc==image[0].size()  || visited[sr][sc] == true ||image[sr][sc] != cur){
            return;
        }
        
        visited[sr][sc] = true;
        image[sr][sc] = newColor;
        helpers(image,sr+1,sc,newColor,cur,visited);
        helpers(image,sr-1,sc,newColor,cur,visited);
        helpers(image,sr,sc+1,newColor,cur,visited);
        helpers(image,sr,sc-1,newColor,cur,visited);
    }
    vector<vector<int>> floodFill(vector<vector<int>>& image, int sr, int sc, int newColor) {
        vector<vector<bool>> visited(image.size() ,vector<bool>(image[0].size(),false));
        
        helpers(image,sr,sc,newColor,image[sr][sc],visited);
        
        
        return image;
    }
};