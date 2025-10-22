package co.makara.Student.Management.model;

import java.util.List;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "departments")
@Data
public class Department {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String  code;
    // One department can have many students
    @OneToMany(mappedBy = "department", cascade = CascadeType.ALL)
    List<Student> students;
}
