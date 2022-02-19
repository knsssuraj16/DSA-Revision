#include <bits/stdc++.h>
using namespace std;
void buildTree(vector<int> &tree,int start,int end,  vector<int> &arr,int treeNode){
    if(start  == end){
        tree[treeNode]= arr[start];
        return;
    }
    int mid = (start + end) / 2;

        buildTree(tree,start,mid,arr,2*treeNode);
        buildTree(tree,mid+1,end,arr,2*treeNode +1);

        tree[treeNode] = tree[treeNode * 2] + tree[treeNode * 2 + 1 ] ;

}
   
void updateTree(vector<int> &tree,int start ,int end ,vector<int> & arr,int treeNode,int idx,int value){
if(start == end){
    arr[idx]= value;
    tree[treeNode]= value;
    return;
}

int mid  = (start + end) /2;
if(idx > mid){
    
    updateTree(tree,mid+1,end,arr,2*treeNode +1,idx,value);
}else{

    updateTree(tree,start,mid,arr,2*treeNode,idx,value);
}

tree[treeNode] = tree[treeNode*2]+ tree[treeNode*2 +1];

}
int query(vector<int> &tree,int start ,int end, int treeNode,int left ,int right){
    //completely inside : start and end should be in between left and right 
    if(left <= start && right >= end){
        return tree[treeNode];
    }
    //completely outside
    if(right < start || left > end){
        return 0;
    }
    // partially insidde and partially outside;
    int mid = (start +  end) / 2;

   int l = query(tree,start,mid,treeNode*2,left,right);
   int r = query(tree,mid+1,end,treeNode*2+1,left,right);

    return (l+r);

}

int main(){
    int n;
    cin >> n;
   
    vector<int> arr(n);

    for(int i =0; i< n; i++){
        cin >> arr[i];
        //   cout << i;
    }


    vector<int> tree(2*n);
    buildTree(tree,0,n-1,arr,1);
     for(int i= 1; i<(2*n); i++){
        cout << tree[i]<<" ";
    }
    cout << endl;
//    updateTree(tree,0,n-1,arr,1,2,10);

    // for(int i= 1; i<(2*n); i++){
    //     cout << tree[i]<<" ";
    // }

    cout << query(tree,0,n-1,1,0,1)<< endl;
   
    return 0;
}