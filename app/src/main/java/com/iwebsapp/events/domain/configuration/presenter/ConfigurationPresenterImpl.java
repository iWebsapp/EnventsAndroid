package com.iwebsapp.events.domain.configuration.presenter;

import com.iwebsapp.events.domain.configuration.interactor.ConfigurationInteractor;
import com.iwebsapp.events.domain.configuration.interactor.ConfigurationInteractorImpl;
import com.iwebsapp.events.domain.configuration.view.ConfigurationView;

public class ConfigurationPresenterImpl implements ConfigurationPresenter {
    private ConfigurationView view;
    private ConfigurationInteractor interactor;

    public ConfigurationPresenterImpl(ConfigurationView view) {
        this.view = view;
        interactor = new ConfigurationInteractorImpl(this);
    }
}
