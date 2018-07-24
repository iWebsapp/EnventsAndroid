package com.mireya.eventsandroid.domain.shopping.view;

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
import com.mireya.eventsandroid.domain.shopping.presenter.ShoppingPresenter;
import com.mireya.eventsandroid.domain.shopping.presenter.ShoppingPresenterImpl;

public class ShoppingFragment extends Fragment implements ShoppingView{
    public ShoppingPresenter presenter;
    public static String IDENTIFIER = "SHOPPING_FRAGMENT";
    private final String TAG= this.getClass().getSimpleName();

    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_shopping, container, false);
        setUpVariable();
        setUpView(view);
        return view;
    }

    private void setUpVariable() {
        if (presenter == null){
            presenter = new ShoppingPresenterImpl(this);
        }
    }

    private void setUpView(View view) {
        Log.d(TAG, "profile fragment");
    }
}
