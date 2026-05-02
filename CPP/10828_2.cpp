#include <iostream>
#include <stack>
#include <string>
using namespace std;

int main(void){
    ios_base::sync_with_stdio(0);
    cin.tie(0);
    stack<int> s;
    int N, w;
    cin >> N;
    for (int i = 0; i < N; i++){
        string c;
        cin >> c;
        if (c == "push"){
            int w;
            cin >> w;
            s.push(w);
        }
        else if (c == "pop"){
            if(s.empty()) cout << -1 << '\n';
            else {
                cout << s.top() << '\n'; 
                s.pop();
            } 
        }
        else if (c == "size") cout << s.size() << '\n';
        else if (c == "top"){
            if(!s.empty()) cout << s.top() << '\n';
            else cout << -1 << '\n';
        } 
        else if (c == "empty"){
            if(s.empty()) cout << 1 << '\n';
            else cout << 0 << '\n';
        }
    }
}