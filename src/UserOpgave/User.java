package UserOpgave;

public class User {

    private String fornavn;
    private String efternavn;
    private String email;
    private String tlfnr;

    public User(String fornavn, String efternavn, String email) {
        this.fornavn = fornavn;
        this.efternavn = efternavn;
        this.email = email;
    }

    public User(String fornavn, String efternavn, String email, String tlfnr) {
        this.fornavn = fornavn;
        this.efternavn = efternavn;
        this.email = email;
        this.tlfnr = tlfnr;
    }

    @Override
    public String toString() {
        return "User{ " +
                "Fornavn: " + fornavn + '\n' +
                "Efternavn: " + efternavn + '\n' +
                "Email: " + email + '\n' +
                "Telefonnummer: " + tlfnr;
    }


    public String getFornavn() {
        return fornavn;
    }

    public void setFornavn(String fornavn) {
        this.fornavn = fornavn;
    }

    public String getEfternavn() {
        return efternavn;
    }

    public void setEfternavn(String efternavn) {
        this.efternavn = efternavn;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTlfnr() {
        return tlfnr;
    }

    public void setTlfnr(String tlfnr) {
        this.tlfnr = tlfnr;
    }
}
