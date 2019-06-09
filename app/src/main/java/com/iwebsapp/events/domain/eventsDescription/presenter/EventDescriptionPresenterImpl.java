package com.iwebsapp.events.domain.eventsDescription.presenter;

import com.iwebsapp.events.domain.eventsDescription.interactor.EventDescriptionInteractor;
import com.iwebsapp.events.domain.eventsDescription.interactor.EventDescriptionInteractorImpl;
import com.iwebsapp.events.domain.eventsDescription.view.EventDescriptionView;

public class EventDescriptionPresenterImpl implements EventDescriptionPresenter {
    private EventDescriptionView view;
    private EventDescriptionInteractor interactor;

    public EventDescriptionPresenterImpl(EventDescriptionView view) {
        this.view = view;
        interactor = new EventDescriptionInteractorImpl(this);
    }

    @Override
    public void goProducts() {
        view.goProducts();
    }
}
