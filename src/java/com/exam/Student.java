package com.exam;
// Generated Oct 31, 2021 10:43:37 AM by Hibernate Tools 4.3.1



/**
 * Student generated by hbm2java
 */
public class Student  implements java.io.Serializable {


     private int id;
     private String name;
     private String email;
     private String round;

    public Student() {
    }

	
    public Student(int id) {
        this.id = id;
    }
    public Student(int id, String name, String email, String round) {
       this.id = id;
       this.name = name;
       this.email = email;
       this.round = round;
    }
   
    public int getId() {
        return this.id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    public String getEmail() {
        return this.email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
    public String getRound() {
        return this.round;
    }
    
    public void setRound(String round) {
        this.round = round;
    }




}


