class Solution {
public:
  
    vector<int> spiralOrder(vector<vector<int>>& matrix) {
        
        int m= matrix.size(),n  = matrix[0].size();
        
        int minrow=0,mincol =0 , maxrow = m-1, maxcol= n-1;
        
        int totcol= m*n;
        
        int count= 0;
        
        vector<int> res ;
        
        while(count <  totcol){
            for(int j = mincol, i= minrow; j<=maxcol && count <  totcol; j++){
                res.push_back(matrix[i][j]);
                count++;
            }
            minrow++;
            
            for(int j = maxcol, i= minrow; i<=maxrow && count <  totcol ; i++){
                res.push_back(matrix[i][j]);
                count++;
            }
            maxcol--;
            
            for(int j = maxcol, i= maxrow; j>= mincol && count <  totcol ; j--){
                res.push_back(matrix[i][j]);
               count++;
            }
            maxrow--;
            
              for(int j = mincol, i= maxrow; i>= minrow && count <  totcol ; i--){
                res.push_back(matrix[i][j]);
                count++;
            }
            mincol++;
        }
        
        return res;
    }
};