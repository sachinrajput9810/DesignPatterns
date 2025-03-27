public abstract class Duck{
    QuackBehaviour quackBehaviour ;
    FlyBehaviour flyBehaviour ;

    public Duck() {} 

    
    public void performQuack(){
        quackBehaviour.quack();
    }

    public void performFly(){
        flyBehaviour.fly();
    }

    public void swim(){
        System.out.println("All ducks can swim");
    } 

    public abstract void display() ;

}