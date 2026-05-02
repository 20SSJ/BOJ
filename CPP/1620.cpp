#include <iostream>
#include <unordered_map>
#include <string>
using namespace std;

int m, n;
string p, in;
unordered_map<string, int> um;
string book[100001];
int main(){
    cin.tie(0); cout.tie(0);
    ios_base::sync_with_stdio(0);
    cin >> m >> n;
    for (int i = 1; i < m+1; i++){
        cin >> p;
        um[p] = i;
        book[i] = p;
    }
    while(n--){
        cin >> in;
        if (isdigit(in[0])) cout << book[stoi(in)] << '\n';
        else cout << um[in] << '\n';
    }
    return 0;
}