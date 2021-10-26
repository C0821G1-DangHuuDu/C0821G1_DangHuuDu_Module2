package review.candidate_management.controller;

import review.candidate_management.model.Candidate;
import review.candidate_management.model.ExperienceCandidate;
import review.candidate_management.model.FresherCandidate;
import review.candidate_management.service.CandidateManager;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        CandidateManager candidate = new CandidateManager();
        int choose;
        do {
            System.out.println("CANDIDATE MANAGEMENT SYSTEM");
            System.out.println("1.\tExperience");
            System.out.println("2.\tFresher");
            System.out.println("3.\tInternship");
            System.out.println("4.\tSearching");
            System.out.println("5.\tShow List");
            System.out.println("6.\tExit");

            System.out.print("Enter your choose: ");
            choose = Integer.parseInt(input.nextLine());

            if (choose == 4 || choose == 5 || choose == 6) {
                switch (choose) {
                    case 4:
                        System.out.print("Enter key need to find: ");
                        String key = input.nextLine();
                        System.out.print("Enter Candidate Type need to find: ");
                        byte type = Byte.parseByte(input.nextLine());
                        candidate.searchCandidate(key,type);
                        break;
                    case 5:
                        candidate.showAll();
                        break;
                    case 6:
                        continue;
                }

            } else {

                System.out.print("Enter Candidate ID: ");
                int candidateID = Integer.parseInt(input.nextLine());
                System.out.print("Enter Candidate First name: ");
                String candidateFirstName = input.nextLine();
                System.out.print("Enter Candidate Last name: ");
                String candidateLastName = input.nextLine();
                short candidateYearBirthDate;
                do {
                    System.out.print("Enter Candidate Year Birth Date: ");
                    candidateYearBirthDate = Short.parseShort(input.nextLine());
                }while (candidateYearBirthDate<1900||candidateYearBirthDate>2021);
                System.out.print("Enter Candidate Address: ");
                String candidateAddress = input.nextLine();
                String candidatePhone;
                do {
                    System.out.print("Enter Candidate Phone (minimum 10 characters): ");
                    candidatePhone = input.nextLine();
                }while (candidatePhone.length()>=10);
                System.out.print("Enter Candidate Email: ");
                String candidateEmail = input.nextLine();
                byte candidateType;
                do {
                    System.out.print("Enter Candidate Type(choose 0/1/2): ");
                    System.out.print("0: for Experience");
                    System.out.print("1: for Fresher candidate");
                    System.out.print("2: for Intern candidate");
                    candidateType = Byte.parseByte(input.nextLine());
                }while (candidateType<0||candidateType>2);

                switch (choose) {
                    case 1:
                        byte yearOfExperience;
                        do {
                            System.out.print("Enter Candidate Year of Experience (from 0 to 100): ");
                            yearOfExperience = Byte.parseByte(input.nextLine());
                        }while (yearOfExperience<0||yearOfExperience>100);
                        System.out.print("Enter Candidate Professional Skill: ");
                        String professionalSkill = input.nextLine();
                        Candidate experirnceCandidate = new ExperienceCandidate(candidateID, candidateFirstName, candidateLastName, candidateYearBirthDate, candidateAddress, candidatePhone, candidateEmail, candidateType, yearOfExperience, professionalSkill);
                        candidate.addExperienceCandidate(experirnceCandidate);
                        break;
                    case 2:
                        System.out.print("Enter Graduated Time: ");
                        String graduatedTime = input.nextLine();
                        String rankOfGraduation;
                        do {
                            System.out.print("Enter Rank of Graduated(Excellence, Good, Fair, Poor): ");
                            rankOfGraduation = input.nextLine();
                        }while (!(rankOfGraduation.equals("Excellence"))||!(rankOfGraduation.equals("Good"))||!(rankOfGraduation.equals("Fair"))||!(rankOfGraduation.equals("Poor")));
                        System.out.print("Enter University Graduated: ");
                        String universityGraduation = input.nextLine();
                        Candidate fresherCandidate = new FresherCandidate(candidateID, candidateFirstName, candidateLastName, candidateYearBirthDate, candidateAddress, candidatePhone, candidateEmail, candidateType, graduatedTime, rankOfGraduation, universityGraduation);
                        candidate.addFresherCandidate(fresherCandidate);
                        break;
                    case 3:
                        System.out.print("Enter Majors: ");
                        String majors = input.nextLine();
                        System.out.print("Enter Semester: ");
                        String semester = input.nextLine();
                        System.out.print("Enter University Name: ");
                        String universityName = input.nextLine();
                        Candidate internCandidate = new FresherCandidate(candidateID, candidateFirstName, candidateLastName, candidateYearBirthDate, candidateAddress, candidatePhone, candidateEmail, candidateType, majors, semester, universityName);
                        candidate.addInternCandidate(internCandidate);
                        break;
                }
            }

        } while (choose != 6);


    }
}
