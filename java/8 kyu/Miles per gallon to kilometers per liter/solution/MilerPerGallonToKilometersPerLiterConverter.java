public class MilerPerGallonToKilometersPerLiterConverter {
    public static float mpgToKPM(final float milesPerGallon) {
        return Float.parseFloat(String.format("%.2f", milesPerGallon * 1.609344F / 4.54609188F));
    }
}