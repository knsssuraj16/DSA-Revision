#include<bits/stdc++.h>
using namespace std;
#define N 10

char arr[N][N];

bool isVertical(int row , int col, string word){
    if(row-1 >= 0  &&  arr[row-1][col] != '+' ){
        return false;
    } 
    
    // first we check range of  that then check validation .
    if(row + word.size() < N  &&  arr[row+word.size()][col] != '+' ){
        return false;
    }
    
    for(int i =0; i< word.length(); i++){
        if(row + i>= N){
            return false;
        }
        
        if(word[i] == arr[row + i][col] ||arr[row + i][col] == '-' ){
            continue;
        }
        return false;
    }
    
    return true;
}


bool isHorizonatal(int row , int col, string word){

    // cout<<"checking";
	if(col-1 >= 0 && arr[row][col-1] != '+'){
        return false;
    }    
    if(col+ word.size()< N && arr[row ][col+word.size()] != '+'){
        return false;
    }
    for(int i =0 ; i<word.size(); i++){
        if(col+i>= N){
            return false;
        }
        
        if(arr[row][col+i] == '-' || arr[row][col+i] == word[i]){
            continue;
        }
        return false;
    }
    return true;
}

void placedVer(int row , int col, string word, vector<bool> & vec){
       for(int i =0 ; i<word.size(); i++){
        if(arr[row+i][col] == '-' ){
            arr[row+i][col]= word[i];
            vec[i]= true;
        		}
        }
}
void unplacedVer(int row , int col, string word, vector<bool> & vec){
       for(int i =0 ; i<word.size(); i++){
        if(vec[i]==true ){
            arr[row+i][col]= '-';
           }
       }
}

void unplacedHor(int row , int col, string word, vector<bool> & vec){
       for(int i =0 ; i<word.size(); i++){
        if(vec[i]==true ){
            arr[row][col+i]= '-';
           }
    }
}

void placedHor(int row , int col, string word, vector<bool> & vec){
       for(int i =0 ; i<word.size(); i++){
        if(arr[row][col+i] == '-' ){
                arr[row][col+i]= word[i];
                vec[i]= true;
        	}
        }
}

void print(){
    for(int i = 0;i< N;i++){
        for(int j=0;j< N; j++){
            cout<<arr[i][j];
        }
        cout<<"\n";
    }
    cout<<endl;
}
void crossWord( vector<string> &words,int idx){
    
    // cout<<idx<<endl;
    //  print();
    if(idx == words.size()){
        print();
        return;
    }
    for(int i = 0 ; i < N; i++){
        for(int j=0 ; j< N; j++){

            if(arr[i][j] == '-' || words[idx][0] == arr[i][j]){
                  
                

                if(isVertical(i,j,words[idx])){
                        // cout<<i<<" "<<j<<endl;
                    vector<bool> vec(words[idx].size(),false);
                	placedVer(i,j,words[idx],vec);
                      crossWord(words,idx+1);
                    unplacedVer(i,j,words[idx],vec);
                }
                
                if(isHorizonatal(i,j,words[idx])){
                    vector<bool> vec(words[idx].size(),false);
                    placedHor(i,j,words[idx],vec);
                     crossWord(words,idx+1);
                    unplacedHor(i,j,words[idx],vec);
                }
                //    cout<<i<<" "<<j<<endl;
            }
        }
    }
}
int main(){
    
    for(int i =0;i<N;i++){
        string s;
        cin>>s;
        
        for(int j=0;j<s.length();j++){
            arr[i][j]=s[j];
            
        // cout<<arr[i][j];
        }
        // cout<<endl;
    }
    
    char  s[100];
    cin>>s;
    
    
    
    char * token= strtok(s,";");
    
    vector<string> words;
    
    while(token != NULL){
        words.push_back(token);
        token =strtok(NULL,";");
    }
	
    crossWord(words,0);
 
 
    return 0;
}