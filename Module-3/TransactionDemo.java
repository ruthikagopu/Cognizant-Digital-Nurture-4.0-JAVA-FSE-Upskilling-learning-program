import java.sql.*;

public class TransactionDemo {
    public static void transferMoney(Connection conn, int fromAcc, int toAcc, double amount) throws SQLException {
        try {
            conn.setAutoCommit(false);

            String debitSQL = "UPDATE accounts SET balance = balance - ? WHERE id = ?";
            String creditSQL = "UPDATE accounts SET balance = balance + ? WHERE id = ?";

            try (PreparedStatement debitStmt = conn.prepareStatement(debitSQL);
                 PreparedStatement creditStmt = conn.prepareStatement(creditSQL)) {

                debitStmt.setDouble(1, amount);
                debitStmt.setInt(2, fromAcc);
                debitStmt.executeUpdate();

                creditStmt.setDouble(1, amount);
                creditStmt.setInt(2, toAcc);
                creditStmt.executeUpdate();

                conn.commit();
                System.out.println("Transfer successful.");
            }
        } catch (SQLException e) {
            conn.rollback();
            System.out.println("Transfer failed, rolled back.");
            e.printStackTrace();
        } finally {
            conn.setAutoCommit(true);
        }
    }

    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/testdb";
        String user = "root";
        String password = "your_password";

        try (Connection conn = DriverManager.getConnection(url, user, password)) {
            transferMoney(conn, 1, 2, 500.00);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
