package studyingPlace;

import java.time.LocalDate;

public class University extends EducationCenter{
    public University(String name, String locatedCounty, LocalDate foundationYear) {
        super(name, locatedCounty, foundationYear);
    }

    public University() {
    }
}
