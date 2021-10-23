#include <string>
#include <regex>

using namespace std;

bool is_uppercase(string s)
{
    int previous = s.length();
    regex reg("[abcdefghijklmnopqrstuvwxyz]+");
    s = regex_replace(s, reg, "");
    return previous == s.length();
}