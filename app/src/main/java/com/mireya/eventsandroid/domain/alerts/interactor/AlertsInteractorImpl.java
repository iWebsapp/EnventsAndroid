package com.mireya.eventsandroid.domain.alerts.interactor;

import com.mireya.eventsandroid.domain.alerts.presenter.AlertsPresenter;

public class AlertsInteractorImpl implements AlertsInteractor {
    public AlertsPresenter presenter;

    public AlertsInteractorImpl(AlertsPresenter presenter) {
        this.presenter = presenter;
    }
}
