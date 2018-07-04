package com.mireya.eventsandroid.domain.account.create.interactor;

import com.mireya.eventsandroid.domain.account.create.presenter.CreateAccountPresenter;

public class CreateAccountInteractorImpl implements CreateAccountInteractor {
    private CreateAccountPresenter presenter;

    public CreateAccountInteractorImpl(CreateAccountPresenter presenter) {
        this.presenter = presenter;
    }
}
