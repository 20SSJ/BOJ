#include <iostream>
#include <string>
#include <queue>
using namespace std;

int main(){
    cin.tie(0);
    ios_base::sync_with_stdio(0);

    int N, x;
    cin >> N;
    string s;
    queue<int> Q;
    for (int i = 0; i < N; i++){
        cin >> s;
        if (s == "push"){
            cin >> x;
            Q.push(x);
        }
        else if (s == "pop"){
            if (Q.empty()) cout << -1 << '\n';
            else{
                cout << Q.front() << '\n';
                Q.pop();
            }   
        }
        else if (s == "size"){
            cout << Q.size() << '\n';
        }
        else if (s == "empty"){
            if(Q.empty()) cout << 1 << '\n';
            else cout << 0 << '\n';
        }
        else if (s == "front"){
            if(Q.empty()) cout << -1 << '\n';
            else cout << Q.front() << '\n';
        }
        else if (s == "back"){
            if(Q.empty()) cout << -1 << '\n';
            else cout << Q.back() << '\n';
        }
    }
    return 0;
}