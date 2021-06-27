import java.rmi.*;

public class MyRemoteClient {
	public static void main(String[] args) {
		new MyRemoteClient().go();
	}

	public void go (){
		try {
			MyRemote service = (MyRemote) Naming.lookup("rmi://localhost:5000/hello");
			System.out.println(service.sayHello());
			System.out.println(service.add(1, 2));	
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}