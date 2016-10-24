package model.log;

public class SecurityIncidentUnblocked extends SecurityIncident {
    private String unblockedUsername;

    public SecurityIncidentUnblocked(String admin, String unblocked) {
        super(admin);
        unblockedUsername = unblocked;
    }

    public String toString() {
        return "Account unblocked at " + timestamp.toString() +
                " -- adminID:" + username +
                ", unblockedID:" + unblockedUsername;
    }
}