#include <bits/stdc++.h>
using namespace std;
#define endl ("\n")
#define fast ios_base::sync_with_stdio(false), cin.tie(nullptr), cout.tie(nullptr);

#define int long long


int32_t main(){
    fast
   
    int t;
    cin >> t;
    for(int z =1; z<=t; z++){
        int n;
        cin >> n;
        
        string arr;
        cin>>arr;

         stack<int> st;
         stack<int> rst;
         int nge[n]; 

         int pge[n]; 
        for (int i = n-1; i >= 0; i--)
        {   
             if (arr[i] == '1')
                {
                    st.push(i);
                }else{
                    if(st.size() == 0){
                        nge[i] = INT_MAX;
                    }else{
                        int a = st.top();
                        nge[i]= a-i;

                    }
                }


            
           
        }
        for (int i = 0; i<n; i++)
        {   
             if (arr[i] == '1')
                {
                    rst.push(i);
                }else{
                    if(rst.size() == 0){
                        pge[i] = INT_MAX;
                    }else{
                        int a = rst.top();
                        pge[i]= i-a;

                    }
                }


            
           
        }

        int count=0;
           for (int i = 0; i<n; i++)
        {   
             if (arr[i] == '0')
                {
                  count += min(pge[i],nge[i]);  
                }
             
        }
              
        
        
       


        cout << "Case #" << z << ": " << count << endl;
    }
    return 0;
}

 // if (arr[i] == '0')
            // {
            //     int k = i + 1;
            //     int l = i - 1;
            //     while (true)
            //     {
            //         if (k <n && arr[k] == '1')
            //         {
            //             count = count + (k - i);
            //             // cout<<"i: "<<i<<(k - i)<<endl;
            //             break;
            //         }
            //         if (l >= 0 && arr[l] == '1')
            //         {
            //             count = count + (i - l);
            //             // cout<<"i: "<<i<<(i - l)<<endl;
            //             break;
            //         }
            //         k++;
            //         l--;
            //     }

                // cout << k<<endl;
                // cout << l<<endl;