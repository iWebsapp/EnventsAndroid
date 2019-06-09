package com.iwebsapp.events.domain.main.presenter;

import com.iwebsapp.events.domain.main.interactor.MainInteractor;
import com.iwebsapp.events.domain.main.interactor.MainInteractorImpl;
import com.iwebsapp.events.domain.main.view.MainView;

public class MainPresenterImpl implements MainPresenter{
    private MainView view;
    private MainInteractor interactor;

    public MainPresenterImpl(MainView view) {
        this.view = view;
        interactor = new MainInteractorImpl(this);
    }
}
