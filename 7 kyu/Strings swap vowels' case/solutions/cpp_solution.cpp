#include <bits/stdc++.h>

using namespace std;

string swap_vowel_case(string s) {
    vector<string> vec;
    vec.push_back("a"); vec.push_back("e"); vec.push_back("o"); vec.push_back("u"); vec.push_back("i");

    for(int i = 0; i < vec.size(); i++ ) {
        string upper = vec.at(i);
        string lower = vec.at(i);
        transform(upper.begin(), upper.end(), upper.begin(), ::toupper);
        transform(lower.begin(), lower.end(), lower.begin(), ::tolower);

        s = regex_replace(s, regex(lower), "poo");
        s = regex_replace(s, regex(upper), lower);
        s = regex_replace(s, regex("poo"), upper );
    }
    return s;
}