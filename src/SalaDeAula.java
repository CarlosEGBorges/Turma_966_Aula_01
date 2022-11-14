import java.util.*;

public class SalaDeAula<T> {

    List<T> listaTs = new ArrayList<>();

    public void addParticipante(T t){
        listaTs.add(t);
    }

    public void imprimirLista(){
        for(T t : listaTs){
            System.out.println(t);
        }
    }

    public T get(){
        return null;
    }

    public static void main(String[] args) {

        SalaDeAula<Participante> salaDeAula = new SalaDeAula();
        List<Professor> lista = new ArrayList<Professor>();

        Aluno aluno = new Aluno(12345, "José", "Zé");
        Professor professor = new Professor(111, "Kadu", "Java");

        salaDeAula.addParticipante(aluno);
        salaDeAula.addParticipante(new Aluno(23456, "Helena", "Lena"));
        salaDeAula.addParticipante(professor);

        Collections.sort(salaDeAula.listaTs);

        salaDeAula.imprimirLista();
    }
}