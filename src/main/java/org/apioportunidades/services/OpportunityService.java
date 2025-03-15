package org.apioportunidades.services;

import org.apioportunidades.models.Opportunity;
import org.apioportunidades.repositories.OpportunityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OpportunityService {
    @Autowired
    private OpportunityRepository opportunityRepository;

    public List<Opportunity> findAll() {
        return opportunityRepository.findAll();
    }

    public Opportunity save(Opportunity opportunity) {
        return opportunityRepository.save(opportunity);
    }

    public Optional<Opportunity> findById(String id) {
        return opportunityRepository.findById(id);
    }

    public void deleteById(String id) {
        opportunityRepository.deleteById(id);
    }
}
