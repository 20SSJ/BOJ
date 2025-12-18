#include <iostream>
#include <map>
#include <string>
using namespace std;

int n, m;
string a, p;
map<string, string> mp;
int main(){
    cin.tie(0); cout.tie(0);
    ios_base::sync_with_stdio(0);
    cin >> n >> m;
    while(n--){
        cin >> a >> p ;
        mp[a] = p;
    }
    while(m--){
        cin >> a;
        cout << mp[a] << '\n';
    }
    return 0;
}