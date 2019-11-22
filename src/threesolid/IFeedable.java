package threesolid;
/**
 * S - Has the single responsibilty of requiring IFeedable clients to implement a work method.
 * O - By using an interface, the program will be open for extending more functionalities which might be needed in future.
 * I - Robots don't eat, but they need something else like maintaince.
 *
 * Ky_Le
 */

interface IFeedable{
	public void eat();
}
