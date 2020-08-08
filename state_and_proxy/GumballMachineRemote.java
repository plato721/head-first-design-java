package headFirst.state;

import java.rmi.*;

public interface GumballMachineRemote extends Remote {
  public int getCount() throws RemoteException;
  public String getLocation() throws RemoteException;
  public GumballState getCurrentState() throws RemoteException;
}