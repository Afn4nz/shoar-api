package com.example.shoarapi.consultant.entity;

import com.example.shoarapi.category.entity.Category;
import lombok.Data;
import javax.persistence.*;

@Data
@Entity
@Table(name = "consultant")
public class Consultant {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column
    private String name;
    @ManyToOne
    @JoinColumn(name = "category_id", nullable = false)
    private Category category;
    @Column
    private String position;
    @Column
    private String thumbnail;
}
