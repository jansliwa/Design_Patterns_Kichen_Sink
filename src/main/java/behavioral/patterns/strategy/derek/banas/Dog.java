package behavioral.patterns.strategy.derek.banas;

/**
 * Created by fun on 2015-10-14.
 */
public class Dog extends Animal{

    public void digHole(){

        System.out.println("Dug a hole");

    }

    public Dog(){

        super();

        setSound("Bark");

        // We set the Flys interface polymorphically
        // This sets the behavior as a non-flying Animal

        flyingType = new CantFly();

    }

	/* BAD
	* You could override the fly method, but we are breaking
	* the rule that we need to abstract what is different to
	* the subclasses
	*
	public void fly(){

		System.out.println("I can't fly");

	}
	*/

}
