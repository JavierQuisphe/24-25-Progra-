public class Main6 {
    public static void main(String[] args) {
        int edad = 17;
        String movieClassification = "RP18";
        boolean isWithAdult = true;

        boolean isRestricted = movieClassification.contains("RP");

        if(!isRestricted) {
            System.out.println("Puedes ver la pelicula");
        } else if (edad>17) {
            System.out.println("Puedes ver la pelicula igual");
        } else if (isWithAdult) {
            System.out.println("Viene con un adulto, puede ver la pelicula");
        } else {
            System.out.println("No puedes ver la pelicula");
        }
    }
}