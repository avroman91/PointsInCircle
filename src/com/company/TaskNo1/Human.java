package com.company.TaskNo1;

public class Human {

    private String familyName;
    private String name;
    private String fathersName;

    public String getFullName() {
        return familyName + " " + name + " " + (fathersName == null ? "" : fathersName);
    }

    public String getShortName() {
        return familyName + " " + name.charAt(0) + "." + (fathersName == null ? "" : fathersName.charAt(0) + ".");
    }

    public Human(String name, String familyName) {
        this.familyName = familyName;
        this.name = name;
    }

    public Human(String familyName, String name, String fathersName) {
        this.familyName = familyName;
        this.name = name;
        this.fathersName = fathersName;
    }
}
