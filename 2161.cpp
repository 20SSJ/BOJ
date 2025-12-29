#include <iostream>
#include <queue>
using namespace std;

int n;
queue<int> q;
int main(){
    cin.tie(0); cout.tie(0);
    ios_base::sync_with_stdio(0);
    cin >> n;
    for (int i = 1; i <= n; i++){
        q.push(i);
    }
    while(q.size() > 1){
        cout << q.front() << ' ';
        q.pop();
        q.push(q.front());
        q.pop();
    }
    cout << q.front();
    return 0;
}