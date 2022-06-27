import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TestConnection {
    public static void main(final String[] args) throws SQLException {
        final Connection connection = DriverManager.getConnection("jdbc:mariadb://xxx");

        final DatabaseMetaData meta = connection.getMetaData();

        System.out.println(meta.getDatabaseProductName());

        System.out.println("hier");
    }
}
