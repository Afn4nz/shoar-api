package com.example.shoarapi.consultant.controller;

import com.example.shoarapi.category.validator.CategoryExists;
import com.example.shoarapi.common.Constants;
import com.example.shoarapi.consultant.ConsultantService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Validated
@RestController
@RequestMapping(Constants.Consultants.CONSULTANTS_PREFIX)
@RequiredArgsConstructor
public class ConsultantController {
    private final ConsultantService consultantService;
    @GetMapping(Constants.Consultants.GET_CONSULTANTS_BHY_CATEGORY + "/{category}")
    public ResponseEntity<?> getConsultants(@PathVariable("category") @CategoryExists String category) {
        return new ResponseEntity<>(consultantService.getConsultantsByCategory(category), HttpStatus.OK);
    }
}
