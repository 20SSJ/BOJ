#include <iostream>
#include <string>
#include <vector>
using namespace std;

int main(){
    ios_base::sync_with_stdio(false);
    cin.tie(0);
    int N;
    string s1, s2;
    vector <string> v1;
    cin >> N;
    for (int i = 0; i < N; i++){
        cin >> s1 >> s2;
        v1.push_back(s1);
        for (auto c: s2){
            if (s1 != s2) cout << "Impossible" << '\n';
            else cout << "Possible" << '\n';
        }
        v1.clear();
    }
    return 0;
}