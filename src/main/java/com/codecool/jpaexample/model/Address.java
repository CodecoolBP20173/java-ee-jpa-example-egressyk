package com.codecool.jpaexample.model;

import javax.persistence.*;
import java.util.Random;


@Entity
public class Address {
    static private Random random = new Random();

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String country;

    @Column(name = "zip", length = 4)
    private String zipcode;
    private String city;
    private String addr;

    @OneToOne(mappedBy = "address")
    private Student student;

    public Address() {
    }

    public Address(String country, String zipcode, String city, String addr) {
        //this.id = random.nextInt(100) + 100;
        this.country = country;
        this.zipcode = zipcode;
        this.city = city;
        this.addr = addr;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getZipcode() {
        return zipcode;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    @Override
    public String toString() {
        return "Address{" +
                "id=" + id +
                ", country='" + country + '\'' +
                ", zipcode='" + zipcode + '\'' +
                ", city='" + city + '\'' +
                ", addr='" + addr + '\'' +
                ", student='" + student.getName() + '\'' +
                '}';
    }

}
