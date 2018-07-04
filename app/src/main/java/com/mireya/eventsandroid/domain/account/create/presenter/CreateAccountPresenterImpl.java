package com.mireya.eventsandroid.domain.account.create.presenter;

import com.mireya.eventsandroid.domain.account.create.interactor.CreateAccountInteractor;
import com.mireya.eventsandroid.domain.account.create.interactor.CreateAccountInteractorImpl;
import com.mireya.eventsandroid.domain.account.create.view.CreateAccountView;

public class CreateAccountPresenterImpl implements CreateAccountPresenter{
    private CreateAccountInteractor interactor;
    private CreateAccountView view;

    public CreateAccountPresenterImpl(CreateAccountView view) {
        this.view = view;
        interactor = new CreateAccountInteractorImpl(this);
    }
}
