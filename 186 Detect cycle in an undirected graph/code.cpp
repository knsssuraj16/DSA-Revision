  bool dfshelfer(vector<int> adj[],bool visited[],int i, int par ){
         
        visited[i] = true;
        for(auto a: adj[i]){
            if(!visited[a] ){
            int check = dfshelfer(adj,visited,a,i);
                    if(check){
                       return check; 
                    }
                    
            }else{
               if( par != a){
                   return true;
               }
            }
        }
        return false;
    }
    //Function to detect cycle in an undirected graph.
	bool isCycle(int V, vector<int>adj[])
	{
            bool visited[V]={0};
            for(int i =0; i< V; i++){
                if(!visited[i]){
                    int check = dfshelfer(adj,visited,i,-1);
                    if(check){
                       return check; 
                    }
                }
            }
        return false;
	}