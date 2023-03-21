package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.mapbox.api.directions.v5.MapboxDirections;
import com.mapbox.api.directions.v5.models.RouteOptions;
import com.mapbox.geojson.Point;
import com.mapbox.maps.MapView;
import com.mapbox.navigation.base.route.NavigationRoute;
import com.mapbox.navigation.core.MapboxNavigation;
import com.mapbox.navigation.core.lifecycle.MapboxNavigationApp;

import java.util.ArrayList;
import java.util.List;


public class MainActivity extends AppCompatActivity {
    MapView mapView;
//    Point orign = Point.fromLngLat(-77,38);
//    Point destination = Point.fromLngLat(-78,38);
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
//        List<Point> list = new ArrayList<>();
//        list.add(orign);
//        list.add(destination);
        setContentView(R.layout.activity_main);



    }


}