package br.com.srvoid.modelo;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Datas {

	private LocalDate dataInicial;
	private LocalDate dataFinal;
	private long numero;
	private String entrada;
	private DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyy");
	
	public LocalDate hoje() {
		return this.dataInicial.now();
	}
	
	public LocalDate dataMaisDias(String dataInformada, long dias) {
		this.dataFinal= LocalDate.parse(dataInformada, formatador);
		return this.dataFinal.plusDays(dias);
	}
	
	public long diferencaDatasDias(String dataI, String dataF) {
		dataInicial= LocalDate.parse(dataI,formatador);
		dataFinal = LocalDate.parse(dataF,formatador);
		return this.numero = ChronoUnit.DAYS.between(dataInicial,dataFinal);
	}
}
