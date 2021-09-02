#include <bits/stdc++.h>
using namespace std;
#define endl ("\n")
#define fast ios_base::sync_with_stdio(false), cin.tie(nullptr), cout.tie(nullptr);

void printGraphs(vector<int> adj[], int V)
{   cout<<endl;
    for (int v = 1; v <V; ++v)
    {
        cout<<endl<< v << ": head ";
        for (auto x : adj[v])
           cout << "-> " << x;
        printf("\n");
    }
}

void printGraph(vector<int> adj[], int V)
{   int count=0;

    for (int v = 1; v <V; ++v)
    {
       if( adj[v].size() > 0){
            count++;
       }
    }

    cout<<count<<"\n";
}

void dfs( vector<int>  graph[],bool vis[],int i,  unordered_set<int> &sets){
   
    
    vis[i]=true;

    for(auto a: graph[i]){
        
        if(!vis[a]){
             dfs(graph,vis,a,sets);
         if(i > a){
             cout<<"\n "<< i <<": mara: "<<a;
             sets.erase(a);
             

            //  swap(a,i); 
            //  graph[a].clear();
        }else{

          swap(a,i);   
             cout<<"\n "<< a <<": mara: "<<i;
             sets.erase(i);
            //  graph[i].clear(); 
        }
        
        }
    }


}

void processes( vector<int>  graph[],int v){

    unordered_set<int> sets;

    bool vis[v]={0};
    for(int i = 1; i< v; i++){
        sets.insert(i);
    } for(int i = 1; i< v; i++){
        if(!vis[i] ){
             dfs(graph,vis,i,sets);
        }
    }

    // printGraph(graph,v);
      cout<<sets.size()<<"\n";
}


void addFrnd( vector<int>  graph[],int a, int b){
            
            graph[a].push_back(b);
            graph[b].push_back(a);
}
void removeFrnd(vector<int>  graph[] , int a ,int b){
        auto itr = find(graph[a].begin(),graph[a].end(),b);
            if(itr != graph[a].end())
                graph[a].erase(itr);
        auto itr1 = find(graph[b].begin(),graph[b].end(),a);
            if(itr1 != graph[b].end())
                graph[b].erase(itr1);
}
int main()
{
    fast 
    int v, e;
    cin >> v >> e;
    v++;
  vector<int> graph[v];
  vector<int> locGraph[v];
    for(int i=0; i<e ; i++){
            int src,des;
            cin>>src >>des;

            graph[src].push_back(des);
            graph[des].push_back(src);

    }

    int qc;
    cin>>qc; 
     copy(graph,graph+v,locGraph);
    for(int i =0; i< qc;i++){
        int q;
        int a;int b;
        cin>>q;
        if(q==3){
            
        //    printGraphs(graph, v);
                processes(locGraph,v);
            
            //   printGraphs(locGraph, v);
            
     copy(graph,graph+(v-1),locGraph);
        }else if (q==1){
            cin>>a>>b;
            addFrnd(locGraph,a,b);
        }else if (q == 2){
            cin>>a>>b;
            removeFrnd(locGraph,a,b);
        }
    }

    return 0;
}