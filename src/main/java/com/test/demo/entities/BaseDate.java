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
@Entity @Table(name = "persons")
public class BaseDate extends BaseIdentification {

    @LastModifiedDate @CreatedDate @Column(name = "updated_date")
    private LocalDateTime updatedOn;

    @LastModifiedDate @CreatedDate @Column(name = "created_date")
    private LocalDateTime createdOn;
}