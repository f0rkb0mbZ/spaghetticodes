import java.util.*;

class Checker implements Comparator<Student>{
    @Override
    public int compare(Student s1, Student s2){
        int cgpadiff = Double.compare(s2.getCgpa(), s1.getCgpa());
        int namediff = s1.getFname().compareTo(s2.getFname());
        if(cgpadiff != 0)
            return cgpadiff;
        else if(namediff != 0)
            return namediff;
        else
            return s1.getId() - s2.getId();
    }
}


class Student {
    private int id;
    private String fname;
    private double cgpa;

    public Student(int id, String fname, double cgpa) {
        super();
        this.id = id;
        this.fname = fname;
        this.cgpa = cgpa;
    }

    public int getId() {
        return id;
    }

    public String getFname() {
        return fname;
    }

    public double getCgpa() {
        return cgpa;
    }
}

// Complete the code
public class compareStudents {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());

        List<Student> studentList = new ArrayList<Student>();
        Checker check = new Checker();
        while (testCases > 0) {
            int id = in.nextInt();
            String fname = in.next();
            double cgpa = in.nextDouble();

            Student st = new Student(id, fname, cgpa);
            studentList.add(st);

            testCases--;
        }
        Collections.sort(studentList, check);
        for (Student st : studentList) {
            System.out.println(st.getFname());
        }
    }
}
