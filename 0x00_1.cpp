#include <iostream>

using namespace std;

int func1(int N){
    int sum = 0;
    for (int i = 1; i <= N; i++){
        if (i % 3 == 0 || i % 5 ==0 ) sum += i; 
    }
    return sum;
}

int func2(int arr[], int n){
    int hap = 0;
    for (int i = 0; i< n; i++){
        for (int j = i + 1; j < n; j++) 
            if (arr[i] + arr[j] == 100) return 1;
    }
    return 0;
}

int func3(int N){
    for (int i = 0; i<N; i++)
        if (i * i == N) return 1;
    return 0;
}

int func4(int N){
    int expo = 1;
    while (2*expo <= N) expo *= 2;
    return expo;
}

int main(){
    int N;
    cin >> N;
    cout << func1(N) << endl;
    int arr[] = {4, 13, 63, 87};
    int size = sizeof(arr) / sizeof(*arr);
    cout << func2(arr, size) << "\n" << func3(N) << "\n" << func4(N);
    return 0;
}