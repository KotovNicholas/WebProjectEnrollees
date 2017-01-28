package ua.training.model.entities;

/**
 * Created by Plavun on 28.01.2017.
 */
public class UserFacultyStatus extends Entity {
    /**
     * serialVersionUID.
     */
    private static final long serialVersionUID = -7922014197391748685L;

    /**
     * userId user.
     */
    private int userId;

    /**
     * id of subject.
     */
    private int facultyId;

    /**
     * status of user.
     */
    private String statusUser;

    public UserFacultyStatus() {
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getFacultyId() {
        return facultyId;
    }

    public void setFacultyId(int facultyId) {
        this.facultyId = facultyId;
    }

    public String getStatusUser() {
        return statusUser;
    }

    public void setStatusUser(String statusUser) {
        this.statusUser = statusUser;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        UserFacultyStatus that = (UserFacultyStatus) o;

        if (userId != that.userId) return false;
        return facultyId == that.facultyId;

    }

    @Override
    public int hashCode() {
        int result = userId;
        result = 31 * result + facultyId;
        return result;
    }

    @Override
    public String toString() {
        return "UserFacultyStatus{" +
                "userId=" + userId +
                ", facultyId=" + facultyId +
                ", statusUser='" + statusUser + '\'' +
                '}';
    }

    /**
     * class for build class UserFacultyStatus
     */
    public static class Builder{

        private int userId;
        private int facultyId;
        private String statusUser;

        public Builder setUserId(int userId) {
            this.userId = userId;
            return this;
        }

        public Builder setFacultyId(int facultyId) {
            this.facultyId = facultyId;
            return this;
        }

        public Builder setStatusUser(String statusUser) {
            this.statusUser = statusUser;
            return this;
        }

        public UserFacultyStatus build() {
            UserFacultyStatus userFacultyStatus = new UserFacultyStatus();
            userFacultyStatus.setUserId(userId);
            userFacultyStatus.setFacultyId(facultyId);
            userFacultyStatus.setStatusUser(statusUser);

            return userFacultyStatus;
        }
    }
}
