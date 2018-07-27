package com.mireya.eventsandroid.domain.profile.view;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.mireya.eventsandroid.R;
import com.mireya.eventsandroid.domain.profile.adapter.ProfileAdapter;
import com.mireya.eventsandroid.domain.profile.data.ProfileData;
import com.mireya.eventsandroid.domain.profile.presenter.ProfilePresenter;
import com.mireya.eventsandroid.domain.profile.presenter.ProfilePresenterImpl;

import java.util.ArrayList;
import java.util.List;

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
        List<ProfileData> teacherData = new ArrayList<>();
        //teacherData.add(new ProfileData("Mireya Jimenez Perez", "Programación Android"));
        teacherData.add(new ProfileData(1, R.drawable.ic_about, "Informacion"));
        teacherData.add(new ProfileData(2, R.drawable.avatar, "Configuracion"));


        RecyclerView recyclerView = view.findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext(), LinearLayoutManager.VERTICAL, false);
        recyclerView.setLayoutManager(linearLayoutManager);
        RecyclerView.Adapter adapter = new ProfileAdapter(getContext(), presenter, teacherData);
        recyclerView.setAdapter(adapter);
        Log.d(TAG, "profile fragment");
    }

}
