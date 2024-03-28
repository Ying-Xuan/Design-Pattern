public abstract class Duck {

   // add two instance variables of type FlyBehavior and QuackBehavior
   FlyBehavior flyBehavior;
   QuackBehavior quackBehavior;

   public Duck() {
  
   }

   public abstract void display();
   
   public void setFlyBehavior(FlyBehavior fb) {
      flyBehavior = fb;
   } 
   public void performFly() {
      flyBehavior.fly();
   }

   public void setQuackBehavior(QuackBehavior qb) {
      quackBehavior = qb;
   }
   public void performQuack() {
      quackBehavior.quack();
   } 
   public void swim() {
      System.out.println("All ducks float, even decoys!");
   }
}