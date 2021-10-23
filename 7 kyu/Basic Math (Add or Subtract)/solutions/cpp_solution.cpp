#include <iostream>
#include <string>
#include <sstream>
#include <regex>
#include <vector>

using namespace std;

string calculate(string str) {
    static int res = 0;

    str = regex_replace(str, regex("plus"), " + ");
    str = regex_replace(str, regex("minus"), " - ");

    vector<string> result;
    stringstream data(str);
    string line;
    while(getline(data,line,' ')) {
        result.push_back(line);
    }

    for (size_t i = 1; i < result.size(); i++) {
        if((result.at(i).compare("+") > 0) && (result.at(i).compare("-") > 0)) {
            if(result.at(i - 1).compare("+") == 0) {
                int temp = stoi(result.at(i));
                res += temp;
            }
            if(result.at(i - 1).compare("-") == 0) {
                int temp = stoi(result.at(i));
                res -= temp;
            }
        }
        if(result.size() - i == 1) {
            string temp = to_string(res + stoi(result.at(0)));
            res = 0;
            return temp;
        }
    }
    return "AAA-AAAA! Why a you roning? Why are You Running?";
}