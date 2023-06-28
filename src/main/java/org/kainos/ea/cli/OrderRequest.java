package org.kainos.ea.cli;

import java.sql.Date;

public class OrderRequest {
    private int CustomerId;
    private Date OrderDate;

    public int getCustomerId() {
        return CustomerId;
    }

    public void setCustomerId(int customerId) {
        CustomerId = customerId;
    }

    public Date getOrderDate() {
        return OrderDate;
    }

    public void setOrderDate(Date orderDate) {
        OrderDate = orderDate;
    }
}
