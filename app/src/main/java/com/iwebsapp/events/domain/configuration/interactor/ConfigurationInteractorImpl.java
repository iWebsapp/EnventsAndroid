package com.iwebsapp.events.domain.configuration.interactor;

import com.iwebsapp.events.domain.configuration.presenter.ConfigurationPresenter;

public class ConfigurationInteractorImpl implements ConfigurationInteractor {
    private ConfigurationPresenter presenter;

    public ConfigurationInteractorImpl(ConfigurationPresenter presenter) {
        this.presenter = presenter;
    }
}
