package com.mireya.eventsandroid.domain.alerts.presenter;

import com.mireya.eventsandroid.domain.alerts.interactor.AlertsInteractor;
import com.mireya.eventsandroid.domain.alerts.interactor.AlertsInteractorImpl;
import com.mireya.eventsandroid.domain.alerts.view.AlertView;

public class AlertsPresenterImpl implements AlertsPresenter {
    public AlertsInteractor interactor;
    public AlertView view;

    public AlertsPresenterImpl(AlertView view) {
        this.view = view;
        interactor = new AlertsInteractorImpl(this);
    }
}
