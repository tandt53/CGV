package cgv.demo.model;
import cgv.demo.model.Customer;
import cgv.demo.model.OrderLine;

import java.sql.Timestamp;
import java.util.Collection;

public class Order {
    private Long id;
    private Customer customer;
    private Collection<OrderLine> orderLines;
    private Timestamp createdAt;
    private Timestamp modifiedAt;
    private float totalPrice;
    private int status;
}
