package com.example.fragment;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class dummyFragment extends Fragment {
    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        Log.i("Fragment", "onAttach: ");
        Log.d("Fragment", "onAttach: ");
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.dummyfragment,container,false);
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.i("fragment! ", "onCreate: ");
    }

    @Override
    public void onStop() {
        super.onStop();
        Log.i("fragment!", "onStop: ");
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.i("fragment!", "onDestroy: ");
    }

    @Override
    public void onResume() {
        super.onResume();
        Log.i("fragment!", "onResume: ");
    }

    @Override
    public void onStart() {
        super.onStart();
        Log.i("fragment", "onStart: ");
    }
}
