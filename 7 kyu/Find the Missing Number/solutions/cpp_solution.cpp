#include <vector>
using namespace std;

int missingNo(vector<int> arr) {
    for(int i = 0; i <= arr.size(); i++) {
        if (!(std::find(arr.begin(), arr.end(), i) != arr.end())) return i;
    }
    return 0;
}