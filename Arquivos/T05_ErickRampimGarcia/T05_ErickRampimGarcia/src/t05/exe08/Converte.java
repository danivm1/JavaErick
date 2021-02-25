package t05.exe08;

public class Converte {
    public static double farenheitToCelsius(double temp){
        return (temp-32)*5/9;
    }

    public static double farenheitToKelvin(double temp){
        return ((temp-32)*5/9)+273.15;
    }

    public static double kelvinToCelsius(double temp){
        return (temp-273.15);
    }

    public static double kelvinToFarenheit(double temp){
        return  ((9*(temp-273.15)/5)+32);
    }

    public static double celsiusToKelvin(double temp){
        return (temp+273.15);
    }

    public static double celsiusToFarenheit(double temp){
        return ((9*temp/5)+32);
    }
}
