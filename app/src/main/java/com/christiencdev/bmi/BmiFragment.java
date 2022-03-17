package com.christiencdev.bmi;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class BmiFragment extends Fragment {

    //define component variables
    TextView result;

    public BmiFragment() {
        // Required empty public constructor - no need to code here
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        //link component to ids
        View view = inflater.inflate(R.layout.fragment_bmi, container, false);
        result = view.findViewById(R.id.textViewResult);

        //get data from Activity
        Bundle bundle = getArguments();
        int userWeight = bundle.getInt("weight");
        int userHeight = bundle.getInt("height");

        //calculate users BMI and returns it
        double userBMI = (userWeight * 1000) / (userHeight * userHeight) * 10;
        result.setText("Your BMI is: " + userBMI);
        return view;
    }
}