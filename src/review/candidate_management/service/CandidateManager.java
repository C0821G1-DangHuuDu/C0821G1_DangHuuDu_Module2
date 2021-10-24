package review.candidate_management.service;

import review.candidate_management.model.Candidate;

import java.util.ArrayList;
import java.util.List;

public class CandidateManager {
    List<Candidate> cadidateList;

    public CandidateManager(List cadidateList) {
        this.cadidateList = cadidateList;
    }

    public CandidateManager() {
        cadidateList =new ArrayList();
    }
    public void addExperienceCandidate(Candidate experienceCandidate){
        cadidateList.add(experienceCandidate);
    }
    public void addFresherCandidate(Candidate fresherCandidate){
        cadidateList.add(fresherCandidate);
    }
    public void addInternCandidate(Candidate internCandidate){
        cadidateList.add(internCandidate);
    }
    public void showAll(){
        for (int i = 0; i < cadidateList.size(); i++) {
            System.out.println(cadidateList.get(i));
        }
    }
    public void searchCandidate(String key,byte type){
        for(int i=0;i<cadidateList.size();i++){
            if(this.cadidateList.get(i).getFirstName().contains(key)||this.cadidateList.get(i).getLastName().contains(key)){
                if (type==this.cadidateList.get(i).getCandidateType()) {
                    switch (type) {
                        case 0:
                            System.out.println(this.cadidateList);
                            break;
                        case 1:
                            System.out.println(this.cadidateList);
                            break;
                        case 2:
                            System.out.println(this.cadidateList);
                            break;
                        default:
                            System.out.println("Not found!");
                    }
                }else {
                    System.out.println("Not found!");
                }
            }else {
                System.out.println("Not found!");
            }
        }
    }


}
