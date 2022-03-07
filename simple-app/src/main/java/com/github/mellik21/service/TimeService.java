package com.github.mellik21.service;

import lombok.Getter;
import lombok.Setter;

import java.text.SimpleDateFormat;
import java.time.LocalTime;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAmount;
import java.util.Locale;

@Getter
@Setter
public class TimeService {
    private boolean is24;

    public TimeService(boolean is24) {
        this.is24 = is24;
    }

    public String getTime() {
        OffsetDateTime odt = OffsetDateTime.MAX;
        System.out.println(is24);
        return is24 ?
                DateTimeFormatter.ofPattern("HH:mm:ss").format(odt)
                : DateTimeFormatter.ofPattern("hh:mm:ss a").format(odt);


    }
}
