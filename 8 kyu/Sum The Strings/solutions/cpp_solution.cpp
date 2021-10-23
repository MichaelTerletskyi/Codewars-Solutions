#include <iostream>
#include <string>
#include <sstream>

using namespace std;

// My Solution
int parseInt(string s) {
    if(s.empty()) return 0;
    stringstream geek(s);
    int x = 0;
    geek >> x;
    return x;
}

string sum_str(string a, string b) {
    return to_string(parseInt(a) + parseInt(b));
}

//Best Solution
//std::string sum_str(const std::string& a, const std::string& b) {
//  return std::to_string(std::stoi(a == "" ? "0" : a) + std::stoi(b == "" ? "0" : b));
//}