package review.cadidate_manager_io_text_file.candidate_management.model;

public class FresherCandidate extends Candidate {
    private String graduatedTime;
    private String rankOfGraduation;
    private String universityGraduation;

    public FresherCandidate() {
    }

    public FresherCandidate(int candidateID, String firstName, String lastName, short yearBirthDate, String address, String phone, String email, byte candidateType, String graduatedTime, String rankOfGraduation, String university) {
        super(candidateID, firstName, lastName, yearBirthDate, address, phone, email, candidateType);
        this.graduatedTime = graduatedTime;
        this.rankOfGraduation = rankOfGraduation;
        this.universityGraduation = university;
    }

    public String getGraduatedTime() {
        return graduatedTime;
    }

    public void setGraduatedTime(String graduatedTime) {
        this.graduatedTime = graduatedTime;
    }

    public String getRankOfGraduation() {
        return rankOfGraduation;
    }

    public void setRankOfGraduation(String rankOfGraduation) {
        this.rankOfGraduation = rankOfGraduation;
    }

    public String getUniversityGraduation() {
        return universityGraduation;
    }

    public void setUniversityGraduation(String universityGraduation) {
        this.universityGraduation = universityGraduation;
    }

    @Override
    public String toString() {
        return super.toString()+"," + this.graduatedTime +
                "," + this.rankOfGraduation +"," + this.universityGraduation;
    }
}
