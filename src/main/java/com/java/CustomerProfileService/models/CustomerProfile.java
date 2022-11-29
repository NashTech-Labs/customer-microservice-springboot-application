package com.java.CustomerProfileService.models;
import javax.persistence.*;

/**
 * The type Customer profile.
 */
@Entity
public class CustomerProfile {
    @Id
    @Column(name = "id", nullable=false)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @Column(name = "name")
    private String name;
    @Column(name = "gender")
    private String gender;
    @Column(name = "age")
    private int age;
    @Column(name = "address")
    private String address;


    /**
     * Instantiates a new Customer profile.
     *
     * @param name    the name
     * @param gender  the gender
     * @param age     the age
     * @param address the address
     */
    public CustomerProfile(String name, String gender, int age, String address) {
        this.name = name;
        this.gender= gender;
        this.age = age;
        this.address = address;


    }

    /**
     * Instantiates a new Customer profile.
     */
    public CustomerProfile() {
    }

    /**
     * Gets id.
     *
     * @return the id
     */
    public Long getId() {
        return id;
    }

    /**
     * Gets name.
     *
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * Sets name.
     *
     * @param name the name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Gets gender.
     *
     * @return the gender
     */
    public String getGender() {
        return gender;
    }

    /**
     * Sets gender.
     *
     * @param gender the gender
     */
    public void setGender(String gender) {
        this.gender = gender;
    }

    /**
     * Gets age.
     *
     * @return the age
     */
    public int getAge() {
        return age;
    }

    /**
     * Sets age.
     *
     * @param age the age
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * Gets address.
     *
     * @return the address
     */
    public String getAddress() {
        return address;
    }

    /**
     * Sets address.
     *
     * @param address the address
     */
    public void setAddress(String address) {
        this.address = address;
    }

}
