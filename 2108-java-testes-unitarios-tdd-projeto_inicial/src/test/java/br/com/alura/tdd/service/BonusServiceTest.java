package br.com.alura.tdd.service;

import static org.junit.jupiter.api.Assertions.*;

import java.math.BigDecimal;
import java.time.LocalDate;

import org.junit.jupiter.api.Test;

import br.com.alura.tdd.modelo.Funcionario;

class BonusServiceTest {

	@Test
	void bonusDeveriaSerZeroParaFuncionarioComSalarioMuitoAlto() {
		BonusService service = new BonusService();

		// Abaixo podemos encontra duas maneiras de lançar exception no JUnit, a
		// primeira e utilizando quando não a necessidade de verificar a mensagem, já o
		// segundo e mais utilizando quando queremos verificar a mensagem de erro.

		// assertThrows(IllegalArgumentException.class,
		// () -> service.calcularBonus(new Funcionario("Klayton", LocalDate.now(), new
		// BigDecimal("50000"))));

		try {
			service.calcularBonus(new Funcionario("Klayton", LocalDate.now(), new BigDecimal("50000")));
			fail("Não deu a exception");
		} catch (Exception e) {
			assertEquals("Funcionario com salário maior do que R$ 10000 não pode receber bônus", e.getMessage());
		}

	}

	@Test
	void bonusDeveriaSer10PorCentoDoSalario() {
		BonusService service = new BonusService();
		BigDecimal bonus = service.calcularBonus(new Funcionario("Klayton", LocalDate.now(), new BigDecimal("2500")));

		assertEquals(new BigDecimal("250.00"), bonus);
	}

	@Test
	void bonusDeveriaSerDezPorCentoParaSalarioDeExatamente10000() {
		BonusService service = new BonusService();
		BigDecimal bonus = service.calcularBonus(new Funcionario("Klayton", LocalDate.now(), new BigDecimal("10000")));

		assertEquals(new BigDecimal("1000.00"), bonus);
	}

}
