package ex08;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Paciente pacJoao = new Paciente("João", 3, 5);
        Paciente pacMaria = new Paciente("Maria", 3, 10);
        Paciente pacLucas = new Paciente("Lucas", 5, 2);

        Paciente[] lista = {pacJoao, pacMaria, pacLucas};

        Paciente[] sortedLista = Sort.sortPaciente(lista);
    }
}