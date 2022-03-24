package java8;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class ExercicioDatas {
	
	public static void main(String[] args) {
		LocalDate data = LocalDate.of(2099, Month.JANUARY, 25);
		LocalDate hoje = LocalDate.now();
		
		Period periodo = Period.between(hoje, data);
		System.out.println("Falta " + periodo.getYears() + " anos, " + periodo.getMonths() + " meses, e "
				+ periodo.getDays() + " dias");
		
		DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		System.out.println(hoje.format(formatador));
		
	}

}
