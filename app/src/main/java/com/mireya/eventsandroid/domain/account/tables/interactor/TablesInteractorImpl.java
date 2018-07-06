package com.mireya.eventsandroid.domain.account.tables.interactor;

import com.mireya.eventsandroid.domain.account.tables.presenter.TablesPresenter;

public class TablesInteractorImpl implements TablesInteractor {
    private TablesPresenter presenter;

    public TablesInteractorImpl(TablesPresenter presenter) {
        this.presenter = presenter;
    }
}
