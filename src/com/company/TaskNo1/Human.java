package com.company.TaskNo1;

public class Human {

    private String FamilyName;
    private String Name;
    private String FathersName;

    public String getFullName() {
        return FamilyName + " " + Name + " " + (FathersName == null ? "" : FathersName);
    }

    public String getShortName() {
        return FamilyName + " " + Name.charAt(0) + "." + (FathersName == null ? "" : FathersName.charAt(0) + ".");
    }

    public Human(String name, String familyName) {
        FamilyName = familyName;
        Name = name;
    }

    public Human(String familyName, String name, String fathersName) {
        FamilyName = familyName;
        Name = name;
        FathersName = fathersName;
    }
}
