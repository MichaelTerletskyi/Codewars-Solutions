public class AgeDiff {
    public static String CalculateAge(int birth, int yearTo) {
        return birth == yearTo ? "You were born this very year!" : birth < yearTo ?
                String.format("You are %s year%s old.", yearTo - birth, (yearTo - birth == 1 ? "" : "s")) :
                String.format("You will be born in %s year%s.", Math.abs(yearTo - birth), (Math.abs(yearTo - birth) == 1 ? "" : "s"));
    }
}