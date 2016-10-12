package controller;

public class MainUserScreenController extends MainScreenController {
    /**
     * Handles when the "Submit Availability Report" button is pressed
     */
    public void handleAvailabilityReportPressed() {
        getMainApplication().initDialogScreen("Create Water Availability Report", "waterAvailabilityReportScreen.fxml");
    }

    /**
     * Handles when the "View Availability Reports" button is pressed
     */
    public void handleViewAvailabilityReportsPressed() {
        getMainApplication().initDialogScreen("View Water Reports", "viewReportsScreen.fxml");
    }
}
