package com.example.tacademy.myfragmenttabpractice;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTabHost;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


/**
 * A simple {@link Fragment} subclass.
 */
public class Tab1Fragment extends Fragment {


    public Tab1Fragment() {
        // Required empty public constructor
    }

    FragmentTabHost tabHost;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_tab1, container, false);
        tabHost = (FragmentTabHost)v.findViewById(R.id.tabHost);
        tabHost.setup(getActivity(), getChildFragmentManager(), R.id.realtabcontent);

        tabHost.addTab(tabHost.newTabSpec("child_tab1").setIndicator("CHILD_TAB1"), Tab1ChildTab1Fragment.class, null);
        tabHost.addTab(tabHost.newTabSpec("child_tab2").setIndicator("CHILD_TAB2"), Tab1ChildTab2Fragment.class, null);

        return v;
    }


}
