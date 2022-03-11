#include <bits/stdc++.h>
using namespace std;
#define endl ("\n")
#define pi (3.141592653589)
#define mod 1e9 + 7

#define float double

#define fast ios_base::sync_with_stdio(false), cin.tie(nullptr), cout.tie(nullptr);

void update(int val, vector<int> &tree, int i, int n)
{
    for (; i <= n; i += (i & -i))
    {
        tree[i] += val;
    }
}
int query(vector<int> &tree, int i, int n)
{
    int sum = 0;
    for (; i > 0; i -= (i & -i))
    {
        sum += tree[i];
    }

    return sum;
}

int32_t main()
{
    fast

        int n;
    cin >> n;
    vector<int> arr(n + 1);
    vector<int> tree(n + 1);

    for (int i = 1; i <= n; i++)
    {
        cin >> arr[i];
        update(arr[i], tree, i, n);
    }

    cout << query(tree, 7, n) - query(tree, 5, n) << endl;
    return 0;
}