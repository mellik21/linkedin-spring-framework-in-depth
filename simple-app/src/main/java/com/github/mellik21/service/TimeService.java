package com.github.mellik21.service;

import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;

@Service
@Getter
@NoArgsConstructor
public class TimeService {
    @Value("#{new Boolean(environment['spring.profiles.active']!='dev')}")
    private boolean is24;

    public String getTime() {
        OffsetDateTime odt = OffsetDateTime.now();
        return is24 ?
                DateTimeFormatter.ofPattern("HH:mm:ss").format(odt)
                : DateTimeFormatter.ofPattern("hh:mm:ss a").format(odt);

    }
}
