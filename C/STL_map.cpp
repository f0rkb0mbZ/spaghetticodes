#include <iostream>
#include <map>

using namespace std;

int main()
{
    map<string, int> strmap;

    strmap.insert(pair<string, int>("id", 1));
    strmap.insert(pair<string, int>("number", 23450782));
    map<string, int>::iterator itr;
    for(itr = strmap.begin(); itr != strmap.end(); ++itr)
    {
        cout << '\t' << itr->first
             << '\t' << itr->second << '\n';
    }
    cout << endl;
    return 0;
}