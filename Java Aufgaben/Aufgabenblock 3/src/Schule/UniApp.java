package Schule;

public class UniApp {
    public static void main(String[] args) {
        Date geburtsdatumStudent = new Date(1, 2, 2002);
        Student student = new Student("Thomas", geburtsdatumStudent, 123456, 2);

        System.out.println("Student:");
        System.out.println("Name: " + student.getName());
        System.out.println("Semester: " + student.getSemester());

        Date geburtsdatumProfessor = new Date(5, 6, 1970);
        Date eintrittsdatumProfessor = new Date(1, 10, 2000);
        Professor professor = new Professor("Dr. Peter", geburtsdatumProfessor, 350, "Mathematik", "Informatik", eintrittsdatumProfessor);

        System.out.println("\nProfessor:");
        System.out.println("Name: " + professor.getName());
        System.out.println("Fakultät: " + professor.getFakultät());
        System.out.println("Gehalt: " + professor.getGehalt());

        Date geburtsdatumAssistant = new Date(10, 3, 1995);
        Date eintrittsdatumAssistant = new Date(1, 10, 2020);
        Assistant assistant = new Assistant("Max Meier", geburtsdatumAssistant, 300, 7890, eintrittsdatumAssistant);

        System.out.println("\nAssistant:");
        System.out.println("Name: " + assistant.getName());
        System.out.println("Personalnummer: " + assistant.getPersonalnummer());
        System.out.println("Gehalt: " + assistant.getGehalt());
    }
}

