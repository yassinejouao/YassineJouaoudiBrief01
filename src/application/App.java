package application;

import java.util.Scanner;

public class App {
	public static final String ANSI_RESET = "\u001B[0m";
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		IStudentManager studentManager = new StudentManager();
		while(true) {
			System.out.println(" ");
			System.out.println(ConsoleColor.RED+"###########################################"+ConsoleColor.RESET);
			System.out.println("# 1 - add Student                           #");
			System.out.println("# 2 - add Subject to Student                #");
			System.out.println("# 3 - display Subject by Student            #");
			System.out.println("# 4 - add note to Subject              	    #");
			System.out.println("# 5 - calcuate Average for specific subject #");
			System.out.println("# 10 - display all Students                 #");
			System.out.println(ConsoleColor.RED+"###########################################"+ConsoleColor.RESET);
			int option = sc.nextInt();
			switch(option){
            case 1 :
            	System.out.println("Type name of Student :");
            	String name = sc.next();
            	Student student = new Student(name);
            	studentManager.CreateStudent(student);
            	break;
            case 2 :
            	System.out.println("type name of Student :");
            	name = sc.next();
            	System.out.println("name of Subject : ");
            	String subjectName = sc.next();
            	Subject sub = new Subject(subjectName);
            	studentManager.AddSubjectToStudent(sub, name);
            	break;
            case 3 :
            	System.out.println("type name of Student :");
            	name = sc.next();
            	studentManager.DisplaySubjectByStudent(name);
            	break;
            case 4 :
            	System.out.println("type name of Student :");
            	name = sc.next();
            	System.out.println("type name of Subject :");
            	subjectName = sc.next();
            	boolean stopAddingNotes = true;
            	while(stopAddingNotes) {
            		System.out.println("Note :                (q:quit)");
                	if(sc.hasNextInt()){
                		int note = sc.nextInt();
                    	studentManager.AddNoteToSubjectByStudent(note, name, subjectName);
                	} else {
                		String quit = sc.next();
                		if(quit.equals("q")){
                			stopAddingNotes = false;
                		}
                	}
            	}
            	
            	
            	break;
            case 5 : 
            	System.out.println("type name of Student :");
            	name = sc.next();
            	System.out.println("type name of Subject :");
            	subjectName = sc.next();
            	double average = studentManager.calculateAverageNoteOfSubject(subjectName, name);
            	System.out.println("average of "+subjectName+" Subject is :"+average);
            	
            case 10 :
            	System.out.println("All student :");
            	System.out.println("###########################################");
            	studentManager.DisplayStudent();
            	System.out.println("###########################################\n");
            	break;
            default:
                sc.close();
            	break;
			}
		}

	}

}
