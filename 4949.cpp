#include <iostream>
#include <stack>
#include <string>
using namespace std;

int main(){
    cin.tie(0);
    ios_base::sync_with_stdio(0);
    string s;
    while(getline(cin, s)){
        if (s == ".") break;
        stack <char> st;
        for(char c : s){
            if (c == '{' || c == '[' || c == '(') st.push(c);
            else if (c == '}'){
                if (st.empty() || st.top() != '{'){
                     cout << "no\n";
                    break;
                }
                else st.pop();
            } 
            else if (c == ']'){
                if (st.empty() || st.top() != '['){
                     cout << "no\n";
                    break;
                }
                else st.pop();
            } 
            else if (c == ')'){
                if (st.empty() || st.top() != '('){
                    cout << "no\n";
                    break;
                }
                else st.pop();
            }
            else if (c == '.'){
                if (st.empty()) cout << "yes\n";
                else cout << "no\n";
                break;
            }
        }
    }
    return 0;
}