
public class ExerciseTemperature {
    public static void main(String[] args) {

        int temperatureCelsius = 36;
        System.out.println("Temperatura em graus celsius é: " + temperatureCelsius + "º");


        int temperatureFahrenheit = (int) (temperatureCelsius * 1.8) + 32;

        System.out.println("Fazendo a conversão de graus celsius para Fahrenheit é: " + temperatureFahrenheit+ "º");
    }
}
