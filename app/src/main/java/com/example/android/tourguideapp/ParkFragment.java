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
public class ParkFragment extends Fragment {


    public ParkFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.word_list, container, false);
        final ArrayList<Tour> words = new ArrayList<Tour>();
        words.add(new Tour("Central Park Rajiv Chowk", " Rajiv Chowk metro station",  R.string.des_central, R.drawable.central));
        words.add(new Tour("Garden of Five Senses", "Saidul Ajaib Village",  R.string.des_five, R.drawable.garden));
        words.add(new Tour("Deer Park", "South Delhi",  R.string.des_deer, R.drawable.deer));
        words.add(new Tour("India Gate Lawns", "Rajpath Marg",  R.string.des_india, R.drawable.india));

        TourAdapter adapter = new TourAdapter(getActivity(), words, R.color.historic_site);

        ListView listView = (ListView) rootView.findViewById(R.id.list);

        listView.setAdapter(adapter);

        return rootView;


    }


}
