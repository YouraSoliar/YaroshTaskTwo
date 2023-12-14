package com.yarosh.task.yaroshtasktwo.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Entity
@Table(name = "university")
public class University {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "name")
    private String name;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "university")
    @JsonIgnore
    private List<Student> students;

    public University() {
    }

    public University(String name) {
        this.name = name;
    }

    public void addStudentToUniversity(Student student) {
        if (students == null) {
            students = new ArrayList<>();
        }
        students.add(student);
        student.setUniversity(this);
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
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
        final University other = (University) object;
        if (this.id == null || this.name == null || this.students == null) {
            if (other.id != null || other.name != null || other.students != null) {
                return false;
            }
        } else if (!this.id.equals(other.id) ||
                !this.name.equals(other.name) ||
                !this.students.equals(other.students)) {
            return false;
        }

        return true;
    }

    @Override
    public String toString() {
        return "University{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, students);
    }
}
