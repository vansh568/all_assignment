public class element7 {
    public static void main(String[] args) {
        double radiusKm = 6371; // radius in kilometers
        double radiusMiles = radiusKm * 0.621371; // convert radius to miles

        // Volume formula for a sphere: V = 4/3 * π * r^3
        double volumeKm3 = (4.0 / 3) * Math.PI * Math.pow(radiusKm, 3);
        double volumeMiles3 = (4.0 / 3) * Math.PI * Math.pow(radiusMiles, 3);

        System.out.println("Volume of Earth in km³: " + volumeKm3);
        System.out.println("Volume of Earth in miles³: " + volumeMiles3);
    }
}
