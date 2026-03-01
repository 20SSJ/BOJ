#include <iostream>
#include <set>
#include <algorithm>
#include <vector>
using namespace std;

int n, m, num;
set<int> a;
set<int> b;
vector<int> result;
int main(){
    cin.tie(0); cout.tie(0);
    ios_base::sync_with_stdio(0);
    cin >> n >> m;
    while(n--){
        cin >> num;
        a.insert(num);
    }
    while(m--){
        cin >> num;
        b.insert(num);
    }
    set_difference(a.begin(), a.end(), b.begin(), b.end(), back_inserter(result));
    cout << result.size() << '\n';
    for (auto r: result) cout << r << ' ';
    return 0;
}