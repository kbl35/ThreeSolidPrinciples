package threesolid;
/*
*
* S - only responsible for whatever applied for an EQM Worker.
* O - This class can be extended by allowing the implementation of other relevant interfaces.
* I - this class implements IWorkable amd IMaintainable with different functionalities.
*
*Ky_Le
*
*/

class EQMWorker implements IFeedable, IWorkable, IMaintainable {
    public void work(){
      System.out.println("I am an EQM worker, I will fix the robots.");
      }

    public void eat(){
      System.out.println("I am an EQM worker, I need time for lunch.");
    }

    public void processMaintainWeekly(){
      System.out.println("I am an EQM, i will perform maintaince for the Robots weekly");
    }

    public void processMaintainMonthly(){
      System.out.println("I am an EQM, i will perform maintaince for the Robots monthly");
    }

    public void processMaintainYearly(){
      System.out.println("I am an EQM, i will perform maintaince for the Robots weekly");
    }
}
