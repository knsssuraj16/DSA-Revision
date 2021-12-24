class Solution {
public:
    
   bool solved(vector<vector<int>> &graph,vector<int>& ans,int i, vector<int> &visited){
      
       
      visited[i] =1;
       
       for(auto a: graph[i]){
           if(visited[a] == 0 && solved(graph,ans,a,visited)){
               return true;
           }
           if(visited[a] == 1){
               return true;
           }
       }
        visited[i] = 2;
       ans.push_back(i);
       return false;
   }
    
    vector<int> findOrder(int numCourses, vector<vector<int>>& prerequisites) {
        vector<vector<int>> graph(numCourses,vector<int>());
        vector<int> ans;
   
        
        for(int i =0 ;i < prerequisites.size(); i++){
            graph[prerequisites[i][1]].push_back(prerequisites[i][0]);
        }
        
        vector<int> visited(numCourses,0);
        for(int i =0 ;i< numCourses; i++)
        {
            if(visited[i]== 0 && solved(graph,ans,i,visited)){
                return {};
            }
          
            
        }   
        reverse(ans.begin(),ans.end());
        return ans;
    }
};