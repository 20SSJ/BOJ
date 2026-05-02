#include <iostream>
using namespace std;

int main(){
    ios_base::sync_with_stdio(false);
    cin.tie(0);
    int N, K, S, Y;
    int arr[2][6] = {};
    cin >> N >> K;
    for (int i = 0; i < N; i++){
        cin >> S >> Y;
        arr[S][Y - 1]++;  
    }
    int room = 0;
    for (int i = 0; i < 2; i++){
        for (int j = 0; j < 6; j++){
            if (arr[i][j] == 0) continue;
            room = room + (arr[i][j] + K - 1) / K;
        }
    }
    cout << room;
    return 0;
}