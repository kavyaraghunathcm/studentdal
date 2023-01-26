package com.kavya.studentdal.entity;


import javax.persistence.*;

@Entity
@Table(name = "studenttab")
public class Student {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "sname")
    private String name;

    @Column(name = "scourse")
    private String course;


    @Column(name = "sfee")
    private Double fee;



    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public Double getFees() {
        return fee;
    }

    public void setFees(Double fees) {
        this.fee = fees;
    }
}
