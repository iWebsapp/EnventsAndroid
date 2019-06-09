package com.iwebsapp.events.domain.cart.view;


import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.iwebsapp.events.R;
import com.iwebsapp.events.domain.cart.presenter.CartPresenter;
import com.iwebsapp.events.domain.cart.presenter.CartPresenterImpl;

public class CartFragment extends Fragment implements CartPresenter {
    private CartPresenter presenter;
    public static String IDENTIFIER = "CART_FRAGMENT";

    public CartFragment() { }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_cart, container, false);
        setUpVariable();
        setUpView(view);
        return view;
    }

    private void setUpVariable() {
        if (presenter == null){
            presenter = new CartPresenterImpl(this);
        }
    }

    private void setUpView(View view) {
    }

}
