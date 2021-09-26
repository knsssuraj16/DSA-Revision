#include <bits/stdc++.h>
using namespace std;
#define endl ("\n")
#define fast ios_base::sync_with_stdio(false), cin.tie(nullptr), cout.tie(nullptr);

struct jhula
{
    int hap;
    int from;
    int last;
} jh;

unordered_map<string,int> mp;

int solve(struct jhula jh[], int n, int k, int m2, int last, int start)
{
    if (n == 0 || k == 0)
    {
        return m2;
    }

    if(mp.find(to_string(n)+" "+to_string(k)+" "+to_string(m2)) != mp.end()){
        return mp[(to_string(n)+" "+to_string(k)+" "+to_string(m2))];
    }
    int nex = 0, iex = 0;
    if (last != -1 && ((jh[n - 1].from + jh[n - 1].last <= start) || (start + last <= jh[n - 1].from)))
    {
        nex = solve(jh, n - 1, k, m2, -1, -1);
    }
    else
    {
        int inc = solve(jh, n - 1, k - 1, m2 + jh[n - 1].hap, jh[n - 1].last, jh[n - 1].from);

        int ex = solve(jh, n - 1, k, m2, -1, -1);
        iex = max(inc, ex);
    }
    mp[(to_string(n)+" "+to_string(k)+" "+to_string(m2))] = max(nex, iex);
    return max(nex, iex);
}
int main()
{
    fast

        int t;
    cin >> t;
    for (int z = 1; z <= t; z++)
    {
        int d, n, k;
        cin >> d >> n >> k;
        struct jhula jh[n];
        for (int i = 0; i < n; i++)
        {
            cin >> jh[i].hap >> jh[i].from >> jh[i].last;
        }
      

        cout << "Case #" << z << ": " << solve(jh, n, k, 0, -1, -1) << endl;
    }
    return 0;
}
