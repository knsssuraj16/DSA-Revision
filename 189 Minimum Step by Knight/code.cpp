// { Driver Code Starts
#include<bits/stdc++.h>
using namespace std;

 // } Driver Code Ends

class Solution 
{
    public:
    
  struct move{
        int i;
        int j;
        int count;
            move(int i,int j,int count):    i(i),j(j),count(count){

            }
    };
    
    int helperss(int ci, int cj,int ti,int tj, int N, vector<vector<bool>> &visited){
    int dx[] = { -2, -1, 1, 2, -2, -1, 1, 2 };
    int dy[] = { -1, -2, -2, -1, 1, 2, 2, 1 };
        queue<move> qu;
        qu.push(move(ci,cj,0));
        while(!qu.empty()){
            move m= qu.front();
            qu.pop();
            if(m.i == ti && m.j== tj){
                return m.count;
            }
            for(int i =0; i<8; i++){
                
                int x =m.i+dx[i];
                int y =m.j+dy[i];
                if(x >= 1 && x <= N && y >= 1 && y <= N && !visited[x][y]){
                    
                     visited[x][y]= true;
                    qu.push(move(x,y,m.count+1));
                }
            }

        }
          
          return 0;
         
    }
    //Function to find out minimum steps Knight needs to reach target position.
	int minStepToReachTarget(vector<int>&KnightPos,vector<int>&TargetPos,int N)
	{
	        vector<vector<bool>> visited(N+1,vector<bool>(N+1,0));


            
	      return  helperss(KnightPos[0], KnightPos[1], TargetPos[0],TargetPos[1], N,visited);
	    // Code here
	}
};

// { Driver Code Starts.
int main(){
	int tc;
	cin >> tc;
	while(tc--){
		vector<int>KnightPos(2);
		vector<int>TargetPos(2);
		int N;
		cin >> N;
		cin >> KnightPos[0] >> KnightPos[1];
		cin >> TargetPos[0] >> TargetPos[1];
		Solution obj;
		int ans = obj.minStepToReachTarget(KnightPos, TargetPos, N);
		cout << ans <<"\n";
	}
	return 0;
}  // } Driver Code Ends