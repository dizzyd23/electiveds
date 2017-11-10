package Craig;

import Christiaan.StudentList;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class StudentListData {


    public static void main(String[] args) {
        StudentList c1 = new StudentList();
        c1.setStudentNumber("100");
        c1.setName("Craig");

        StudentList c2 = new StudentList();
        c2.setStudentNumber(22);
        c2.setName("Buga");

        StudentList c3 = new StudentList();
        c3.setStudentNumber(33);
        c3.setName("Lam");

        StudentList c4 = new StudentList();
        c4.setStudentNumber(33);
        c4.setName("brock");

        List AllowingStudentDuplicates = new ArrayList();
        AllowingStudentDuplicates.add(c1);
        AllowingStudentDuplicates.add(c2);
        AllowingStudentDuplicates.add(c3);
        AllowingStudentDuplicates.add(c4);

        System.out.println("The Students in the list are " + AllowingStudentDuplicates.size());


        Set NoStudentDuplicates = new HashSet();
        NoStudentDuplicates.add(c1);
        NoStudentDuplicates.add(c2);
        NoStudentDuplicates.add(c3);
        NoStudentDuplicates.add(c4);

        System.out.println("The Students in the list are  " + NoStudentDuplicates.size());

    }


}