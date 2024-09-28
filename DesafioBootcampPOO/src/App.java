import java.time.LocalDate;

import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

public class App {
    public static void main(String[] args) throws Exception {
        Curso curso1 = new Curso();
        curso1.setTitulo("curso java");
        curso1.setDescricao("descrição curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso js");
        curso2.setDescricao("descrição curso js");
        curso2.setCargaHoraria(4);
        
        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria java");
        mentoria.setDescricao("descricao mentoria java");
        mentoria.setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev dev1 = new Dev();
        dev1.setNome("Nome 1");
        dev1.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos " + dev1.getConteudosInscritos());
        dev1.progredir();
        dev1.progredir();
        System.out.println("Conteúdos inscritos " + dev1.getConteudosInscritos());
        System.out.println("Conteúdos concluídos " + dev1.getConteudosConcluidos());
        System.out.println("XP: "+ dev1.calcularTotalXp());

        Dev dev2 = new Dev();
        dev2.setNome("Nome 2");
        dev2.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos " + dev2.getConteudosInscritos());
        dev2.progredir();
        dev2.progredir();
        dev2.progredir();
        System.out.println("Conteúdos inscritos " + dev2.getConteudosInscritos());
        System.out.println("Conteúdos concluídos " + dev2.getConteudosConcluidos());
        System.out.println("XP: "+ dev2.calcularTotalXp());

        // System.out.println(curso1);
        // System.out.println(curso2);
        // System.out.println(mentoria);
    }
}
