package com.iwebsapp.events.domain.eventsDescription.interactor;

import com.iwebsapp.events.domain.eventsDescription.presenter.EventDescriptionPresenter;

public class EventDescriptionInteractorImpl implements EventDescriptionInteractor {
    private EventDescriptionPresenter presenter;

    public EventDescriptionInteractorImpl(EventDescriptionPresenter presenter) {
        this.presenter = presenter;
    }
}
