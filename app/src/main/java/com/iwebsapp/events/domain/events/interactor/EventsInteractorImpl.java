package com.iwebsapp.events.domain.events.interactor;

import com.iwebsapp.events.domain.events.presenter.EventsPresenter;

public class EventsInteractorImpl implements EventsInteractor {
    private EventsPresenter presenter;

    public EventsInteractorImpl(EventsPresenter presenter) {
        this.presenter = presenter;
    }
}
