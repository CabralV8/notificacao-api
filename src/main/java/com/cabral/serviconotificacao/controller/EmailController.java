package com.cabral.serviconotificacao.controller;

import com.cabral.serviconotificacao.business.EmailService;
import com.cabral.serviconotificacao.business.dto.TarefasRecord;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/email")
public class EmailController {

    private final EmailService emailService;

    public EmailController(EmailService emailService) {
        this.emailService = emailService;
    }

    @PostMapping
    public ResponseEntity<Void> enviarEmail(@RequestBody TarefasRecord dto){
        emailService.enviaEmail(dto);
        return ResponseEntity.ok().build();
    }
}
