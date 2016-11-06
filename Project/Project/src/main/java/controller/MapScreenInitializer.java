package controller;

import com.lynden.gmapsfx.GoogleMapView;
import fxapp.MainApplication;

public interface MapScreenInitializer {
    void initializeMap(GoogleMapView mapView, MainApplication mainApplication);
}
