import java.rmi.*;
import java.rmi.server.*;

public class MyRemoteServer {
	public static void main(String[] args) {
		try {
			MyRemote service = new MyRemoteImpl();
			Naming.rebind("rmi://localhost:5000/hello", service);
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}