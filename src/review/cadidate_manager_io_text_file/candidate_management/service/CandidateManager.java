package review.cadidate_manager_io_text_file.candidate_management.service;

import review.cadidate_manager_io_text_file.candidate_management.model.Candidate;

import java.util.ArrayList;
import java.util.List;

public class CandidateManager implements ICandidateManager {
    List<Candidate> candidateList = new ArrayList<>();
    ReadWriteCandidate readWriteCandidate = new ReadWriteCandidate();

    public CandidateManager(List candidateList) {
        this.candidateList = candidateList;
    }

    public CandidateManager() {
        candidateList = showAll();
    }

    public void addExperienceCandidate(Candidate experienceCandidate) {
        candidateList.add(experienceCandidate);
        readWriteCandidate.writeExperienceCandidateList(experienceCandidate);
    }

    public void addFresherCandidate(Candidate fresherCandidate) {
        candidateList.add(fresherCandidate);
        readWriteCandidate.writeFresherCandidateList(fresherCandidate);
    }

    public void addInternCandidate(Candidate internCandidate) {
        candidateList.add(internCandidate);
        readWriteCandidate.writeInternCandidateList(internCandidate);
    }

    public List showAll() {

        List<Candidate> experienceCandidateList = readWriteCandidate.readExperienceCandidateList();
        List<Candidate> fresherCandidateList = readWriteCandidate.readFresherCandidateList();
        List<Candidate> internCandidateList = readWriteCandidate.readInternCandidateList();
        for (Candidate experienceCandidate : experienceCandidateList) {
            candidateList.add(experienceCandidate);
        }
        for (Candidate fresherCandidate : fresherCandidateList) {
            candidateList.add(fresherCandidate);
        }
        for (Candidate internCandidate : internCandidateList) {
            candidateList.add(internCandidate);
        }

        return candidateList;
    }

    @Override
    public void showExperienceCandidate() {
        List<Candidate> experienceCandidateList = new ArrayList<>();
        experienceCandidateList = readWriteCandidate.readExperienceCandidateList();
        for (int i = 0; i < experienceCandidateList.size(); i++) {
            System.out.println(experienceCandidateList.get(i));
        }
    }

    @Override
    public void showFresherCandidate() {
        List<Candidate> fresherCandidateList = new ArrayList<>();
        fresherCandidateList = readWriteCandidate.readFresherCandidateList();
        for (int i = 0; i < fresherCandidateList.size(); i++) {
            System.out.println(fresherCandidateList.get(i));
        }
    }

    @Override
    public void showInternCandidate() {
        List<Candidate> internCandidateList = new ArrayList<>();
        internCandidateList = readWriteCandidate.readInternCandidateList();
        for (int i = 0; i < internCandidateList.size(); i++) {
            System.out.println(internCandidateList.get(i));
        }
    }

    public void searchCandidate(String key, byte type) {

        for (int i = 0; i < candidateList.size(); i++) {
            if (this.candidateList.get(i).getFirstName().contains(key) || this.candidateList.get(i).getLastName().contains(key)) {
                if (type == this.candidateList.get(i).getCandidateType()) {
                    switch (type) {
                        case 0:
                            System.out.println(this.candidateList);
                            break;
                        case 1:
                            System.out.println(this.candidateList);
                            break;
                        case 2:
                            System.out.println(this.candidateList);
                            break;
                        default:
                            System.out.println("Not found!");
                    }
                } else {
                    System.out.println("Not found!");
                }
            } else {
                System.out.println("Not found!");
            }
        }
    }


}
