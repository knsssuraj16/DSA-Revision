#include <bits/stdc++.h>
using namespace std;
#define endl ("\n")
#define fast ios_base::sync_with_stdio(false), cin.tie(nullptr), cout.tie(nullptr);

int32_t main()
{
    fast int t;
    cin >> t;

    while (t--)
    {
        int n;

        cin >> n;

        int arr[n];
        int sum = 0;
        int o=0;
        int e=0;
        for (int i = 0; i < n; i++)
        {
            cin >> arr[i];
            sum += arr[i];
            if(arr[i] %2 ==0){
                e++;
            }else{
                o++;
            }

        }

        if (abs(o-e)<=1)
        {

            if (n == 1)
            {

                cout << 0 << endl;
            }
            else
            {
                bool ev = false;
                bool odd = false;
                int totEve = 0;
                int totOdd = 0;
                int res = 0;
                for (int i = 0; i < n; i++)
                {
                    if (arr[i] % 2 == 0)
                    {

                        if (totOdd >= 2)
                        {
                            res = max(res, totOdd);
                        }
                        totEve++;
                        totOdd = 0;
                    }
                    else
                    {
                        if (totEve >= 2)
                        {
                            res = max(res, totEve);
                        }
                        totEve = 0;
                        totOdd++;
                    }
                }

                //      cout<<endl<<endl;
                //    cout<<res<<endl;
                cout << abs(totEve - totOdd) << endl;
                //    cout<<totOdd<<endl;
            }
            //      cout<<endl<<endl;
        }
        else
        {
            cout << -1 << endl;
        }
    }

    return 0;
}
