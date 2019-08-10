#include <bits/stdc++.h>

using namespace std;

int main()
{
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);
    cout.tie(NULL);
    int n;
    cin >> n;
    int s[n];
    int c[n];
    for (int i = 0; i < n; i++)
    {
        cin >> s[i] ;
    }
    for(int i = 0; i < n; i++)
    {
        cin >> c[i];
    }
    sort(s, s+n);
    sort(c, c+n);
    int sum = 0;
    for(int i = 0; i < n; i++){
        sum += s[i] * c[i];
    }
    cout << sum;
    return 0;
}