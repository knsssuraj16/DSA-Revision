   bool isCycleHelper(int i, vector<int> adj [], bool visited [],bool rvis[]){
        
        visited[i] = true;
        rvis[i] = true;
        for(auto a: adj[i]){
             if(!visited[a]){
                 if(isCycleHelper(a, adj, visited,rvis)){
	                 return true;
	             }
	             
             }else if (rvis[a]){
                 return true;
             }
        }
        rvis[i] = false;
        
        
        return false;
    }
	//Function to detect cycle in a directed graph.
	bool isCyclic(int V, vector<int> adj[]) 
	{
	   bool visited[V] = {0};
	   bool rvis[V+1] = {0};
	   for(int i =0; i<V;i++ ){
	       if(!visited[i]){
	           if(isCycleHelper(i, adj, visited,rvis)){
	                 return true;
	             }
	       }
	   }
	   return false;
	}