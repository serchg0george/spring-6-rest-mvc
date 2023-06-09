package com.springframework.spring6restmvc.services;

import com.springframework.spring6restmvc.models.BeerCSVRecord;

import java.io.File;
import java.util.List;

public interface BeerCsvService {
    List<BeerCSVRecord> convertCSV(File csvFile);
}
