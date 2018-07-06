package com.mireya.eventsandroid.domain.account.login.interactor;

import com.mireya.eventsandroid.domain.account.login.presenter.LoginPresenter;

public class LoginInteractorImpl implements LoginInteractor {
    private LoginPresenter presenter;

    public LoginInteractorImpl(LoginPresenter presenter) {
        this.presenter = presenter;
    }
}
