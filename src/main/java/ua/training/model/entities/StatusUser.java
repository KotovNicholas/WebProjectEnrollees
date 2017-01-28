package ua.training.model.entities;

/**
 * Created by Kotov Nicholas on 25.01.2017.
 */

/**
 * User role type.
 */
public enum StatusUser {
    REQUEST, REQUESTACCEPTED, REQUESTDENIED, ACCEPTED, NOTACCEPTED;

    /**
     * getter for enum.
     * @return
     */
    public String getName(){
        return name().toLowerCase();
    }

}
