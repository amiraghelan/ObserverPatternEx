package com.company.amir;

public class Main {

    public static void main(String[] args) {
        YoutubeChannel channel = new YoutubeChannel("mr.beast");

        Subscriber s1 = new Subscriber("amir");
        Subscriber s2 = new Subscriber("ali");

        channel.register(s1);
        channel.register(s2);

        channel.addVideo("video 1");

        channel.unregister(s2);

        channel.addVideo("Video 2 specially amir");

    }
}
