package gr.aueb.cf.ch16.interfaces.model;

public class Customer {
    private Long id;
    private String vat;
    private String region;
    private String address;
    private String lastname;
    private String firstname;
    private String phonenumber;

    public Customer() {

    }


    public Customer(Long id, String vat,
                    String address, String lastname, String firstname, String phoneNumber) {
        this.id = id;
        this.vat = vat;
        this.address = address;
        this.firstname = firstname;
        this.lastname = lastname;
        this.phonenumber = phoneNumber;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getVat() {
        return vat;
    }

    public void setVat(String vat) {
        this.vat = vat;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber;
    }
}
