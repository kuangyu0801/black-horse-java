import java.rmi.*;
import java.rmi.server.*;

public class MyRemoteImpl extends UnicastRemoteObject implements MyRemote {

	@Override
	public String sayHello() {
		return "Server says, 'Hey'";
	}
	
	@Override
	public int add(int a, int b) {
		return a + b;
	}

	public MyRemoteImpl() throws RemoteException {}

	public static void main(String[] args) {
		try {
			MyRemote service = new MyRemoteImpl();
			Naming.rebind("rmi://localhost:5000/hello", service);
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}