package com.mireya.eventsandroid.domain.account.login.presenter;

import com.mireya.eventsandroid.domain.account.login.interactor.LoginInteractor;
import com.mireya.eventsandroid.domain.account.login.interactor.LoginInteractorImpl;
import com.mireya.eventsandroid.domain.account.login.view.LoginView;

public class LoginPresenterImpl implements LoginPresenter {
    private LoginInteractor interactor;
    private LoginView view;

    public LoginPresenterImpl(LoginView view) {
        this.view = view;
        interactor = new LoginInteractorImpl(this);
    }

    @Override
    public void createAccount() {
        view.createAccount();
    }

    @Override
    public void goMenu() {
        view.goMenu();
    }
}
