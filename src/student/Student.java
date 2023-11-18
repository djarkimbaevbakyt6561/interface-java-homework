package student;

import studyingPlace.EducationCenter;

import java.time.LocalDate;

public class Student implements Study {
    private String name;
    private String surname;
    private LocalDate dateOfStart;
    private Gender gender;
    private EducationCenter educationCenter;

    public Student(String name, String surname, Gender gender, LocalDate dateOfStart, EducationCenter educationCenter) {
        this.name = name;
        this.surname = surname;
        this.dateOfStart = dateOfStart;
        this.gender = gender;
        this.educationCenter = educationCenter;
    }

    public Student() {
    }
    @Override
    public void getStudentEducationCenter() {
        if(gender.getGender() == 'M'){
            System.out.println("Ученик " + name + " " + surname  +". Пол: " + "мужской," +  " учиться в заведении под названием ".concat(educationCenter.getName() + ". Это заведение находится в стране ").concat(educationCenter.getLocatedCounty() + " и это заведение было создано в " + educationCenter.getFoundationYear()+ " году"));

        } else {
            System.out.println("Ученик " + name + " " + surname  +". Пол: " + "женский," +  " учиться в заведении под названием ".concat(educationCenter.getName() + ". Это заведение находится в стране ").concat(educationCenter.getLocatedCounty() + " и это заведение было создано в " + educationCenter.getFoundationYear() + " году"));

        }

    }
    public void getStudentsStudyingYear() {
        System.out.println("Учиться в заведении " + educationCenter.getName() + " "+ (LocalDate.now().getYear() - dateOfStart.getYear()) + " года");
    }
}
