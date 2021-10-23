namespace Triangle
{
  bool isTriangle(long a, long b, int c)
  {
    return (a < 1 || b < 1 || c < 1) ? false : !(a >= (b + c) || b >= (a + c) || c >= (b + a));
  }
};