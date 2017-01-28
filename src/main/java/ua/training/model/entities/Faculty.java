package ua.training.model.entities;

/**
 * Created by Kotov Nicholas on 25.01.2017.
 */

/**
 * This class is the bean for the entity of faculty.
 */
public class Faculty extends Entity {
    /**
     * serialVersionUID.
     */
    private static final long serialVersionUID = -4086480183665579660L;

    /**
     * Field id.
     */
    private int id;
    /**
     * Field name of faculty.
     */
    private String nameOfFaculty;

    /**
     * Field total Seats.
     */
    private int seats;

    public Faculty() {
    }

    /**
     * Getter for the id.
     * @return int
     */
    public int getId() {
        return id;
    }

    /**
     * Setter for id.
     * @param id
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Getter for the name of faculty.
     *
     * @return String
     */
    public String getNameOfFaculty() {
        return nameOfFaculty;
    }

    /**
     * Setter for the name of faculty.
     *
     * @param nameOfFaculty
     */
    public void setNameOfFaculty(String nameOfFaculty) {
        this.nameOfFaculty = nameOfFaculty;
    }

    /**
     * Getter for number of total places on the faculty.
     *
     * @return int
     */
    public int getSeats() {
        return seats;
    }

    /**
     * Setter for the number of total places.
     *
     * @param seats
     */
    public void setSeats(int seats) {
        this.seats = seats;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Faculty faculty = (Faculty) o;

        return id == faculty.id;

    }

    @Override
    public int hashCode() {
        return id;
    }

    @Override
    public String toString() {
        return "Faculty{" +
                "id=" + id +
                ", nameOfFaculty='" + nameOfFaculty + '\'' +
                ", seats=" + seats +
                '}';
    }

    /**
     * class for build class Faculty
     */
    public static class Builder{

        private int id;
        private String nameOfFaculty;
        private int seats;


        public Builder setId(int id) {
            this.id = id;
            return this;
        }

        public Builder setNameOfFaculty(String nameOfFaculty) {
            this.nameOfFaculty = nameOfFaculty;
            return this;
        }

        public Builder setSeats(int seats) {
            this.seats = seats;
            return this;
        }

        public Faculty build(){
            Faculty faculty = new Faculty();
            faculty.setId(id);
            faculty.setNameOfFaculty(nameOfFaculty);
            faculty.setSeats(seats);
            return faculty;

        }
    }
}

