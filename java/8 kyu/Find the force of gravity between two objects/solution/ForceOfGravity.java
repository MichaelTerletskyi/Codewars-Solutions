public class ForceOfGravity {
    public static double solution(double[] arrVal, String[] arrUnit) {
        double m1 = arrVal[0] * convertUnitMass(arrUnit[0]);
        double m2 = arrVal[1] * convertUnitMass(arrUnit[1]);
        return 6.67D * Math.pow(10, -11) * m1 * m2 / (Math.pow(arrVal[2] * convertUnitDistance(arrUnit[2]), 2));
    }

    public static double convertUnitMass(String unitMass) {
        return unitMass.equals("g") ? 1e-3 : unitMass.equals("mg") ? 1e-6 :
                unitMass.equals("μg") ? 1e-9 : unitMass.equals("lb") ? 0.453592D : 1D;
    }

    public static double convertUnitDistance(String distanceMass) {
        return distanceMass.equals("cm") ? 1e-2 : distanceMass.equals("mm") ? 1e-3 :
                distanceMass.equals("μm") ? 1e-6 : distanceMass.equals("ft") ? 0.3048D : 1D;
    }
}