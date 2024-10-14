package com.mayuricodes.classroom.models;

@Entity
public class Class {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String description;

    @ManyToOne
    private User instructor;

    @OneToMany(mappedBy = "classUnit")
    private List<Unit> units;

    // Getters, Setters, Constructors
}
