#include <iostream>
#include <set>
using namespace std;

int n;
set<string, greater<string>> s;
string name, status;
int main(){
    cin.tie(0); cout.tie(0);
    ios_base::sync_with_stdio(0);
    cin >> n;
    while (n--){
        cin >> name >> status;
        if (status == "enter") s.insert(name);
        else s.erase(name);
    }
    for (auto x : s) cout << x << '\n';
    return 0;
}