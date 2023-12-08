package application;

public interface IStudentManager {
	void CreateStudent(Student s);
	void DisplayStudent();
	Student findStudent(String name);
	void AddSubjectToStudent(Subject sub,String nameOfStudent);
	void DisplaySubjectByStudent(String name);
	void AddNoteToSubjectByStudent(int note,String studentName,String SubjectName);
	double calculateAverageNoteOfSubject(String Subject,String studentName);
	}
