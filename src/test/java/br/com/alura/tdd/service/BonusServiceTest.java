package br.com.alura.tdd.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.math.BigDecimal;
import java.time.LocalDate;


import br.com.alura.tdd.modelo.Funcionario;
import org.junit.jupiter.api.Test;

class BonusServiceTest {

    BonusService bonusService;

    void inicializar() {
        this.bonusService = new BonusService();
    }

    @Test
    void bonusDeveriaSerZeroParaDuncionarioComSalarioMuitoALtos() {
        BigDecimal bonus = bonusService.calcularBonus(new Funcionario("rodrigo", LocalDate.now(), new BigDecimal("25000")));
        assertEquals(new BigDecimal("0.00"), bonus);
    }

    @Test
    void bonusDeveriaSer10PorCentoDoSalario() {
        BigDecimal bonus = bonusService.calcularBonus(new Funcionario("rodrigo", LocalDate.now(), new BigDecimal("2500")));
        assertEquals(new BigDecimal("250.00"), bonus);
    }

    @Test
    void bonus() {
        BigDecimal bonus = bonusService.calcularBonus(new Funcionario("rodrigo", LocalDate.now(), new BigDecimal("1000")));
        assertEquals(new BigDecimal("100.00"), bonus);
    }



}
