package com.example.schedule;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class TarefasAgendadas {

	private static final Logger logger = LoggerFactory.getLogger(ScheduleApplication.class);
	private static final DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("HH:mm:ss");

	@Scheduled(fixedRate = 1000)
	public void tarefaAgendada() {
		logger.info("Tarefa executando a cada 1 segundo... " + dateTimeFormatter.format(LocalDateTime.now()));
	}

	@Scheduled(fixedRate = 1000, initialDelay = 5000)
	public void tarefaAgendadaComAtrasoNaInicializacao() {
		logger.info("Atraso inicial de 5 segundos... " + dateTimeFormatter.format(LocalDateTime.now()));
	}
}
