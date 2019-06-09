package com.iwebsapp.events.domain.profile.view;


import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.iwebsapp.events.R;
import com.iwebsapp.events.domain.configuration.view.ConfigurationActivity;
import com.iwebsapp.events.domain.events.view.EventsActivity;
import com.iwebsapp.events.domain.profile.aboutUs.AboutUsActivity;
import com.iwebsapp.events.domain.profile.adapter.ProfileAdapter;
import com.iwebsapp.events.domain.profile.data.ProfileData;
import com.iwebsapp.events.domain.profile.presenter.ProfilePresenter;
import com.iwebsapp.events.domain.profile.presenter.ProfilePresenterImpl;

import java.util.ArrayList;
import java.util.List;

public class ProfileFragment extends Fragment implements ProfilePresenter {
    private ProfilePresenter presenter;
    public static String IDENTIFIER = "PROFILE_FRAGMENT";

    public ProfileFragment() { }


    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_profile, container, false);
        setUpVariable();
        setUpView(view);
        return  view;
    }


    private void setUpVariable() {
        if (presenter == null){
            presenter = new ProfilePresenterImpl(this);
        }
    }

    private void setUpView(View view) {
        List<ProfileData> profileData = new ArrayList<>();
        profileData.add(new ProfileData(1, R.drawable.ic_settings, R.string.configuration));
        profileData.add(new ProfileData(2, R.drawable.ic_event, R.string.myEvent));
        profileData.add(new ProfileData(3, R.drawable.ic_about, R.string.aboutUs));
        profileData.add(new ProfileData(4, R.drawable.ic_report, R.string.reportProblem));
        profileData.add(new ProfileData(5, R.drawable.ic_help, R.string.help));
        profileData.add(new ProfileData(6, R.drawable.ic_conditions, R.string.privacy));
        profileData.add(new ProfileData(7, R.drawable.ic_logout, R.string.logout));

        RecyclerView recyclerView = view.findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext(), LinearLayoutManager.VERTICAL, false);
        recyclerView.setLayoutManager(linearLayoutManager);
        RecyclerView.Adapter adapter = new ProfileAdapter(getContext(), presenter, profileData);
        recyclerView.setAdapter(adapter);
    }

    @Override
    public void goConfiguration() {
        Intent intent = new Intent(getContext(), ConfigurationActivity.class);
        startActivity(intent);
    }

    @Override
    public void goAboutUs() {
        Intent intent = new Intent(getContext(), AboutUsActivity.class);
        startActivity(intent);
    }

    @Override
    public void goEvent() {
        Intent intent = new Intent(getContext(), EventsActivity.class);
        startActivity(intent);
    }
}
