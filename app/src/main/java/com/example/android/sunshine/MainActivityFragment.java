package com.example.android.sunshine;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


/**
 * A placeholder fragment containing a simple view.
 */
public class MainActivityFragment extends Fragment {

    ArrayAdapter<String> forecastAdapter;

    public MainActivityFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        String[] forecastArray = {
                "Today - Sunny - 88/60",
                "Tomorrow - Cloudy - 65/62",
                "Weds - Sunny - 90/80",
                "Thurs - Snow - 40/30",
                "Fri - Snow - 30/20",
                "Sat - Sunny - 75/60"
        };

        List<String> weekForecast = new ArrayList<String>(Arrays.asList(forecastArray));

        forecastAdapter = new ArrayAdapter<String>(
                getActivity(), // current context (this activity)
                R.layout.list_item_forecast,  // name of the layout id
                R.id.list_item_forecast_textview, // id of the textview to populate
                weekForecast
        );

        View rootView = inflater.inflate(R.layout.fragment_main, container, false);

        ListView listView = (ListView) rootView.findViewById(R.id.listview_forecast);
        listView.setAdapter(forecastAdapter);

        return rootView;
    }
}
