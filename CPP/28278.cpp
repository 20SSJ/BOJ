#include <iostream>
#include <stack>
using namespace std;

stack<int> st;
int n, c, e;
int main(){
    cin.tie(0); cout.tie(0);
    ios_base::sync_with_stdio(0);
    cin >> n;
    while(n--){
        cin >> c;
        if (c == 1){
            cin >> e;
            st.push(e);
        }
        else if (c == 2){
            if(!st.empty()){
                cout << st.top() << '\n';
                st.pop();
            }
            else cout << -1 << '\n';
        }
        else if (c == 3){
            cout << st.size() << '\n';
        }
        else if (c == 4){
            if(st.empty()) cout << 1 << '\n';
            else cout << 0 << '\n';
        }
        else{
            if(st.empty()) cout << -1 << '\n';
            else{
                cout << st.top() << '\n';
            }
        }
    }
    return 0;
}