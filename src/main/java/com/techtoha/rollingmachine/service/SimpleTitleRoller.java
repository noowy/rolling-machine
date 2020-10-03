package com.techtoha.rollingmachine.service;

import com.techtoha.rollingmachine.domain.Title;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Service
public class SimpleTitleRoller implements TitleRoller {

    private final TitleFetcher fetcher;
    private static final ArrayList<String> bucket = new ArrayList<>(List.of(
            "T1", "T1", "T1", "T1", "T1", "T1",     // 60 % chance
            "T2", "T2", "T2",                       // 30 % chance
            "T3"                                    // 10 % chance
    )); //  I have no idea as to how make these weight distributions better, ready to hear smth new

    @Autowired
    public SimpleTitleRoller(TitleFetcher fetcher) {
        this.fetcher = fetcher;
    }

    @Override
    public Title getRandomTitle() {
        Random rnd = new Random();
        return fetcher.fetchTitle(bucket.get(rnd.nextInt(9)));
    }
}
