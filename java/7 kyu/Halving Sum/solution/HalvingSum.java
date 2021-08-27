public class HalvingSum {

//    My Loop base Solution
//    int halvingSum(int n) {
//        int temp = n;
//        int sum = temp;
//        while (temp > 0) {
//            temp = temp / 2;
//            sum += temp;
//        }
//        return sum;
//    }

    // My Solution by recursion
    int halvingSum(int n) {
        return n != 0 ? n + halvingSum(n / 2) : 0;
    }


//    Best Solution
//    int halvingSum(int n) {
//        return java.util.stream.IntStream.iterate(n, x -> x != 0, x -> x / 2).sum();
//    }
}