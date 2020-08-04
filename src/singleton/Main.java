package singleton;

public class Main {
    public static void main(String[] args) {
        Connection connection = Connection.getInstance();
        Connection connection2 = Connection.getInstance();
        Connection connection3 = Connection.getInstance();

      //  Connection connection4 = new Connection(); khong goi duoc (trick)
    }
}
