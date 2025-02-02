package ru.netology.service;

public class Epic extends Task {
    protected String[] subtasks = new String[0];


    public Epic(int id, String[] subtasks) {
        super(id); // вызов родительского конструктора
        this.subtasks = subtasks;

    }

    public String[] getTitle() {
        return subtasks;
    }

    @Override
    public boolean matches(String query) {
        for (String subtask : subtasks) {
            if (subtask.contains(query)) {
                return true;
            }


        }
        return false;
   }

}