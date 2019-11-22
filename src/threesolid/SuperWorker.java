package threesolid;

import java.io.*;
import java.awt.*;
import java.awt.event.*;

/**
 * S - A SuperWorker does quick work and eats fast.
 * O - SuperWorker can be extended.
 * I - A SuperWorker eats and works, implementing IWorkable and IFeedable.
 * Jonathan Joiner
 *
 */

class SuperWorker implements IWorkable, IFeedable{
	public void work() {
		System.out.println(" Super Workers complete work exponentially faster");
	}

	public void eat() {
		System.out.println(" Super Workers consume 4X the food, 4X faster");
	}
}

