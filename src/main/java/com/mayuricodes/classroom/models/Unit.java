package com.mayuricodes.classroom.models;

@Entity
public class Unit {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;

    @ManyToOne
    private Class classUnit;

    @OneToMany(mappedBy = "unit")
    private List<Session> sessions;

    // Getters, Setters, Constructors
}

