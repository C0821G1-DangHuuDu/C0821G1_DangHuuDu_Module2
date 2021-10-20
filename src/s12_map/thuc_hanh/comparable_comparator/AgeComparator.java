package s12_map.thuc_hanh.comparable_comparator;

import java.util.Comparator;

public class AgeComparator implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        if(o1.equals(null)||o2.equals(null)){
            return 0;
        }
        if(o1.getStudentAge()>o2.getStudentAge()){
            return 1;
        }else if (o1.getStudentAge()<o2.getStudentAge()){
            return -1;
        }else{
            return 0;
        }
    }
}
