package com.cabral.serviconotificacao.business.dto;

import com.cabral.serviconotificacao.business.enums.StatusNotificacaoEnum;
import com.fasterxml.jackson.annotation.JsonFormat;

import java.time.LocalDateTime;

public record TarefasRecord(String id,
                            String nomeTarefa,
                            @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy HH:mm:ss")
                            LocalDateTime dataCriacao,
                            @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy HH:mm:ss")
                            LocalDateTime dataEvento,
                            String emailUsuario,
                            @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy HH:mm:ss")
                            LocalDateTime dataAlteracao,
                            StatusNotificacaoEnum statusNotificacaoEnum) {
}
