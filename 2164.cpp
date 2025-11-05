#include <iostream>
#include <queue>
using namespace std;

int main(){
    cin.tie(0);
    ios_base::sync_with_stdio(0);
    queue <int> Q;
    int N;
    cin >> N;
    for (int i = 1; i < N + 1; i++){
        Q.push(i);
    }
    while(Q.size() > 1){
        Q.pop();
        int a = Q.front();
        Q.push(a);
        Q.pop();
    }
    cout << Q.front();
    return 0;
}