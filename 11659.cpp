#include <iostream>
using namespace std;

int n, m, i, j;
int arr[100001];
int prefix[100001];
int main(){
    cin.tie(0); cout.tie(0);
    ios_base::sync_with_stdio(0);
    cin >> n >> m;
    for (int k = 1; k <= n; k++){
        cin >> arr[k];
        prefix[k] = prefix[k-1] + arr[k];
    }
    while(m--){
        int ans = 0;
        cin >> i >> j;
        ans = prefix[j] - prefix[i-1];
        cout << ans << '\n';
    }
    return 0;
}