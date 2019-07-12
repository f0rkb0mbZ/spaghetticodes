#include <bits/stdc++.h>

using namespace std;

int main()
{
    vector<int> v = {4, 2, 5, 3, 5, 8, 3};
    sort(v.begin(), v.end());

    for (int i = 0; i < v.size(); i++)
    {
        cout << v.at(i) << ' ';
    }
}