package com.mireya.eventsandroid.domain.account.tables.presenter;

import com.mireya.eventsandroid.domain.account.tables.interactor.TablesInteractor;
import com.mireya.eventsandroid.domain.account.tables.interactor.TablesInteractorImpl;
import com.mireya.eventsandroid.domain.account.tables.view.TablesView;

public class TablesPresenterImpl implements TablesPresenter {
    private TablesInteractor interactor;
    private TablesView view;

    public TablesPresenterImpl(TablesView view) {
        this.view = view;
        interactor = new TablesInteractorImpl(this);
    }
}
