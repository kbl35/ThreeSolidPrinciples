package threesolid;

/*
* Jacob M. Hope
*
*
* S - Manager has the sinle responsibility of making a worker (IWorkable)
			object work by calling a workers work method.

* O - This class is open for additional extension (E.g., could make
			human and robot managers) and is closed to modification since it
			has the essential base functionality any manager type should have.

* I - Manager is a base class and does not have to worry about
			breaking the interface segregation principle by being forced to
			implement a method it doesn't use, since it does not implement an
			interface.
*
*
*/

class Manager {
	IWorkable worker;

	public Manager() {

	}

	// Sets a worker to directly manage
	public void setWorker(IWorkable w) {
		worker=w;
	}

	// Makes a worker work
	public void manage() {
		worker.work();
	}
}
