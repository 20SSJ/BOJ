#include <iostream>
#include <vector>
#include <set>
#include <algorithm>
using namespace std;

set<string> s;
set<string> l;
vector<string> v;
int n, m;
string list;
int main(){
    cin.tie(0); cout.tie(0);
    ios_base::sync_with_stdio(0);
    cin >> n >> m;
    while(n--){
        cin >> list;
        s.insert(list);
    }
    while(m--){
        cin >> list;
        l.insert(list);
    }
    set_intersection(s.begin(), s.end(), l.begin(), l.end(), back_inserter(v));
    cout << v.size() << '\n';
    for(auto r: v) cout << r << '\n';
    return 0;
}