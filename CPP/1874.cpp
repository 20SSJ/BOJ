#include <iostream>
#include <stack>
#include <vector>
using namespace std;

bool bflag = true;
int n, o;
stack<int> st;
vector<char> v;
int main(){
    cin.tie(0); cout.tie(0);
    ios_base::sync_with_stdio(0);
    int cnt = 1;
    cin >> n;
    while(n--){
        cin >> o;
        if (o >= cnt){
            while(cnt <= o){
                st.push(cnt);
                v.push_back('+');
                cnt++;
            }
            st.pop();
            v.push_back('-');
        }
        else{
            if(st.top() == o && !st.empty()){
                v.push_back('-');
                st.pop();
            }
            else{
                bflag = false;
                cout << "NO" << '\n';
                break;
            }
        }
    }
    if(bflag){
        for(int i = 0; i < v.size(); i++) cout << v[i] << '\n';
    }
    return 0;
}