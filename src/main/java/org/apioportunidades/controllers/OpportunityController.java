package org.apioportunidades.controllers;

import org.apioportunidades.Constants.Constant;
import org.apioportunidades.models.Opportunity;
import org.apioportunidades.services.OpportunityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class OpportunityController {
    @Autowired
    private OpportunityService opportunityService;

    @GetMapping(Constant.API_OPPORTUNITY)
    public ResponseEntity<List<Opportunity>> findAll() {
        return ResponseEntity.status(HttpStatus.OK).body(opportunityService.findAll());
    }

    @PostMapping(Constant.API_OPPORTUNITY)
    public ResponseEntity<Opportunity> create(@RequestBody Opportunity opportunity) {
        return ResponseEntity.status(HttpStatus.CREATED).body(opportunityService.save(opportunity));
    }

    @PutMapping(Constant.API_OPPORTUNITY)
    public ResponseEntity<Opportunity> update(@RequestBody Opportunity opportunity) {
        return ResponseEntity.ok(opportunityService.save(opportunity));
    }

    @GetMapping(Constant.API_OPPORTUNITY + "{id}")
    public ResponseEntity<Optional<Opportunity>> findById(@PathVariable String id) {
        return ResponseEntity.ok(opportunityService.findById(id));
    }

    @DeleteMapping(Constant.API_OPPORTUNITY + "{id}")
    public ResponseEntity<Opportunity> delete(@PathVariable String id) {
        opportunityService.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}
