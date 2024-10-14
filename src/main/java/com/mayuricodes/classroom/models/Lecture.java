package com.mayuricodes.classroom.models;

@Entity
public class Lecture {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;
    private String content;

    @ManyToOne
    private Session session;

    @OneToMany(mappedBy = "lecture")
    private List<Comment> comments;

    // Getters, Setters, Constructors
}

