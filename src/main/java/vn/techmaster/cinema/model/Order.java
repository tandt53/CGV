package vn.techmaster.cinema.model;

import java.sql.Timestamp;
import java.util.Collection;
import java.util.List;

public class Order {
    private Long id;
    private Customer customer;
    private Collection<OrderLine> orderLines;
    private Timestamp createdAt;
    private Timestamp modifiedAt;
    private float totalPrice;
    private int status;
}
