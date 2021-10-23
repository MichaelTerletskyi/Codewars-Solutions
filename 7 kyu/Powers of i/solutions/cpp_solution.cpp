using namespace std;

// Solution without math formula be like
string pofi(int n) {
    int t = 0;
    for(int i = 1; i <= n; i++) {
        if(t == 3)  t = 0;
        else {
            if(i > 0) ++t;
        }
    }
    return t == 0 ? "1" : t == 1 ? "i" : t == 2 ? "-1" : "-i";
}

//Sexy solution
//#include <string>
//
//std::string pofi(unsigned n) {
//  return (std::string[]){"1", "i", "-1", "-i"}[n % 4];
//}