package com.example.product_service.entity;

import com.example.product_service.entity.templates.AbsEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.SQLDelete;
import org.hibernate.annotations.SQLRestriction;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@SQLRestriction(value = "is_deleted=false")
@SQLDelete(sql = "update categories set is_deleted=true where id = ?")
public class Category extends AbsEntity {

    @Column(nullable = false, unique = true)
    private String name;

}
