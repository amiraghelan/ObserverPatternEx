package com.company.amir;

import java.util.List;

public interface ChannelObserver {
    void update(String name, List<String> videos);

}
