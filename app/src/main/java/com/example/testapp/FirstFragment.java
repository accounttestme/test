package com.example.testapp;

import android.os.Bundle;
import android.os.SystemClock;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

public class FirstFragment extends Fragment {

    @Override
    public View onCreateView(
            LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState
    ) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_first, container, false);
    }

    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        view.findViewById(R.id.button_first).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                long start = SystemClock.elapsedRealtimeNanos();
                String viewLocation = getViewLocation(view);
                Log.d("test", "btn2: " + viewLocation + ", time cost: "
                        + (SystemClock.elapsedRealtimeNanos() - start) / 1000 + "us");
            }
        });

        view.findViewById(R.id.button_second).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                long start = SystemClock.elapsedRealtimeNanos();
                String viewLocation = getViewLocation(view);
                Log.d("test", "btn2: " + viewLocation + ", time cost: "
                        + (SystemClock.elapsedRealtimeNanos() - start) / 1000 + "us");
            }
        });

    }

    private static String getViewLocation(final View view) {
        //todo
        return "";
    }
}
