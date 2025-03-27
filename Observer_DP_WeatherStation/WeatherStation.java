package Observer_DP_WeatherStation;
public class WeatherStation {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData() ;
        currentDisplay current = new currentDisplay(weatherData) ;
        weatherData.setMeasurements(12f , 20f , 30f) ;
    }
}
