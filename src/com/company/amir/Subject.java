package com.company.amir;

public interface Subject {
    void register(ChannelObserver observer);
    void unregister(ChannelObserver observer);
    void notifyObservers();
}
