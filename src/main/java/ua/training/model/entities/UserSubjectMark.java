package ua.training.model.entities;

/**
 * Created by Plavun on 28.01.2017.
 */
public class UserSubjectMark extends Entity {

    /**
     * serialVersionUID.
     */
    private static final long serialVersionUID = -7922014538791748685L;

    /**
     * userId user.
     */
    private int userId;

    /**
     * id of subject.
     */
    private int subjectId;

    /**
     * id of mark.
     */
    private int mark;

    public UserSubjectMark() {
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getSubjectId() {
        return subjectId;
    }

    public void setSubjectId(int subjectId) {
        this.subjectId = subjectId;
    }

    public int getMark() {
        return mark;
    }

    public void setMark(int mark) {
        this.mark = mark;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        UserSubjectMark that = (UserSubjectMark) o;

        if (userId != that.userId) return false;
        if (subjectId != that.subjectId) return false;
        return mark == that.mark;

    }

    @Override
    public int hashCode() {
        int result = userId;
        result = 31 * result + subjectId;
        result = 31 * result + mark;
        return result;
    }

    /**
     * class for build class UserSubjectMark
     */
    public static class Builder{

        private int userId;
        private int subjectId;
        private int mark;

        public Builder setUserId(int userId) {
            this.userId = userId;
            return this;
        }

        public Builder setSubjectId(int subjectId) {
            this.subjectId = subjectId;
            return this;
        }

        public Builder setMark(int mark) {
            this.mark = mark;
            return this;
        }

        public UserSubjectMark build() {
            UserSubjectMark userSubjectMark = new UserSubjectMark();
            userSubjectMark.setUserId(userId);
            userSubjectMark.setSubjectId(subjectId);
            userSubjectMark.setMark(mark);

            return userSubjectMark;
        }
    }

}
