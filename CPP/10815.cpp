#include <iostream>
#include <set>
using namespace std;

int n, m, num;
set<int> s;
int main(){
    cin.tie(0); cout.tie(0);
    ios_base::sync_with_stdio(0);
    cin >> n;
    while(n--){
        cin >> num;
        s.insert(num);
    }
    int cnt = 0;
    cin >> m;
    while(m--){
        cin >> num;
        if (s.count(num)) cout << 1 << ' ';
        else cout << 0 << ' ';
    }
    return 0;
}