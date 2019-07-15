package com.test.demo.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.time.LocalDateTime;

@NoArgsConstructor
@AllArgsConstructor
@Setter @Getter
@Entity @Table(name = "orders")
public class BaseDate extends BaseIdentification {

    @LastModifiedDate @Column(name = "updated_date")
    private LocalDateTime updatedOn;

    @CreatedDate @Column(name = "created_date", updatable = false, nullable = false)
    private LocalDateTime createdOn;
}
