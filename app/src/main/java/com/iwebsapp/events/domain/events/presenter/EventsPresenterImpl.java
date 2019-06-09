package com.iwebsapp.events.domain.events.presenter;

import com.iwebsapp.events.domain.events.interactor.EventsInteractor;
import com.iwebsapp.events.domain.events.interactor.EventsInteractorImpl;
import com.iwebsapp.events.domain.events.view.EventsView;

public class EventsPresenterImpl implements EventsPresenter{
    private EventsView view;
    private EventsInteractor interactor;

    public EventsPresenterImpl(EventsView view) {
        this.view = view;
        interactor = new EventsInteractorImpl(this);
    }

    @Override
    public void goEventDescription() {
        view.goEventDescription();
    }
}
