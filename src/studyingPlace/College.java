package studyingPlace;

import java.time.LocalDate;

public class College extends EducationCenter {
    public College(String name, String locatedCounty, LocalDate foundationYear) {
        super(name, locatedCounty, foundationYear);
    }

    public College() {
    }
}
