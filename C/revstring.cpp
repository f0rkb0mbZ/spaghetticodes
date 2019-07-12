#include <iostream>

using namespace std;

void revstring(string s)
{
    int len = s.length();
    char rs[len];
    for (int i = 0, j = len - 1; i <= sizeof(rs); i++, j--)
    {
        rs[i] = s[j];
    }
    string revs(rs);
    cout << "The reversed string is: ";
    cout << revs;

}

int main()
{
    string s;
    cout << "Enter the string you want to reverse: ";
    cin >> s;
    revstring(s);
}