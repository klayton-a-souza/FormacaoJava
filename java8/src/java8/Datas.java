package java8;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Datas {
	public static void main(String[] args) {
		LocalDate hoje = LocalDate.now();

		LocalDate olimpiadasInverno = LocalDate.of(2026, Month.FEBRUARY, 6);

		int anos = olimpiadasInverno.getYear() - hoje.getYear();
		System.out.println(anos);

		Period periodo = Period.between(hoje, olimpiadasInverno);
		System.out.println("Falta " + periodo.getYears() + " anos, " + periodo.getMonths() + " meses, e "
				+ periodo.getDays() + " dias");

		LocalDate proximaOlimpiadas = olimpiadasInverno.plusYears(4);

		System.out.println(proximaOlimpiadas);

		DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy");

		String valorFormatado = proximaOlimpiadas.format(formatador);
		System.out.println(valorFormatado);
		
		
		DateTimeFormatter formatadorTempo = DateTimeFormatter.ofPattern("dd/MM/yyyy hh:mm");
		
		LocalDateTime agora = LocalDateTime.now();
		System.out.println(agora.format(formatadorTempo));
		

	}

}
