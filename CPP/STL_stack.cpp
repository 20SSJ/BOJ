#include <iostream>
#include <stack>
using namespace std;

int main(void){
    stack<int> S;
    S.push(1);
    S.push(2);
    S.push(3);
    cout << S.size() << '\n'; // 3
    if(S.empty()) cout << S.empty() << '\n';
    else cout << 0 << '\n';
    S.pop(); // 3이 pop
    cout << S.top() << '\n'; // 2
    S.pop(); // 2가 팝
    cout << S.top() << '\n'; // 1
    S.pop(); // 1이 팝
    if(!S.empty()) cout << S.top() << '\n'; // 현재 비어있음
    else cout << -1 << '\n'; // -1
}