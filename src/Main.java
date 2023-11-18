import student.Gender;
import student.Student;
import studyingPlace.College;
import studyingPlace.EducationCenter;
import studyingPlace.School;
import studyingPlace.University;

import java.time.LocalDate;

public class Main {
    public static void getStudentData(Student[] students){
        System.out.println("Данные о студентах: ");
        for (Student student : students) {
            student.getStudentEducationCenter();
            student.getStudentsStudyingYear();
            System.out.println();
        }
    }
    public static void main(String[] args) {
        EducationCenter[] educationCenters = new EducationCenter[10];
        educationCenters[0] = new University("Оксфордский университет", "Великобритания", LocalDate.of(1096, 6, 12));
        educationCenters[1] = new University("Университет Кембриджа", "Великобритания", LocalDate.of(1209, 6, 12));
        educationCenters[2] = new University("Саламанка университет", "Испания", LocalDate.of(1218, 6, 12));
        educationCenters[3] = new University("Университет Болоньи", "Италия", LocalDate.of(1088, 6, 12));
        educationCenters[4] = new College("Этонский колледж", "Великобритания", LocalDate.of(1440, 6, 12));
        educationCenters[5] = new College("Имперский колледж Лондона", "Великобритания", LocalDate.of(1907, 6, 12));
        educationCenters[6] = new College("Университет Чикаго", "США", LocalDate.of(1890, 6, 12));
        educationCenters[7] = new School("Школа Гимназии №11", "Кыргызстан", LocalDate.of(1958, 6, 12));
        educationCenters[8] = new School("Школа Чехова", "Кыргызстан", LocalDate.of(1949, 6, 12));
        educationCenters[9] = new School("Школа Пушкина", "Кыргызстан", LocalDate.of(1929, 6, 12));

        Student[] students = new Student[10];
        students[0] = new Student("John", "Doe", new Gender('M'), LocalDate.of(2020, 9, 1), educationCenters[0]);
        students[1] = new Student("Alice", "Smith", new Gender('F'), LocalDate.of(2019, 8, 25), educationCenters[1]);
        students[2] = new Student("Michael", "Johnson", new Gender('M'), LocalDate.of(2021, 3, 14), educationCenters[2]);
        students[3] = new Student("Emily", "Williams", new Gender('F'), LocalDate.of(2020, 6, 5), educationCenters[3]);
        students[4] = new Student("James", "Brown", new Gender('M'), LocalDate.of(2018, 10, 30), educationCenters[4]);
        students[5] = new Student("Sophia", "Davis", new Gender('F'), LocalDate.of(2022, 1, 10), educationCenters[5]);
        students[6] = new Student("Alexander", "Miller", new Gender('M'), LocalDate.of(2019, 12, 20), educationCenters[6]);
        students[7] = new Student("Olivia", "Wilson", new Gender('F'), LocalDate.of(2021, 7, 8), educationCenters[7]);
        students[8] = new Student("William", "Moore", new Gender('M'), LocalDate.of(2020, 4, 18), educationCenters[8]);
        students[9] = new Student("Emma", "Taylor", new Gender('F'), LocalDate.of(2017, 11, 12), educationCenters[9]);

        getStudentData(students);

    }
}