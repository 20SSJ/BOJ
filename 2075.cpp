#include <iostream>
#include <queue>
using namespace std;

int n, x;
priority_queue<int, vector<int>, greater<int>> pq;
int main(){
    cin.tie(0);
    ios_base::sync_with_stdio(0);
    cin >> n;
    for (int i = 0; i < n * n; i++){
        cin >> x;
        pq.push(x);
        if (pq.size() > n) pq.pop();
    }
    cout << pq.top();
    return 0;
}