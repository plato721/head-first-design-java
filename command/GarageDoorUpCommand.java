package headFirst.command;

public class GarageDoorUpCommand implements Command {
  GarageDoor garageDoor;

  public GarageDoorUpCommand(GarageDoor garageDoor) {
    this.garageDoor = garageDoor;
  }

  public void execute() {
    garageDoor.up();
  }
}
