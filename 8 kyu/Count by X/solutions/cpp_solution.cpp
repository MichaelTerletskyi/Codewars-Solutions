#include <vector>

using namespace std;

vector<int> countBy(int x,int n){
    vector<int> vec;
    for(int i = x; i <= x * n; i += x) {
        vec.push_back(i);
    }
    return vec;
}