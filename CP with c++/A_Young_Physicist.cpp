#include <bits/stdc++.h>
using namespace std;
int n, a, b, c, d, e, f;
int main()
{
   cin >> n;
    while (n--)
    {
        cin >> a >> b >> c;
        d += a;
          e += b;
          f += c;
    }
    cout << (d | e | f ? "NO" : "YES");
}