package com.gmail.merikbest2015.ecommerce.service.Impl;

import com.gmail.merikbest2015.ecommerce.domain.Perfume;
import com.gmail.merikbest2015.ecommerce.repos.PerfumeRepository;
import com.gmail.merikbest2015.ecommerce.service.PerfumeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;

@Service
public class PerfumeServiceImpl implements PerfumeService {
    private final PerfumeRepository perfumeRepository;

    @Autowired
    public PerfumeServiceImpl(PerfumeRepository perfumeRepository) {
        this.perfumeRepository = perfumeRepository;
    }

    @Override
    public Iterable<Perfume> findAll() {
        return perfumeRepository.findAll();
    }

    @Override
    public Page<Perfume> findAll(Pageable pageable) {
        return perfumeRepository.findAll(pageable);
    }

    @Override
    public Page<Perfume> findByPriceBetween(Integer startingPrice, Integer endingPrice, Pageable pageable) {
        return perfumeRepository.findByPriceBetween(startingPrice, endingPrice, pageable);
    }

    @Override
    public Page<Perfume> findByPerfumer(String perfumer, Pageable pageable) {
        return perfumeRepository.findByPerfumer(perfumer, pageable);
    }

    @Override
    public Page<Perfume> findByPerfumeGender(String perfumeGender, Pageable pageable) {
        return perfumeRepository.findByPerfumeGender(perfumeGender, pageable);
    }

    @Override
    public Page<Perfume> findByPerfumerOrPerfumeTitle(String perfumer, String perfumeTitle, Pageable pageable) {
        return perfumeRepository.findByPerfumerOrPerfumeTitle(perfumer, perfumeTitle, pageable);
    }

    @Override
    public Page<Perfume> findByPerfumerIn(List<String> perfumers, Pageable pageable) {
        return perfumeRepository.findByPerfumerIn(perfumers, pageable);
    }

    @Override
    public BigDecimal minPerfumePrice() {
        return perfumeRepository.minPerfumePrice();
    }

    @Override
    public BigDecimal maxPerfumePrice() {
        return perfumeRepository.maxPerfumePrice();
    }

    @Override
    public void saveProductInfoById(String perfumeTitle, String perfumer, Integer year, String country,
                                    String perfumeGender, String fragranceTopNotes, String fragranceMiddleNotes,
                                    String fragranceBaseNotes, String description, String filename,
                                    Integer price, String volume, String type, Long id
    ) {
        perfumeRepository.saveProductInfoById(perfumeTitle, perfumer, year, country, perfumeGender, fragranceTopNotes,
                fragranceMiddleNotes, fragranceBaseNotes, description, filename, price, volume, type, id);
    }

    @Override
    public Perfume save(Perfume perfume) {
        return perfumeRepository.save(perfume);
    }
}
