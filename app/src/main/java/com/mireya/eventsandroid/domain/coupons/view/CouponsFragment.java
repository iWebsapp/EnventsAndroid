package com.mireya.eventsandroid.domain.coupons.view;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.mireya.eventsandroid.R;
import com.mireya.eventsandroid.domain.coupons.presenter.CouponsPresenter;
import com.mireya.eventsandroid.domain.coupons.presenter.CouponsPresenterImpl;

public class CouponsFragment extends Fragment implements CouponsView{
    public CouponsPresenter presenter;
    public static String IDENTIFIER = "COUPONS_FRAGMENT";
    private final String TAG= this.getClass().getSimpleName();

    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_coupons, container, false);
        setUpVariable();
        setUpView(view);
        return view;
    }

    private void setUpVariable() {
        if (presenter == null){
            presenter = new CouponsPresenterImpl(this);
        }
    }

    private void setUpView(View view) {
        Log.d(TAG, "profile fragment");
    }
}
