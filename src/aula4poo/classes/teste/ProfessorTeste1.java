package aula4poo.classes.teste;

import aula4poo.classes.dominio.Professor;

public class ProfessorTeste1 {
    public static void main(String[] args) {
        Professor professor = new Professor();
        professor.nome = "Gustavo";
        professor.idade = 140;
        professor.sexo = 'M';

        System.out.println("nome: " + professor.nome + " idade: " + professor.idade + " sexo: " + professor.sexo);
    }
}