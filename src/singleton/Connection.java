package singleton;

public class Connection {
    private static Connection _instance;

    private Connection() {

    }

    public synchronized static Connection getInstance() {
        if (_instance == null) {
            _instance = new Connection();
        }
        return _instance;
    }
}
