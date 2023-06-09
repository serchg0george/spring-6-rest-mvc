package com.springframework.spring6restmvc.services;

import com.opencsv.bean.CsvToBeanBuilder;
import com.springframework.spring6restmvc.models.BeerCSVRecord;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.List;

public class BeerCsvServiceImpl implements BeerCsvService {
    @Override
    public List<BeerCSVRecord> convertCSV(File csvFile) {
        try {
            List<BeerCSVRecord> beerCSVRecords = new CsvToBeanBuilder<BeerCSVRecord>(new FileReader(csvFile))
                    .withType(BeerCSVRecord.class)
                    .build().parse();
            return beerCSVRecords;
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
