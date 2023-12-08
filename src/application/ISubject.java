package application;

import java.util.ArrayList;


public interface ISubject {
	String getName();
    void addNote(int grade);
    double calculateMoyenNote();
    ArrayList<Integer> getNotes();
}
