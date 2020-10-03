package com.techtoha.rollingmachine.service;

import com.techtoha.rollingmachine.domain.Title;

public interface TitleFetcher {
    Title fetchTitle(String tier);
}
