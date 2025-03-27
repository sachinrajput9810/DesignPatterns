package Observer_DP_WeatherStation;
public class currentDisplay implements observer,displayElement{

    private float temp ;
    private float humidity ;
    private float pressure ;
    private WeatherData weatherData ;

    public currentDisplay(WeatherData weatherData){
        this.weatherData = weatherData ;
        weatherData.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.println("current condition :: temp" + temp + " humidity " + humidity );
    }

    @Override
    public void update() {
        this.temp = weatherData.getTemp() ;
        this.humidity = weatherData.getHumidity() ;
        display(); 
    }
    
}
