package com.project.manager.controllers;

import com.project.manager.domain.ParticipantsProject;
import com.project.manager.services.ParticipantsProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "participants")
public class ParticipantsProjectController {

    @Autowired
    ParticipantsProjectService participantsProjectService;

    @GetMapping
    public ResponseEntity<List<ParticipantsProject>> getAll(){
        return ResponseEntity.status(200).body(this.participantsProjectService.findAll());
    }
}