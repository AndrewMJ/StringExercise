package com.company;

public class StringParsing {



    public static String findStudents(String[] students, String name){

        boolean wasFound=false;
        StringBuilder foundStudents = new StringBuilder();
        for(int i = 0; i< students.length; i++){
            if(students[i].equals(name)){
                foundStudents.append("FOUND at index " + i);
                wasFound = true;
            }
        }
        if (!wasFound){
            foundStudents.append("NOT IN LIST");
        }
        return foundStudents.toString();
    }


    public static String findStudents(String[] students, String[] names) {



        StringBuilder foundStudents = new StringBuilder();

        for (int i = 0; i < names.length; i++) {
            for (int j = 0; j < students.length; j++) {
                if (students[j].equals(names[i])) {
                    foundStudents.append("Found at index " + j + "\n");

                    break;
                }
                if(j == students.length - 1)  {
                    foundStudents.append("NOT IN LIST\n");
                }
            }

        }
        return foundStudents.toString();

    }
}
