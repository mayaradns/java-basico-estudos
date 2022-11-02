package aula4poo.classes.teste;

import aula4poo.classes.dominio.Carro;

public class CarroTeste {
    public static void main(String[] args){
        Carro carro1 = new Carro();
        Carro carro2 = new Carro();

        carro1.nome = "Sport";
        carro1.ano = 1969;
        carro1.modelo = "Fusca";

        carro2.nome = "Mustang";
        carro2.ano = 1968;
        carro2.modelo = "GT 500";

        System.out.println("Carro 1");
        System.out.println(carro1.nome);
        System.out.println(carro1.ano);
        System.out.println(carro1.modelo);

        System.out.println("\nCarro 2");
        System.out.println(carro2.nome);
        System.out.println(carro2.ano);
        System.out.println(carro2.modelo);

        carro1 = carro2; //agora, carro1 faz referência ao mesmo local de memória de carro2

        System.out.println(carro1);
        System.out.println(carro2);
    }
}
