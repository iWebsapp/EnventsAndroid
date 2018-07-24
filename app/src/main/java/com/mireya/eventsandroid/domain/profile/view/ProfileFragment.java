package com.mireya.eventsandroid.domain.profile.view;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.mireya.eventsandroid.R;
import com.mireya.eventsandroid.domain.profile.presenter.ProfilePresenter;
import com.mireya.eventsandroid.domain.profile.presenter.ProfilePresenterImpl;

public class ProfileFragment extends Fragment implements ProfileView{
    public ProfilePresenter presenter;
    public static String IDENTIFIER = "PROFILE_FRAGMENT";
    private final String TAG= this.getClass().getSimpleName();

    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_profile, container, false);
        setUpVariable();
        setUpView(view);
        return view;
    }

    private void setUpVariable() {
        if (presenter == null){
            presenter = new ProfilePresenterImpl(this);
        }
    }

    private void setUpView(View view) {
        Log.d(TAG, "profile fragment");
    }

}
