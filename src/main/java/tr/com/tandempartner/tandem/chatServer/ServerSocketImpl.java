package tr.com.tandempartner.tandem.chatServer;


public class ServerSocketImpl implements Runnable {

	private final static int PORT = 9090;

	@Override
	public void run() {
		startServer();

	}

	private void startServer() {
		try {
			
			ChatServer ch = new ChatServer(this.PORT);
			ch.execute();

		} catch(Exception e){
			e.printStackTrace();
		}

	}

}
