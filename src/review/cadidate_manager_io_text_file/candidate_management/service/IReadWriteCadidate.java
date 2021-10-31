package review.cadidate_manager_io_text_file.candidate_management.service;

import review.cadidate_manager_io_text_file.candidate_management.model.Candidate;

import java.util.List;

public interface IReadWriteCadidate {
    public List readExperienceCandidateList();
    public List readFresherCandidateList();
    public List readInternCandidateList();
    public void writeExperienceCandidateList(Candidate experienceCandidateList);
    public void writeFresherCandidateList(Candidate fresherCandidateList);
    public void writeInternCandidateList(Candidate internCandidateList);
}
