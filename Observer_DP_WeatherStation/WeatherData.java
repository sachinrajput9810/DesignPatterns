package Observer_DP_WeatherStation;
import java.util.ArrayList;
import java.util.List;

public class WeatherData implements subject {

    private float temp ;
    private float humidity ;
    private float pressure ;
    List<observer> obsList ;

    public WeatherData(){
        obsList = new ArrayList<>() ;
    }

    public float getTemp(){
        return temp ;
    }
    public float getPressure(){
        return pressure ;
    }
    public float getHumidity(){
        return humidity ;
    }

    @Override
    public void registerObserver(observer o) {
        obsList.add(o) ;
    }

    @Override
    public void removerObserver(observer o) {
        obsList.remove(o) ;       
    }

    @Override
    public void notifyObserver() {
        for(observer obs : obsList){
            obs.update();
        }
    }

    public void setMeasurements(float temp , float humidity , float pressure){
        this.temp = temp ; 
        this.humidity = humidity ;
        this.pressure = pressure ;
        notifyObserver();
    }
    
}
