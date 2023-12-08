package application;

import java.util.ArrayList;

public class StudentManager implements IStudentManager  {
	ArrayList<Student> Studentlist = new ArrayList<Student>();
	
	public void CreateStudent(Student s) {
		for (Student student : Studentlist) {
			if (student.getName().equals(s.getName())) {
				System.out.println("Student already exist.");
				return;
			}
		}
		Studentlist.add(s);
	}
	public void DisplayStudent() {
		for(int i = 0;i<Studentlist.size();i++) {
			System.out.println("Student "+i+" : "+Studentlist.get(i).getName());
		}
	}
	public Student findStudent(String name) {
        for (Student student : Studentlist) {
            if (student.getName().equals(name)) {
                return student;
            }
        }
        return null;
    }
	public void AddSubjectToStudent(Subject sub,String nameOfStudent) {
		Student student = findStudent(nameOfStudent);
        if (student != null) {
            student.addSubject(sub);
            System.out.println("Subject " + sub.getName() + " added to student " + nameOfStudent);
        } else {
            System.out.println("Student " + nameOfStudent + " not found.");
        }
	}
	public void DisplaySubjectByStudent(String name) {
		for (Student student : Studentlist) {
            if (student.getName().equals(name)) {
            	for(int i = 0; i< student.getSubjects().size();i++) {
            		System.out.println("Subject :  " + student.getSubjects().get(i).getName());
            		System.out.println("Notes :");
            		for(int j = 0;j < student.getSubjects().get(i).getNotes().size();j++)
            		{
            			System.out.print(student.getSubjects().get(i).getNotes().get(j)+"| \n");
            		}
            	}
            }
        }
	}
	public void AddNoteToSubjectByStudent(int note,String studentName,String SubjectName) {
		if(note >= 0 && note <= 20) {
		for (Student student : Studentlist) {
            if (student.getName().equals(studentName)) {
            	for(Subject subject : student.getSubjects()){
            		if(subject.getName().equals(SubjectName)) {
            		subject.addNote(note);
            		}
            	}
            }
        }
		}
		else {
			System.out.println("Notes must be between 0 and 20");
			return;
		}
		
	}
	public double calculateAverageNoteOfSubject(String Subject,String studentName) {
		for (Student student : Studentlist) {
            if (student.getName().equals(studentName)) {
            	if (student.getName().equals(studentName)) {
                	return  student.calculateMoyenNoteOfSubject(Subject);
                }
            	else {
            		System.out.println("Subject not exist");
            	}
            }
        }
		
		return 1;
	}
	

	
}
