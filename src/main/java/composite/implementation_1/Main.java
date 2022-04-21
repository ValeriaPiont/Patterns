package composite.implementation_1;

import composite.implementation_1.leafs.BioFaculty;
import composite.implementation_1.leafs.Faculty;
import composite.implementation_1.leafs.MathFaculty;

public class Main {
    public static void main(String[] args) {
        University university = new University(1L, "Karazin");

        Faculty bio = new BioFaculty();
        Faculty math = new MathFaculty();

        university.addFaculty(bio);
        university.addFaculty(math);

        university.printAllFaculties();

    }
}
