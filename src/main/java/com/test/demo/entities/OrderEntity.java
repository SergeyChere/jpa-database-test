package com.test.demo.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.ColumnDefault;

import javax.persistence.*;

@NoArgsConstructor
@AllArgsConstructor
@Setter @Getter
@Entity @Table(name = "orders")
public class OrderEntity extends BaseDate {

    @Column(name = "ORDER_TRANSIT_STATUS")
    private Integer order_transit_status = 1;

    @Column(name = "ORDER_PAYMENT_STATUS")
    private Integer order_payment_status = 1;

    @Column(name = "ORDER_STATUS")
    private Integer order_status = 1;
}
