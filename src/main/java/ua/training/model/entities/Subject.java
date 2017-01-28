package ua.training.model.entities;

/**
 * Created by Kotov Nicholas on 25.01.2017.
 */

/**
 * The bean for the subject, which student have to pass.
 */
public class Subject extends Entity{
    /**
     * serialVersionUID
     */
    private static final long serialVersionUID = -1834683719186355656L;

    /**
     * id of subject.
     */
    private int id;
    /**
     * name of subject.
     */
    private String nameOfSubject;

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
     * Constructor.
     *
     * @param nameOfSubject
     */
    public Subject(String nameOfSubject) {
        this.nameOfSubject = nameOfSubject;
    }

    /**
     * Getter for the name of subject.
     *
     * @return String
     */
    public String getNameOfSubject() {
        return nameOfSubject;
    }

    /**
     * Setter for the name of subject.
     *
     * @param nameOfSubject
     */
    public void setNameOfSubject(String nameOfSubject) {
        this.nameOfSubject = nameOfSubject;
    }

    @Override
    public String toString() {
        return "Subject [nameOfSubject=" + nameOfSubject + "]";
    }

    /**
     * class for build class Subject
     */
    public static class Builder{

        private int id;
        private String nameOfSubject;


        public Builder setId(int id) {
            this.id = id;
            return this;
        }

        public Builder setNameOfSubject(String nameOfSubject) {
            this.nameOfSubject = nameOfSubject;
            return this;
        }

        public Faculty build(){
            Faculty faculty = new Faculty();
            faculty.setId(id);
            faculty.setNameOfFaculty(nameOfSubject);
            return faculty;

        }
    }



}
