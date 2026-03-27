#include <iostream>
#include <deque>
using namespace std;

int main(void){
    cin.tie(0);
    ios_base::sync_with_stdio(0);
    deque<int> DQ;
    int N, x;
    string s;
    cin >> N;
    for (int i = 0; i < N; i++){
        cin >> s;
        if (s == "push_back"){
            cin >> x;
            DQ.push_back(x);
        }
        else if (s == "push_front"){
            cin >> x;
            DQ.push_front(x);
        }
        else if (s == "front"){
            if (DQ.empty()) cout << -1 << '\n';
            else cout << DQ.front() << '\n';
        }
        else if(s == "back"){
            if (DQ.empty()) cout << -1 << '\n';
            else cout << DQ.back() << '\n';
        }
        else if (s == "size"){
            cout << DQ.size() << '\n';
        }
        else if (s == "empty"){
            if(DQ.empty()) cout << 1 << '\n';
            else cout << 0 << '\n';
        }
        else if (s == "pop_front"){
            if(DQ.empty()) cout << -1 << '\n';
            else{
                cout << DQ.front() << '\n';
                DQ.pop_front();
            } 
        }
        else if (s == "pop_back"){
            if(DQ.empty()) cout << -1 << '\n';
            else{
            cout << DQ.back() << '\n';
            DQ.pop_back();
            }
        }
    }
}