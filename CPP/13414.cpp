#include <iostream>
#include <vector>
#include <unordered_map>
#include <algorithm>
using namespace std;

bool cmp(pair<string, int>&a, pair<string, int>&b){
    return a.second < b.second; 
} 

int k, l;
string number;
unordered_map<string, int> um;
int main(){
    cin >> k >> l;
    for (int i = 0; i < l; i++){
        cin >> number;
        um[number] = i;
    } 
    vector<pair<string, int>> v(um.begin(), um.end());
    sort(v.begin(), v.end(), cmp);
    for(int s = 0; s < min(k, (int)v.size()); s++) cout << v[s].first << '\n';
    return 0;
}