package co.refiere.models;
// Generated Apr 19, 2016 11:27:45 AM by Hibernate Tools 4.3.1.Final

import java.util.HashSet;
import java.util.Set;

/**
 * Person generated by hbm2java
 */
public class Person implements java.io.Serializable {

    private int id;
    private CompanyDatabase companyDatabase;
    private String identificationCardNumber;
    private String name;
    private String lastName;
    private String email;
    private String phoneNumber;
    private String metaphoneName;
    private Set referencesCodeses = new HashSet(0);

    public Person() {
    }

    public Person(int id, String identificationCardNumber, String name, String lastName, String email,
            String phoneNumber) {
        this.id = id;
        this.identificationCardNumber = identificationCardNumber;
        this.name = name;
        this.lastName = lastName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public Person(int id, CompanyDatabase companyDatabase, String identificationCardNumber, String name,
            String lastName, String email, String phoneNumber, String metaphoneName, Set referencesCodeses) {
        this.id = id;
        this.companyDatabase = companyDatabase;
        this.identificationCardNumber = identificationCardNumber;
        this.name = name;
        this.lastName = lastName;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.metaphoneName = metaphoneName;
        this.referencesCodeses = referencesCodeses;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public CompanyDatabase getCompanyDatabase() {
        return this.companyDatabase;
    }

    public void setCompanyDatabase(CompanyDatabase companyDatabase) {
        this.companyDatabase = companyDatabase;
    }

    public String getIdentificationCardNumber() {
        return this.identificationCardNumber;
    }

    public void setIdentificationCardNumber(String identificationCardNumber) {
        this.identificationCardNumber = identificationCardNumber;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return this.lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getMetaphoneName() {
        return this.metaphoneName;
    }

    public void setMetaphoneName(String metaphoneName) {
        this.metaphoneName = metaphoneName;
    }

    public Set getReferencesCodeses() {
        return this.referencesCodeses;
    }

    public void setReferencesCodeses(Set referencesCodeses) {
        this.referencesCodeses = referencesCodeses;
    }

}
