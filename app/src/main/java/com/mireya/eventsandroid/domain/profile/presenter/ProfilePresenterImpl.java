package com.mireya.eventsandroid.domain.profile.presenter;

import com.mireya.eventsandroid.domain.profile.interactor.ProfileInteractor;
import com.mireya.eventsandroid.domain.profile.interactor.ProfileInteractorImpl;
import com.mireya.eventsandroid.domain.profile.view.ProfileView;

public class ProfilePresenterImpl implements ProfilePresenter {
    public ProfileInteractor interactor;
    public ProfileView view;

    public ProfilePresenterImpl(ProfileView view) {
        this.view = view;
        interactor = new ProfileInteractorImpl(this);
    }

    @Override
    public void goConfiguration() {
        view.goConfiguration();
    }

    @Override
    public void goPrivacy() {
        view.goPrivacy();
    }
}
