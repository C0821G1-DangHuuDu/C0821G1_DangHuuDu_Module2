package review.candidate_management.model;

public class InternCandidate extends Candidate{
    private String majors;
    private String semester;
    private String universityName;

    public InternCandidate() {
    }

    public InternCandidate(int candidateID, String firstName, String lastName, short yearBirthDate, String address, String phone, String email, byte candidateType, String majors, String semester, String universityName) {
        super(candidateID, firstName, lastName, yearBirthDate, address, phone, email, candidateType);
        this.majors = majors;
        this.semester = semester;
        this.universityName = universityName;
    }

    public String getMạjors() {
        return majors;
    }

    public void setMạjors(String majors) {
        this.majors = majors;
    }

    public String getSemester() {
        return semester;
    }

    public void setSemester(String semester) {
        this.semester = semester;
    }

    public String getUniversityName() {
        return universityName;
    }

    public void setUniversityName(String universityName) {
        this.universityName = universityName;
    }

    @Override
    public String toString() {
        return super.toString()+"InternCandidate{" +
                "mạjors='" + majors + '\'' +
                ", semester='" + semester + '\'' +
                ", universityName='" + universityName + '\'' +
                '}';
    }
}
