package com.yarosh.task.yaroshtasktwo.entity;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
@Table(name = "student")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "university_id")
    private University university;

    public Student() {
    }

    public Student(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public University getUniversity() {
        return university;
    }

    public void setUniversity(University university) {
        this.university = university;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return "Id - " + this.id
                +", Student first name - " + this.firstName
                + ", last name -" + this.lastName;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object == null) {
            return false;
        }
        if (getClass() != object.getClass()) {
            return false;
        }
        final Student other = (Student) object;
        if (this.id == null || this.firstName == null || this.lastName == null || this.university == null) {
            if ((this.id != null) || (other.firstName != null) || (other.lastName != null) || (other.university != null)) {
                return false;
            }
        } else if (!this.id.equals(other.id)
                || !this.firstName.equals(other.firstName)
                || !this.lastName.equals(other.lastName)
                || !this.university.equals(other.university)) {
            return false;
        }

        return true;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, university, firstName, lastName);
    }
}
