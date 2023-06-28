package org.kainos.ea.db;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class CustomerDao {

    private DatabaseConnector databaseConnector = new DatabaseConnector();

    // Returns a list of existing CustomerIDs.
    public List<Integer> getAllCustomerIds() throws SQLException {
        Connection c = databaseConnector.getConnection();
        Statement st = c.createStatement();

        ResultSet rs = st.executeQuery("SELECT CustomerId FROM Customer;");

        List<Integer> customerIdList = new ArrayList<>();

        while (rs.next()) {
            customerIdList.add(rs.getInt("CustomerID"));
        }
        return customerIdList;
    }

}
