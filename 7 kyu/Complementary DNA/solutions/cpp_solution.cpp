#include <string>

using namespace std;

string DNAStrand(string dna) {
    replace(dna.begin(), dna.end(), 'A', '@');
    replace(dna.begin(), dna.end(), 'T', '!');
    replace(dna.begin(), dna.end(), '@', 'T');
    replace(dna.begin(), dna.end(), '!', 'A');
    replace(dna.begin(), dna.end(), 'G', '#');
    replace(dna.begin(), dna.end(), 'C', '%');
    replace(dna.begin(), dna.end(), '#', 'C');
    replace(dna.begin(), dna.end(), '%', 'G');
    return dna;
}