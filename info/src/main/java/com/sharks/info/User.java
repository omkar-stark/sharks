package com.sharks.info;

public class User {

    private int id1;
    private String firstName;
    private String lastName;
    private String email;

    public User() {}

    public User(int id1, String firstName,String lastName, String email) {
        this.id1 = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
    }

    public int getId1() { return id1; }
    public void setId1(int id1) { this.id1 = id1; }
    
    public String getfirstName() { return firstName; }
    public void setName(String firstName) { this.firstName = firstName; }

    public String getlastName() { return lastName; }
    public void setlastName(String lastName) { this.lastName = lastName; }
    
    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }
    
}
