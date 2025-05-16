package ex08;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Paciente pacJoao = new Paciente("João", 3, 5);
        Paciente pacMaria = new Paciente("Maria", 3, 10);
        Paciente pacLucas = new Paciente("Lucas", 5, 2);

        Paciente[] lista = {pacJoao, pacMaria, pacLucas};

        Paciente[] sortedLista = Sort.sortPaciente(lista);
        printArray(sortedLista);
    }

    public static void printArray(Paciente[] array){
        for (int i = 0; i < array.length - 1; i++) {
            System.out.print(array[i].getNome() + ", ");
        }
        System.out.println(array[array.length - 1].getNome());
    }
}