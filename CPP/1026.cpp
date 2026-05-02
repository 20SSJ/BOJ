#include <iostream>
#include <algorithm>
#include <vector>
using namespace std;

int n, e, result;
vector<int> a;
vector<int> b;
int main(){
    cin.tie(0); cout.tie(0);
    ios_base::sync_with_stdio(0);
    cin >> n;
    for (int i = 0; i < n; i++){
        cin >> e;
        a.push_back(e);
    }
    for(int i = 0; i < n; i++){
        cin >> e;
        b.push_back(e);
    }
    sort(a.begin(), a.end());
    sort(b.rbegin(), b.rend());
    for(int i = 0; i < n; i++){
        result += a[i] * b[i];
    }
    cout << result;
    return 0;
}