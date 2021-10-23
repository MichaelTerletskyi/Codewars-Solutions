#include <vector>

using namespace std;

vector<int> arr() {
     vector<int> vec;
     return vec;
}

vector<int> arr(int n) {
     vector<int> vec;
     for(int i = 0; i < n; i++) {
         vec.push_back(i);
     }
     return vec;
}