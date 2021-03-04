package us.nm.state.hsd;

public class TemperatureConverter {

    private static final double CELSIUS_KELVIN_OFFSET = 273.15;
    private static final double CELSIUS_FAHRENHEIT_SCALE = 9d / 5;
    private static final double CELSIUS_FAHRENHEIT_OFFSET = 32;

    public static double celsiusToFahrenheit(double celsius) {
	return celsius * CELSIUS_FAHRENHEIT_SCALE + CELSIUS_FAHRENHEIT_OFFSET;
    }

    public static double celsiusToKelvin(double celsius) {
	return celsius + CELSIUS_KELVIN_OFFSET;
    }

    public static double kelvinToFahrenheit(double kelvin) {
	return celsiusToFahrenheit(kelvinToCelsius(kelvin));
    }

    public static double kelvinToCelsius(double kelvin) {
	return kelvin - CELSIUS_KELVIN_OFFSET;
    }

    public static double fahrenheitToCelsius(double fahrenheit) {
	return (fahrenheit - CELSIUS_FAHRENHEIT_OFFSET) / CELSIUS_FAHRENHEIT_SCALE;
    }

    public static double fahrenheitToKelvin(double fahrenheit) {
	return celsiusToKelvin(fahrenheitToCelsius(fahrenheit));
    }
    
}
