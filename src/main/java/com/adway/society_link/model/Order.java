package com.adway.society_link.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.time.LocalDate;

@Entity
@Table(name = "society_order")
public class Order {
    @Id
    @GeneratedValue
    private Integer id;
    private String name;
    private String description;
    private String imageName;
    private String imageType;
    private byte[] imageDate;
    private LocalDate date;
    private enum status{Pending, Incomplete,Complete,Under_Process};
}
