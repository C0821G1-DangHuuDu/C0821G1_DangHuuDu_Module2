package review.candidate_management.model;

public abstract class Candidate {
    private int candidateID;
    private String firstName;
    private String lastName;
    private short yearBirthDate;
    private String address;
    private String phone;
    private String email;
    private byte candidateType;

    public Candidate() {
    }

    public Candidate(int candidateID, String firstName, String lastName, short yearBirthDate, String address, String phone, String email, byte candidateType) {
        this.candidateID = candidateID;
        this.firstName = firstName;
        this.lastName = lastName;
        this.yearBirthDate = yearBirthDate;
        this.address = address;
        this.phone = phone;
        this.email = email;
        this.candidateType = candidateType;
    }

    public int getCandidateID() {
        return candidateID;
    }

    public void setCandidateID(int candidateID) {
        this.candidateID = candidateID;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public short getYearBirthDate() {
        return yearBirthDate;
    }

    public void setYearBirthDate(short yearBirthDate) {
        this.yearBirthDate = yearBirthDate;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public byte getCandidateType() {
        return candidateType;
    }

    public void setCandidateType(byte candidateType) {
        this.candidateType = candidateType;
    }

    @Override
    public String toString() {
        return "Candidate{" +
                "candidateID=" + candidateID +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", birthDate=" + yearBirthDate +
                ", address='" + address + '\'' +
                ", phone=" + phone +
                ", email='" + email + '\'' +
                ", candidateType=" + candidateType +
                '}';
    }
}
