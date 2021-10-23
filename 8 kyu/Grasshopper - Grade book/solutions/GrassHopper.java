public class GrassHopper {
    public static char getGrade(int s1, int s2, int s3) {
        int avg = Math.round(s1 + s2 + s3) / 3;
        return avg >= 90 ? 'A' : avg >= 80 ? 'B' : avg >= 70 ? 'C' : avg >= 60 ? 'D' : 'F';
    }
}