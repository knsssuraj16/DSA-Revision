// Online C++ compiler to run C++ program online
#include <iostream>
#include <sstream>
#include <vector>
using namespace std;
int main()
{
    // Write C++ code here
    vector<double> val{0.01, 0.05, 0.10, 0.25, 0.50, 1.00, 5.00, 10.00, 25.00, 50.00, 100.00};
    vector<string> name{"0.01", "0.05", "0.10", "0.25", "0.50", "1.00", "5.00", "10.00", "25.00", "50.00", "100.00"};
    string s;
    getline(cin, s);
    stringstream ss(s);

    char c;
    double pp, cp;
    ss >> cp;
    ss >> c;
    ss >> pp;
    cout << cp << endl
         << pp << endl;
    double rem = pp - cp;
    int i = 10;
    cout << rem;
    string res = "";
    while (rem > 0.0 && i >= 0)
    {
        // cout << rem;
        if (rem > val[i])
        {
            rem -= val[i];
            res += " " + name[i];
        }
        else
        {
            i--;
        }
    }
    cout << res;

    return 0;
}