package com.mayuricodes.classroom.models;

@Entity
public class Comment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String text;

    @ManyToOne
    private Lecture lecture;

    @ManyToOne
    private Comment parentComment;

    @OneToMany(mappedBy = "parentComment")
    private List<Comment> replies;

    // Getters, Setters, Constructors
}
