#include <iostream>
#include <queue>
using namespace std;

int n, c, a, b, nw, total;
priority_queue<int, vector<int>, greater<int>> pq;
int main(){
    cin >> n;
    while(n--){
        cin >> c;
        pq.push(c);
    }
    while(pq.size() != 1){
        a = pq.top();
        pq.pop();
        b = pq.top();
        pq.pop();
        nw = a + b;
        pq.push(nw);
        total = total + a + b;
    }
    cout << total;
    return 0;
}