public class MallardDuck extends Duck {

    public MallardDuck(){
        quackBehaviour = new Quack() ;
        flyBehaviour = new FlywithWings() ;
    }

    


    @Override
    public void display() {
        System.out.println("I am a Mallard Duck");
    }

    
}
