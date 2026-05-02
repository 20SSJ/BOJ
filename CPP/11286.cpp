#include <iostream>
#include <queue>
using namespace std;

struct cmp{
    bool operator()(int a, int b){
        if (abs(a) == abs(b)) return a > b;
        return abs(a) > abs(b);
    }
};

int x, n;
int main(){
    cin.tie(0);
    ios_base::sync_with_stdio(0);
    cin >> n;
    priority_queue<int, vector<int>, cmp> pq;
    while(n--){
        cin >> x;
        if (x == 0){
            if (pq.empty()) cout << 0 << '\n';
            else{
                cout << pq.top() << '\n';
                pq.pop();
            }
        }
        else
        pq.push(x);
    }
    return 0;
}