package com.mayuricodes.classroom.models;

@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String username;
    private String password;
    private String role; // Admin, Instructor, Student

    // Getters, Setters, Constructors
}
