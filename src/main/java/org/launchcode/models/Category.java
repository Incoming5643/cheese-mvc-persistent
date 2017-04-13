package org.launchcode.models;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by student on 4/10/2017.
 */

@Entity
public class Category {
    @Id
    @GeneratedValue
    private int id;

    @NotNull
    @Size(min=3, max=15)
    private String name;

    @OneToMany
    @JoinColumn(name = "category_id")
    private List<Cheese> cheeses = new ArrayList<>();

    public String getName() { return name; }

    public void setName(String name) { this.name = name; }

    public int getId() { return id; }

    public Category() { }

}
