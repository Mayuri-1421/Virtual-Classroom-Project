package com.mayuricodes.classroom.models;

@Entity
public class Session {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;

    @ManyToOne
    private Unit unit;

    @OneToMany(mappedBy = "session")
    private List<Lecture> lectures;

    // Getters, Setters, Constructors
}
