package com.company.amir;

import java.util.List;

public class Subscriber implements ChannelObserver{

    private String name;

    public Subscriber(String name){
        this.name = name;
    }

    @Override
    public void update(String name, List<String> videos) {
        System.out.println(this.name + ": " + name + " uploaded a new video called " + videos.get(videos.size()-1));
    }
}
