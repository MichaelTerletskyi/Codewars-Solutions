using System.Linq;
class AreTheySame
{
    public static bool comp(int[] a, int[] b)
    {
        return (a == null || b == null) 
            ? false 
            : a.Select(x => x * x).OrderBy(x => x).SequenceEqual(b.OrderBy(x => x));
    }
}