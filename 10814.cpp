#include <iostream>
#include <map>
#include <vector>
#include <algorithm>
using namespace std;

bool cmp(const pair<int, string> &a, const pair<int, string> &b){
    return a.first < b.first;
}
int a, n;
string name;
vector<pair<int, string>> v;
int main(){
    cin.tie(0); cout.tie(0);
    ios_base::sync_with_stdio(0);
    cin >> n;
    while(n--){
        cin >> a >> name;
        v.push_back({a, name});
    }
    stable_sort(v.begin(), v.end(), cmp);
    for (auto r: v){
        cout << r.first << ' ' << r.second << '\n';
    } 
    return 0;
}