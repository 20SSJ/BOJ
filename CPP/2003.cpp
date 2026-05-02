#include <iostream>
using namespace std;

int n, m, total;
int arr[10001];
int main(){
    cin.tie(0); cout.tie(0);
    ios_base::sync_with_stdio(0);
    cin >> n >> m;
    for(int i = 0; i < n; i++){
        cin >> arr[i];
    }
    int cnt = 0;
    for(int i = 0; i < n; i++){
        if (arr[i] == m){
            cnt++;
            continue;
        }
        total = arr[i];
        for (int j = i + 1; j < n; j++){
            total += arr[j];
            if(total == m){
                cnt++;
                break;
            }
            if(total > m) break;
        }
    }
    cout << cnt;
    return 0;
}