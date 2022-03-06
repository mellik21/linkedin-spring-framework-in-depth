package com.github.mellik21.service;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalTime;

@Getter
@Setter
public class TimeService {
    private boolean is24;

    public TimeService(boolean is24) {
        this.is24 = is24;
    }

    public LocalTime getTime(){
        return LocalTime.now();
    }
}
