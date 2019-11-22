package threesolid;

import java.io.*;
import java.awt.*;
import java.awt.event.*;

/**
 * S - A human worker can work and eat.
 * O - Can be extended with more interfaces.
 * I - A HumanWorker can eat and work by implementing the IFeedable and IWorkable interface.
 * Austin Gray
 */
class HumanWorker implements IFeedable, IWorkable {
    public void eat() {
        System.out.println(" Human workers will need time to eat");
    }

    public void work() {
        System.out.println(" human worker will do some serious works");
    }
}
