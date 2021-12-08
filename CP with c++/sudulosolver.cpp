#include<bits/stdc++.h>
using namespace std;
#define N  9

int arr[N][N];

bool isSafe(int row,int col,int num){
    // cheking row is safe or not
    
    for(int i =0;i<N;i++){
        if(arr[i][col] == num){
            return false;
        }
    }
    
    for(int i =0;i<N;i++){
        if(arr[row][i] == num){
            return false;
        }
    }
    
    int rf= (row- (row%3));
    int cf= (col- (col%3));
    
    for(int i =0;i<3;i++){
        for(int j=0;j<3;j++){
            if(arr[i+rf][j+cf] == num){
                return false;
            }
        }
    }
    
    return true;
}
bool solve(int row ,int col){
   
    if(row==N){
        
        // cout<<"reached";
        return true;
    }
    
    int srow = row;
    int scol= col;
    if(col==N-1){
        srow = row+1;
        
       scol= 0;  
        // cout<<"row: "<<row<<" col: "<<col<<endl;       
    }else{
        scol =scol+1;
    }
    if(arr[row][col] != 0){
              
         if(solve(srow,scol)){
            return true;
         }
        
    }else{

    
            
            for(int i=1; i<=9; i++){
                if(isSafe(row,col,i)){
                    // cout<<"\nsafe: "<< i<<"\n" ;
                    arr[row][col] = i;
                    if(solve(srow,scol)){
                        return true;
                    }
                    arr[row][col] = 0;
                }
            }
    }
    return false;
    
    
}

int main(){
    
    for(int i=0;i<N;i++){
        for(int j=0;j<N;j++){
            cin>>arr[i][j];
        }
    }
    
    cout<<solve(0,0);
    
    return 0;
}