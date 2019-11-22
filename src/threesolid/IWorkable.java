package threesolid;

/**
 * S - Has the single responsibilty of requiring workable clients to implement a work method.
 * O - By using an interface something can work, but it can also be extended to do more things.
 * I - Something that works doesn't necessarily need to eat.
 *
 * Damen
 */
interface IWorkable
{
    public void work();
}
