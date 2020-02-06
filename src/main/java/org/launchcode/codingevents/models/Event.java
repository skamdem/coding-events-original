package org.launchcode.codingevents.models;

import javax.validation.constraints.Email;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.util.Objects;

/**
 * Created by Chris Bay
 */
public class Event {

    private int id;
    private static int nextId = 1;

    @NotBlank(message = "Name is required")
    @Size(min = 3, max = 50, message = "Name must be between 3 and 50 characters")
    private String name;

    @Size(max = 500, message = "Description too long!")
    private String description;

    @NotBlank(message = "Location is required")
    @Size(min = 2, max = 50, message = "Location must be between 2 and 50 characters")
    private String location;

    @Min(value = 1, message = "There must be at least 1 attendee")
    private int attendees;

    private boolean registrationMandatory;

    @NotBlank(message = "Email is required")
    @Email(message = "Invalid email. Try again.")
    private String contactEmail;

    public Event(String name, String description, String contactEmail,
                String location, int attendees, boolean registrationMandatory) {
        this();
        this.name = name;
        this.description = description;

        this.location = location;
        this.attendees = attendees;
        this.registrationMandatory = registrationMandatory;

        this.contactEmail = contactEmail;
    }

    public Event() {
        this.id = nextId;
        nextId++;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getContactEmail() {
        return contactEmail;
    }

    public void setContactEmail(String contactEmail) {
        this.contactEmail = contactEmail;
    }

    public int getId() {
        return id;
    }

    public String getLocation() {  return location;  }

    public void setLocation(String location) { this.location = location;  }

    public int getAttendees() { return attendees;  }

    public void setAttendees(int attendees) { this.attendees = attendees; }

    public boolean isRegistrationMandatory() {  return registrationMandatory;  }

    public void setRegistrationMandatory(boolean registrationMandatory) { this.registrationMandatory = registrationMandatory; }

    @Override
    public String toString() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Event event = (Event) o;
        return id == event.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
