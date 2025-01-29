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
//    public String[] mathes(String query) {
//        String[] result = new String[0]; // массив для ответа
//        for (String subtask : subtasks) { // перебираем все задачи
//            if (subtask.matches(query)) { // если задача подходит под запрос
//                result = addToArray(result, subtask); // добавляем её в массив ответа
//            }
//        }
//        return result;




    public boolean matches(String query) {
        for (String subtask : subtasks) {
            if (subtask.contains(query)) {
                return true;
            }


        }
        return false;
   }



//        for (int i = 0; i < subtasks.length; i++) {
//
//            if (subtasks[i].contains(query)) {
//                return true;
//            }
//
//        }
//
//        return false;
//    }

}