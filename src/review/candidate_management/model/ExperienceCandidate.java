package review.candidate_management.model;

public class ExperienceCandidate extends Candidate {
    private byte yearOfExperience;
    private String professionalSkill;

    public ExperienceCandidate() {
    }

    public ExperienceCandidate(int candidateID, String firstName, String lastName, short yearBirthDate, String address, String phone, String email, byte candidateType, byte yearOfExperience, String professionalSkill) {
        super(candidateID, firstName, lastName, yearBirthDate, address, phone, email, candidateType);
        this.yearOfExperience = yearOfExperience;
        this.professionalSkill = professionalSkill;
    }


    public byte getYearOfExperience() {
        return yearOfExperience;
    }

    public void setYearOfExperience(byte yearOfExperience) {
        this.yearOfExperience = yearOfExperience;
    }

    public String getProfessionalSkill() {
        return professionalSkill;
    }

    public void setProfessionalSkill(String professionalSkill) {
        this.professionalSkill = professionalSkill;
    }

    @Override
    public String toString() {
        return super.toString()+"ExperienceCandidate{" +
                "yearOfExperience=" + yearOfExperience +
                ", professionalSkill='" + professionalSkill + '\'' +
                '}';
    }
}
