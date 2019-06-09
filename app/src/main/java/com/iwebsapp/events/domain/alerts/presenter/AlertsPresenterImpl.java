package com.iwebsapp.events.domain.alerts.presenter;

import com.iwebsapp.events.domain.alerts.interactor.AlertsInteractor;
import com.iwebsapp.events.domain.alerts.interactor.AlertsInteractorImpl;
import com.iwebsapp.events.domain.alerts.view.AlertsView;

public class AlertsPresenterImpl implements AlertsPresenter{
    private AlertsView view;
    private AlertsInteractor interactor;

    public AlertsPresenterImpl(AlertsView view) {
        this.view = view;
        interactor = new AlertsInteractorImpl(this);
    }
}
