package com.vmodev.training.multithreading.synchronization.livelock;

public class CommonResource {
    private Worker owner;

    public CommonResource (Worker d) {
        owner = d;
    }

    public synchronized Worker getOwner () {
        return owner;
    }

    public synchronized void setOwner (Worker d) {
        owner = d;
    }
}
