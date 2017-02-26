package iitd.mavi.signboardguide;


import com.google.android.gms.maps.model.LatLng;

import java.util.HashMap;

/**
 * Constants used in this sample.
 */
public final class Constants {

    private Constants() {
    }

    public static final String PACKAGE_NAME = "com.google.android.gms.location.Geofence";

    public static final String SHARED_PREFERENCES_NAME = PACKAGE_NAME + ".SHARED_PREFERENCES_NAME";

    public static final String GEOFENCES_ADDED_KEY = PACKAGE_NAME + ".GEOFENCES_ADDED_KEY";

    /**
     * Used to set an expiration time for a geofence. After this amount of time Location Services
     * stops tracking the geofence.
     */
    public static final long GEOFENCE_EXPIRATION_IN_HOURS = 12;

    /**
     * For this sample, geofences expire after twelve hours.
     */
    public static final long GEOFENCE_EXPIRATION_IN_MILLISECONDS =
            GEOFENCE_EXPIRATION_IN_HOURS * 60 * 60 * 1000;
    public static final float GEOFENCE_RADIUS_IN_METERS = 100; // 1 mile, 1.6 km

    /**
     * Map for storing information about airports in the San Francisco bay area.
     */
    public static final HashMap<String, LatLng> BAY_AREA_LANDMARKS = new HashMap<String, LatLng>();
    static {
        // San Francisco International Airport.
        // BAY_AREA_LANDMARKS.put("SFO", new LatLng(37.621313, -122.378955));

        // Googleplex.
        //BAY_AREA_LANDMARKS.put("GOOGLE", new LatLng(37.422611,-122.0840577));
        BAY_AREA_LANDMARKS.put("HOME C Block", new LatLng(28.56136205093897,77.25801587104797));
        BAY_AREA_LANDMARKS.put("CBLOCK Market" , new LatLng(28.559288927262056,77.25696444511414));
        BAY_AREA_LANDMARKS.put("ISCOkn temple" , new LatLng(28.556659770786336,77.25372433662415));
        BAY_AREA_LANDMARKS.put("Garhi market", new LatLng(28.55740423394353,77.25315034389496));
    }
}
