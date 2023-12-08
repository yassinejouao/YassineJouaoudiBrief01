package application;

import java.util.ArrayList;

class Subject implements ISubject {
    private String name;
    private ArrayList<Integer> notes;

    public Subject(String name) {
        this.name = name;
        this.notes = new ArrayList<>();
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void addNote(int note) {
    	notes.add(note);
    }
    @Override
    public ArrayList<Integer> getNotes() {
        return new ArrayList<>(notes);
    }

    @Override
    public double calculateMoyenNote() {
        if (notes.isEmpty()) {
            return 0.0;
        }

        double total = 0.0;
        for (int note : notes) {
            total += note;
        }

        return total / notes.size();
    }
}