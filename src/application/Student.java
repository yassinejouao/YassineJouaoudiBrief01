package application;

import java.util.ArrayList;


public class Student implements IStudent {
    private String name;
    private ArrayList<Subject> subjects;

    public Student(String name) {
        this.name = name;
        this.subjects = new ArrayList<>();
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void addSubject(Subject subject) {
        subjects.add(subject);
    }
    
    public ArrayList<Subject> getSubjects() {
    	return subjects;
    }
    @Override
    public double calculateMoyenNoteOfSubject(String SubjectName) {
        double total = 0.0;
        for (Subject subject : subjects) {
        	if(subject.getName().equals(SubjectName)) {
        		total = subject.calculateMoyenNote();
        	}
        }
        return total;
    }
    
}