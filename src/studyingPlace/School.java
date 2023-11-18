package studyingPlace;

import java.time.LocalDate;

public class School extends EducationCenter{
    public School(String name, String locatedCounty, LocalDate foundationYear) {
        super(name, locatedCounty, foundationYear);
    }

    public School() {
    }
}
