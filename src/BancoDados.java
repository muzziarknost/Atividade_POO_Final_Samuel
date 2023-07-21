import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class BancoDados {
    private static final String URL = "jdbc:mysql://localhost:3306/atvpoosamuel";
    private static final String USUARIO = "testing_acc";
    private static final String SENHA = "B^%xp9t4S2L5@G";

    public static Connection conectar() throws SQLException {
        return DriverManager.getConnection(URL, USUARIO, SENHA);
    }
}
