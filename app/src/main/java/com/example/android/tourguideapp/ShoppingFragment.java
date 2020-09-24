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
public class ShoppingFragment extends Fragment {


    public ShoppingFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.word_list, container, false);
        final ArrayList<Tour> words = new ArrayList<Tour>();
        words.add(new Tour("Chandni Chowk", "Ancient shopping region",  R.string.des_chandni, R.drawable.chandanichowk));
        words.add(new Tour("Sarojini Market", "Thriving market",  R.string.des_sarojini, R.drawable.sarojininagar));
        words.add(new Tour("Karol Bagh Market", "Oldest shopping area", R.string.des_karol, R.drawable.karol));
        words.add(new Tour("Connaught Place", "Outlets of all brands",  R.string.des_place, R.drawable.place));

        TourAdapter adapter = new TourAdapter(getActivity(), words, R.color.historic_site);

        ListView listView = (ListView) rootView.findViewById(R.id.list);

        listView.setAdapter(adapter);

        return rootView;



    }

}
