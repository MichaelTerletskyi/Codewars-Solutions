class Barycenter {
    public static double[] barTriang(double[] x, double[] y, double[] z) {

        // My Solution
        return new double[]{
                Double.parseDouble(new java.text.DecimalFormat("#.####").format((x[0] + y[0] + z[0]) / 3)),
                Double.parseDouble(new java.text.DecimalFormat("#.####").format((x[1] + y[1] + z[1]) / 3))};

//        Best Solution
//        return new double[]{((int) Math.round(((x[0] + y[0] + z[0]) / 3) * 10000)) / 10000.,
//                ((int) Math.round(((x[1] + y[1] + z[1]) / 3) * 10000)) / 10000.};
    }
}