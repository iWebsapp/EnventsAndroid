package com.iwebsapp.events.domain.alerts.interactor;

import com.iwebsapp.events.domain.alerts.presenter.AlertsPresenter;

public class AlertsInteractorImpl implements AlertsInteractor {
    private AlertsPresenter presenter;

    public AlertsInteractorImpl(AlertsPresenter presenter) {
        this.presenter = presenter;
    }
}
