package com.example.android.sunshine.data;

import android.net.Uri;
import android.provider.BaseColumns;

public class WeatherContract {

    public static final String CONTENT_AUTHORITY = "com.example.android.sunshine";
    public static final Uri BASE_CONTENT_URI = Uri.parse("content://" + CONTENT_AUTHORITY);
    public static final String PATH_WEATHER = "weather";

    public static final class WeatherEntry implements BaseColumns {
        public static final String TABLE_NAME = "weather";
        public static final String COLUMN_DATE = "date";
        public static final String COLUMN_WEATHER_ID = "weather_id";
        public static final String COLUMN_MIN_TEMP = "min";
        public static final String COLUMN_MAX_TEMP = "max";
        public static final String COLUMN_HUMIDITY = "humidity";
        public static final String COLUMN_PRESSURE = "preassure";
        public static final String COLUMN_WIND_SPEED = "wind";
        public static final String COLUMN_DEGREES = "degrees";
    }

}
