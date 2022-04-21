package composite.implementation_1;

import composite.implementation_1.leafs.Faculty;

import java.util.ArrayList;
import java.util.List;

public class University {

    private final Long id;
    private final String name;

    private List<Faculty> faculties;

    public University(Long id, String name) {
        this.id = id;
        this.name = name;
        faculties = new ArrayList<>();
    }

    public void addFaculty(Faculty faculty){
        faculties.add(faculty);
    }

    public void removeFaculty(Faculty faculty){
        faculties.remove(faculty);
    }

    public void printAllFaculties(){
        System.out.println(id + "-" + name);
        faculties.forEach(Faculty::printFacultyName);
    }

}
