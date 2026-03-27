#include <iostream>
#include <queue>
using namespace std;

int n, x;
priority_queue<int, vector<int>, greater<int>> pq;
int main(){
    cin.tie(0);
    ios_base::sync_with_stdio(0);
    cin >> n;
    while (n--){
        cin >> x;
        if (x != 0){
            pq.push(x);
        }
        else {
            if (pq.size()){
                cout << pq.top() << '\n';
                pq.pop();
            }
            else{
                cout << 0 << '\n';
            }
        }
    }
    return 0;
}