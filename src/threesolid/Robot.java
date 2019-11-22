package threesolid;

/**
 * S - A Robot does work. It does not query the database, for example.
 * O - This class can be extended by allowing the implementation of other relevant interfaces.
 * I - A robot does not need to eat, so it only implements IWorkeable.
 *
 * Damen
 *
 * Ky_Le added implemanation "IMaintainable" class interface and its methods.
 * adding some output to make sure class Robot working properly.
 */

class Robot implements IWorkable, IMaintainable {
    public void work() {
        System.out.println("I am a robot, i will only work, no lunch and break for me");
    }

    public void processMaintainWeekly(){
      System.out.println("I am a robot, i will need maintaince weekly");
    }

    public void processMaintainMonthly(){
      System.out.println("I am a robot, i will need maintaince monthly");
    }

    public void processMaintainYearly(){
      System.out.println("I am a robot, i will need maintaince yearly");
    }
}
