 vectorstring findPathHelpers(vectorvectorint &m, int n,int i,int j,string psf, vectorvectorbool &visited){
        if(i0  j 0  i==n j ==n  visited[i][j] == 1  m[i][j] == 0){
             vectorstring res;
            return res;
        }
        
        if(i == (n-1) && j == (n-1)){
            vectorstring res;
            res.push_back(psf);
             return res; 
        }
        
        visited[i][j] = 1;
        vectorstring mainres;
        
        vectorstring res2 = findPathHelpers(m,n,i+1,j,psf+'D',visited);
       vectorstring res3 =  findPathHelpers(m,n,i,j-1,psf+'L',visited);
       vectorstring res4 = findPathHelpers(m,n,i,j+1,psf+'R',visited);
       vectorstring res1 = findPathHelpers(m,n,i-1,j,psf+'U',visited);
        
       for(auto a res2){
           mainres.push_back(a);
       }for(auto a res3){
           mainres.push_back(a);
       }for(auto a res4){
           mainres.push_back(a);
       }
       for(auto a res1){
           mainres.push_back(a);
       }
       
        visited[i][j] =0;
       return mainres;
        
    }
    vectorstring findPath(vectorvectorint &m, int n) {
         Your code goes here
        vectorvectorbool visited(n,vectorbool (n,0));
        return findPathHelpers(m,n,0,0,,visited);
    }