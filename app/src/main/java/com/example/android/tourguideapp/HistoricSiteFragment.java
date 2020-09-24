package com.example.android.tourguideapp;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class HistoricSiteFragment extends Fragment {


    public HistoricSiteFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.word_list, container, false);
        final ArrayList<Tour> words = new ArrayList<Tour>();
        words.add(new Tour("Red Fort", "Fourt in Delhi,India", R.string.description, R.drawable.redfort));
        words.add(new Tour("Qutub Minar", "5-storey victory tower ", R.string.des_qutub, R.drawable.qutubminar));
        words.add(new Tour("Humayun’s Tomb", "Historical landmark in New Delhi", R.string.des_tomb, R.drawable.humayuntomb));
        words.add(new Tour("India Gate", "1920s triumphal arch ", R.string.des_gate, R.drawable.indiagate));

        TourAdapter adapter = new TourAdapter(getActivity(), words, R.color.historic_site);

        ListView listView = (ListView) rootView.findViewById(R.id.list);

        listView.setAdapter(adapter);

        return rootView;


    }

}
