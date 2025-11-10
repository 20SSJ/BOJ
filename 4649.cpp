#include <iostream>
#include <stack>
using namespace std;

int main(void){
    char s;
    stack <char> st;
    while(true){
        cin >> s;
        if (s == '[' || s == '{' || s == '('){
            st.push(s);
        }
        if (s == ']'){
            if (st.top() != '['){
                cout << "no\n";
                break;
            }
            else st.pop();
        }
        if (s == '}'){
            if (st.top() != '{'){
                cout << "no\n";
                break;
            }
            else st.pop();
        }
        if (s == ')'){
            if (st.top() != '('){
                cout << "no\n";
                break;
            }
            else st.pop();
        }
        if (st.empty() && s == '.'){
            if (st.empty()) {
                cout << "yes\n";
                break;
            }
            else{
                cout << "no\n";
                break;
            } 
        }
    }
}