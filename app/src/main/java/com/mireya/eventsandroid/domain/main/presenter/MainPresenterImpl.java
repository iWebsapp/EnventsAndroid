package com.mireya.eventsandroid.domain.main.presenter;

import com.mireya.eventsandroid.domain.main.interactor.MainInteractor;
import com.mireya.eventsandroid.domain.main.interactor.MainInteractorImpl;
import com.mireya.eventsandroid.domain.main.view.MainView;

public class MainPresenterImpl implements MainPresenter {
    private MainInteractor interactor;
    private MainView view;

    public MainPresenterImpl(MainView view) {
        this.view = view;
        interactor = new MainInteractorImpl(this);
    }
}
