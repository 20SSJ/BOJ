#include <iostream>
#include <vector>
using namespace std;

int main(){
    cin.tie(0);
    ios_base::sync_with_stdio(0);
    int N, t;
    cin >> N;
    vector<int> v;
    for(int i = 0; i < N; i++){
        cin >> t;
        v.push_back(t);
    }
    for (int i = 0; i < N; i++){
        int min = v[i];
        for (int j = i + 1; j < N; j++){
            if (min > v[j]){
                min = v[j];
                v[j] = v[i];
                v[i] = min;
            }
        }
    }
    for (int i = 0; i < N; i++){
        cout << v[i] << "\n";
    }
    return 0;
}