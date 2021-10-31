package review.cadidate_manager_io_text_file.candidate_management.service;

import review.cadidate_manager_io_text_file.candidate_management.model.Candidate;

import java.util.List;

public interface ICandidateManager {
    public void addExperienceCandidate(Candidate experienceCandidate);
    public void addFresherCandidate(Candidate fresherCandidate);
    public void addInternCandidate(Candidate internCandidate);
    public List showAll();
    public void showExperienceCandidate();
    public void showFresherCandidate();
    public void showInternCandidate();
    public void searchCandidate(String key,byte type);
}
