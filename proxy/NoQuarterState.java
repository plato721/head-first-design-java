package headFirst.proxy;

public class NoQuarterState implements GumballState {
  private static final long serialVersionUID = 2L;
  transient GumballMachine gumballMachine;

  public NoQuarterState(GumballMachine g) {
    gumballMachine = g;
  }

  public void turnCrank() {
    System.out.println("Must insert a quarter first");
  }

  public void ejectQuarter() {
    System.out.println("Nothing to eject");
  }

  public void insertQuarter() {
    System.out.println("You inserted a quarter");
    gumballMachine.setState(gumballMachine.getHasQuarterState());
  }

  public void dispense() {
    System.out.println("You need to pay first");
  }

  public void refill() {
    System.out.println("Gumballs filled! Current count is: " + gumballMachine.getCount());
  }

  public String toString() {
    return "Machine is waiting for a quarter";
  }
}
