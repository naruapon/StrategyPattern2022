
public class RedHeadDuck extends Duck {

	public RedHeadDuck() {
		quackBehavior = new Quack();
		flyBehavior = new FlyWithWings();
	}
	
	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("I'm a RedHead Duck");
	}

}
