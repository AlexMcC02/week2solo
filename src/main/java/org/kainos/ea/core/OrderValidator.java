package org.kainos.ea.core;

import org.kainos.ea.cli.OrderRequest;
import org.kainos.ea.db.CustomerDao;

import java.sql.SQLException;
import java.time.LocalDate;

public class OrderValidator {

    CustomerDao customerDao = new CustomerDao();
    LocalDate lastYear = LocalDate.now().minusYears(1);
    public String isValidOrder(OrderRequest order) throws SQLException {
        if (order.getCustomerId() < 1) {
            return "Customer IDs must be positive integers.";
        }
        if (!customerDao.getAllCustomerIds().contains(order.getCustomerId())) {
            return "Customer doesn't exist.";
        }
        if (order.getOrderDate().toLocalDate().isBefore(lastYear)) {
            return "Order is over one year old.";
        }
        return null;
    }
}
