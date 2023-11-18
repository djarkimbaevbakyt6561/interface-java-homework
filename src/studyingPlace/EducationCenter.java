package studyingPlace;

import java.time.LocalDate;

public abstract class EducationCenter {
    private String name;
    private String locatedCounty;
    private LocalDate foundationYear;

    public EducationCenter(String name, String locatedCounty, LocalDate foundationYear) {
        this.name = name;
        this.locatedCounty = locatedCounty;
        this.foundationYear = foundationYear;
    }

    public EducationCenter() {
    }

    public String getName() {
        return name;
    }

    public String getLocatedCounty() {
        return locatedCounty;
    }

    public int getFoundationYear() {
        return foundationYear.getYear();
    }


}
