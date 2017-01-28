package ua.training.model.entities;

/**
 * Created by Kotov Nicholas on 25.01.2017.
 */

/**
 * Faculty subjects entity. The main purpose is to tell what subjects are need to the Enrollee.
 */
public class FacultyQuantitySeats extends Entity{

    /**
     * serialVersionUID.
     */
    private static final long serialVersionUID = -7922018570068748685L;

    /**
     * id of subject.
     */
    private int facultyId;
    /**
     * id of quantitySeats.
     */
    private int quantitySeats;

    public FacultyQuantitySeats() {

    }

    /**
     *Getter for FacultyId.
     * @return int
     */
    public int getFacultyId() {
        return facultyId;
    }

    /**
     * Setter for FacultyId.
     * @param facultyId
     */
    public void setFacultyId(int facultyId) {
        this.facultyId = facultyId;
    }


    /**
     *Getter for quantitySeats.
     * @return int
     */
    public int getQuantitySeats() {
        return quantitySeats;
    }

    /**
     * Setter for quantitySeats.
     * @param quantitySeats
     */
    public void setQuantitySeats(int quantitySeats) {
        this.facultyId = quantitySeats;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        FacultyQuantitySeats that = (FacultyQuantitySeats) o;

        if (facultyId != that.facultyId) return false;
        return quantitySeats == that.quantitySeats;

    }

    @Override
    public int hashCode() {
        int result = facultyId;
        result = 31 * result + quantitySeats;
        return result;
    }

    @Override
    public String toString() {
        return "FacultyQuantitySeats{" +
                "facultyId=" + facultyId +
                ", quantitySeats=" + quantitySeats +
                '}';
    }

    /**
     * class for build class FacultySubjects
     */
    public static class Builder{

        private int facultyId;
        private int quantitySeats;


        public Builder setFacultyId(int facultyId) {
            this.facultyId = facultyId;
            return this;
        }

        public Builder setQuantitySeats(int quantitySeats) {
            this.quantitySeats = quantitySeats;
            return this;
        }

        public FacultyQuantitySeats build() {
            FacultyQuantitySeats facultySubjects = new FacultyQuantitySeats();
            facultySubjects.setFacultyId(facultyId);
            facultySubjects.setQuantitySeats(quantitySeats);

            return facultySubjects;

        }


    }


}
