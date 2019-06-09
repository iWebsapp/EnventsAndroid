package com.iwebsapp.events.domain.profile.interactor;

import com.iwebsapp.events.domain.profile.presenter.ProfilePresenter;

public class ProfileInteractorImpl implements ProfileInteractor{
    private ProfilePresenter presenter;

    public ProfileInteractorImpl(ProfilePresenter presenter) {
        this.presenter = presenter;
    }
}
