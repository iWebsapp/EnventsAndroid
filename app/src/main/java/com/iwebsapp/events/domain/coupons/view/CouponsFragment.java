package com.iwebsapp.events.domain.coupons.view;


import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.iwebsapp.events.R;
import com.iwebsapp.events.domain.coupons.presenter.CouponsPresenter;
import com.iwebsapp.events.domain.coupons.presenter.CouponsPresenterImpl;

public class CouponsFragment extends Fragment implements CouponsPresenter {
    private CouponsPresenter presenter;
    public static String IDENTIFIER = "COUPONS_FRAGMENT";

    public CouponsFragment() { }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
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
    }

}
