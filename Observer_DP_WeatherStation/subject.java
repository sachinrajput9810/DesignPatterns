package Observer_DP_WeatherStation;

public interface subject {
    public void registerObserver(observer o) ;
    public void removerObserver(observer o) ;
    public void notifyObserver() ; 
}
