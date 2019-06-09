package com.iwebsapp.events.domain.profile.presenter;

import com.iwebsapp.events.domain.profile.interactor.ProfileInteractor;
import com.iwebsapp.events.domain.profile.interactor.ProfileInteractorImpl;
import com.iwebsapp.events.domain.profile.view.ProfileView;

public class ProfilePresenterImpl implements ProfilePresenter {
    private ProfileView view;
    private ProfileInteractor interactor;

    public ProfilePresenterImpl(ProfileView view) {
        this.view = view;
        interactor = new ProfileInteractorImpl(this);
    }

    @Override
    public void goConfiguration() {
        view.goConfiguration();
    }

    @Override
    public void goAboutUs() {
        view.goAboutUs();
    }

    @Override
    public void goEvent() {
        view.goEvent();
    }
}
