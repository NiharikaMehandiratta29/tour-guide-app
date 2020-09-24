package com.example.android.tourguideapp;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class RestaurantFragment extends Fragment {


    public RestaurantFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.word_list, container, false);
        final ArrayList<Tour> words = new ArrayList<Tour>();
        words.add(new Tour("Indian Accent", " Lodhi Rd, CGO Complex",  R.string.des_accent, R.drawable.indianaccent));
        words.add(new Tour("Sorrento", "Italian restaurant",  R.string.des_sorrento, R.drawable.sorrento));
        words.add(new Tour("The Pavilion", "North Indian restaurant",  R.string.des_pavilion, R.drawable.pavilion));
        words.add(new Tour("Orient Express", "Restaurant", R.string.des_orient, R.drawable.orient));

        TourAdapter adapter = new TourAdapter(getActivity(), words, R.color.historic_site);

        ListView listView = (ListView) rootView.findViewById(R.id.list);

        listView.setAdapter(adapter);

        return rootView;


    }

}

