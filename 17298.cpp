#include <iostream>
#include <stack>
#include <vector>
using namespace std;

int A, n, mx, mx2;
stack<int> st;
stack<int> st2;
stack<int> st3;
int main(){
    cin.tie(0); cout.tie(0);
    ios_base::sync_with_stdio(0);
    cin >> A;
    for (int i = 0; i < A; i++){
        cin >> n;
        st.push(n);
    }
    while(!st.empty()){
        if(st2.empty()){
            st3.push(-1);
        }
        st2.push(st.top());
        st.pop();
        while(!st2.empty() && !st.empty()){
            if(st2.top() > st.top()){
                st3.push(st2.top());
                break;
            }
            st2.pop();
        }
    }
    while(!st3.empty()){
        cout << st3.top() << ' ';
        st3.pop();
    }
    return 0;
}