import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Curso focado em POO");
        curso1.setCargaHoraria(60);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso C#");
        curso2.setDescricao("Curso focado em C#");
        curso2.setCargaHoraria(12);

        System.out.println(curso1);
        System.out.println(curso2);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria de Java");
        mentoria.setDescricao("Mentoria completa sobre Java");
        mentoria.setData(LocalDate.now());

        System.out.println(mentoria);

        Conteudo conteudo = new Curso();

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Java Developer");
        bootcamp.setDescricao("Formaçao completa em Java");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devEtiene = new Dev();
        devEtiene.setNome("Etiene");
        devEtiene.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos de Etiene: " + devEtiene.getConteudosInscritos());
        devEtiene.progredir();
        System.out.println("Conteúdos concluídos: " + devEtiene.getConteudosConcluidos());
        System.out.println("XP: "+ devEtiene.calcularTotalXp());
        System.out.println("---------------------");

        Dev dev2 = new Dev();
        devEtiene.setNome("Desenvolvedor 2");
        dev2.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos de Dev2: " + dev2.getConteudosInscritos());
        dev2.progredir();
        System.out.println("Conteúdos inscritos: " + dev2.getConteudosInscritos());
        System.out.println("Conteúdos concluídos: " + dev2.getConteudosConcluidos());
        System.out.println("XP: "+ dev2.calcularTotalXp());
    }
}
