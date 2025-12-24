#include <iostream>
#include <vector>
using namespace std;

int n, k, c, d;
vector<int> v;
int main(){
    cin.tie(0); cout.tie(0);
    ios_base::sync_with_stdio(0);
    int ans = 0;
    cin >> n >> k;
    for (int i = 0; i < n; i++){
        cin >> c;
        v.push_back(c);
    }
    for(int i = n-1; i > -1; i--){
        if (k >= v[i]){
            d = k / v[i];
            k %= v[i];
            ans += d;
        }
    }
    cout << ans << '\n';
    return 0;
}