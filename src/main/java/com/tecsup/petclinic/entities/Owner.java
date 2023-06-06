package com.tecsup.petclinic.entities;

import lombok.Data;

import javax.persistence.*;

/**
 *
 * @author Jacko_Tinoco
 */

@Entity(name = "owners")
@Data
public class Owner {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(columnDefinition = "varchar(30)")
    private String first_name;

    @Column(columnDefinition = "varchar(30)")
    private String last_name;

    @Column(columnDefinition = "varchar(255)")
    private String address;

    @Column(columnDefinition = "varchar(80)")
    private String city;

    @Column(columnDefinition = "varchar(20)")
    private String telephone;

    public Owner() {
    }

    public Owner(Integer id, String first_name, String last_name, String adress, String city, String telephone) {
        this.id = id;
        this.first_name = first_name;
        this.last_name = last_name;
        this.address = adress;
        this.city = city;
        this.telephone = telephone;
    }

    public Owner(String first_name, String last_name, String adress, String city, String telephone) {
        this.first_name = first_name;
        this.last_name = last_name;
        this.address = adress;
        this.city = city;
        this.telephone = telephone;
    }
}
