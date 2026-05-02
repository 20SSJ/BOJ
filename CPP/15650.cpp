#include <iostream>
using namespace std;

int N, M;
int arr[9];
bool isused[9]; 
void func(int num, int k){
    if (k == M){ // M개를 모두 택했으면
        for (int i = 0; i < M; i++)
         cout << arr[i] << ' '; // arr에 기록해둔 수 출력
        cout << '\n';
        return;
    }

    for(int i = num; i <= N; i++){
        if(!isused[i]){ // 아직 i가 사용되지 않았으면
            arr[k] = i;
            isused[i] = 1; // i를 사용했다고 표시
            func(i+1, k+1);
            isused[i] = 0;
        }
    }
}

int main(){
    cin.tie(0);
    ios_base::sync_with_stdio(0);
    cin >> N >> M;
    func(1, 0);
    return 0;
}