package com.company.amir;

import java.util.ArrayList;
import java.util.List;

public class YoutubeChannel implements Subject{

    List<ChannelObserver> observers;
    List<String> videos;
    String name;

    public YoutubeChannel(String ChannelName){
        this.name = ChannelName;
        observers = new ArrayList<>();
        videos = new ArrayList<>();
    }

    public void addVideo(String name){
        videos.add(name);
        notifyObservers();
    }

    @Override
    public void register(ChannelObserver observer) {
        observers.add(observer);
    }

    @Override
    public void unregister(ChannelObserver observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for(ChannelObserver observer : observers){
            observer.update(this.name, videos);
        }
    }
}
