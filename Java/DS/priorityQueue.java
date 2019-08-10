import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.PriorityQueue;
import java.util.Scanner;
import java.util.Collections;
/*
The student having the highest Cumulative Grade Point Average (CGPA) is served first.
Any students having the same CGPA will be served by name in ascending case-sensitive alphabetical order.
Any students having the same CGPA and name will be served in ascending order of the id.
Create the following two classes:

The Student class should implement:
The constructor Student(int id, String name, double cgpa).
The method int getID() to return the id of the student.
The method String getName() to return the name of the student.
The method double getCGPA() to return the CGPA of the student.
The Priorities class should implement the method List<Student> getStudents(List<String> events) to process all the given events
and return all the students yet to be served in the priority order.
*/
import java.util.StringTokenizer;

class Student implements Comparable<Student> {
    int id;
    String name;
    double cgpa;

    Student(String name, double cgpa, int id) {
        this.id = id;
        this.name = name;
        this.cgpa = cgpa;
    }

    public int getID() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public double getCGPA() {
        return this.cgpa;
    }

    @Override
    public int compareTo(Student student) {
        if (this.getCGPA() != student.getCGPA()) {
            return student.getCGPA() - this.getCGPA() > 0 ? 1 : -1;
        } else if (this.getCGPA() == student.getCGPA()) {
            return this.getName().compareTo(student.getName());
        } else {
            return this.getID() - student.getID();
        }
    }
}

class Priorities {
    public List<Student> getStudents(List<String> events) {
        PriorityQueue<Student> pq = new PriorityQueue<>();
        for (String s : events) {
            // System.out.println(s);
            StringTokenizer st = new StringTokenizer(s, " ");
            String tok0 = st.nextToken();
            if (tok0.equals("ENTER")) {
                pq.add(new Student(st.nextToken(), Double.parseDouble(st.nextToken()),
                        Integer.parseInt(st.nextToken())));
            } else if (tok0.equals("SERVED")) {
                try{
                    pq.remove();
                } catch(NoSuchElementException e){
                    continue;
                }
            }
        }
        ArrayList<Student> stud = new ArrayList<Student>();
        for (Student std : pq) {
            stud.add(std);
        }
        Collections.sort(stud);
        return stud;
    }
}

public class priorityQueue {
    private final static Scanner scan = new Scanner(System.in);
    private final static Priorities priorities = new Priorities();

    public static void main(String[] args) {
        int totalEvents = Integer.parseInt(scan.nextLine());
        List<String> events = new ArrayList<>();

        while (totalEvents-- != 0) {
            String event = scan.nextLine();
            events.add(event);
        }

        List<Student> students = priorities.getStudents(events);

        if (students.isEmpty()) {
            System.out.println("EMPTY");
        } else {
            for (Student st : students) {
                System.out.println(st.getName());
            }
        }
    }
}