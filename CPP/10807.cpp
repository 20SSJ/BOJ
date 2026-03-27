#include <iostream>
#include <vector>
using namespace std;

int main(){
    ios_base::sync_with_stdio(false);
    cin.tie(0);
    int N, v;
    cin >> N;
    vector<int> v1(N);
    for (int i = 0; i < N; i++) cin >> v1[i];
    cin >> v;
    int cnt = 0;
    for (int j = 0; j < N; j++){
        if(v == v1[j]) cnt++;
    }
    cout << cnt;
    return 0;
}