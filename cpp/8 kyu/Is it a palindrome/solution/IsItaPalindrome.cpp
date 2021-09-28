#include <string>

using namespace std;

bool isPalindrom (const string str) {
    for(int i = 0; i < (str.length() / 2); i ++) {
        if(tolower(str[i]) != tolower(str[str.length() - i - 1])) {
            return false;
        }
    }
    return true;
}