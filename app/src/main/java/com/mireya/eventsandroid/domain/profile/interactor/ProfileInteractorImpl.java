package com.mireya.eventsandroid.domain.profile.interactor;

import com.mireya.eventsandroid.domain.profile.presenter.ProfilePresenter;

public class ProfileInteractorImpl implements ProfileInteractor{
    private ProfilePresenter presenter;

    public ProfileInteractorImpl(ProfilePresenter presenter) {
        this.presenter = presenter;
    }
}
