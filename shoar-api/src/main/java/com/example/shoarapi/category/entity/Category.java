package com.example.shoarapi.category.entity;

import lombok.Data;
import javax.persistence.*;

@Data
@Entity
@Table(name = "category")
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column
    private String nameAr;
    @Column
    private String nameEn;
    @Column
    private String thumbnail;
}
