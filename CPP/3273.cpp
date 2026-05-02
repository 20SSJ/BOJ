#include <iostream>
#include <vector>
using namespace std;

int main(){
    cin.tie(0);
    ios_base::sync_with_stdio(false);
    int n, x, cnt = 0;
    cin >> n;
    vector<int> v(n);
    for (int i = 0; i<n; i++){
        cin >> v[i];
    }
    cin >> x;
    for (int i = 0; i < n - 1; i++){
        for (int j = i + 1; j < n; j++){
            if (v[i] + v[j] == x) cnt++;
        }
    }
    cout << cnt;
    return 0;
}