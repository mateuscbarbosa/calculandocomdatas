package br.com.srvoid.testes;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

import br.com.srvoid.modelo.Datas;

public class TestesDeCalculos {

	public static void main(String[] args) {
		DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyy");
		
		Datas datas = new Datas();
		
		System.out.println(datas.hoje().format(formato));
		
//		datas.setEntrada("30/01/2021");
		
//		LocalDate teste = LocalDate.now();
//		long dias = ChronoUnit.DAYS.between(LocalDate.parse(datas.getEntrada(), formato), teste);
		long dias = datas.diferencaDatasDias("01/01/2021", datas.hoje().format(formato));
		System.out.println(dias);
		
	}
}
