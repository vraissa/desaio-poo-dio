import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("curso java");
        curso1.setDescricao("descrição curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso JS");
        curso2.setDescricao("descrição curso JS");
        curso2.setCargaHoraria(4);


        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria java");
        mentoria.setDescricao("descrição mentoria java");
        mentoria.setData(LocalDate.now());

      //  System.out.println(curso1);
     //   System.out.println(curso2);
     //   System.out.println(mentoria);

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Dev");
        bootcamp.setDescricao("Dscrição Bootcamp Java Dev");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devVitoria = new Dev();
        devVitoria.setNome("Vitoria");
        devVitoria.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos inscritos " + devVitoria.getConteudosInscritos());
        devVitoria.progredir();
        devVitoria.progredir();
        System.out.println("-");
        System.out.println("Conteudos inscritos " + devVitoria.getConteudosInscritos());
        System.out.println("Conteudos concluidos " + devVitoria.getConteudosConcluidos());
        System.out.println("XP: " + devVitoria.calcularTotalXp());

        System.out.println("---------");


        Dev devCamilo = new Dev();
        devCamilo.setNome("Camilo");
        devCamilo.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos inscritos " + devCamilo.getConteudosInscritos());
        devCamilo.progredir();
        devCamilo.progredir();
        devCamilo.progredir();
        System.out.println("-");
        System.out.println("Conteudos inscritos " + devCamilo.getConteudosInscritos());
        System.out.println("Conteudos concluidos " + devCamilo.getConteudosConcluidos());
        System.out.println("XP: " + devCamilo.calcularTotalXp());




    }

}
