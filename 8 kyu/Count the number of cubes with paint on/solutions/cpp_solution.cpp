int countSquares(int d)
{
    // My Solution
    return d == 0 ? 1 : ((d + 1) * (d+ 1) * (d + 1)) - (((d + 1) - 2) * ((d + 1) - 2) * ((d + 1) - 2));

    // Best Solution at my opinion
    // return d == 0 ? 1 : 2 * (3 * d * d + 1);
}