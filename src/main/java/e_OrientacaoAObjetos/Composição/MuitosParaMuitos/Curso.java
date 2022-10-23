package e_OrientacaoAObjetos.Composição.MuitosParaMuitos;

import java.util.ArrayList;
import java.util.List;

public class Curso {

    final String nome;
    final List<Aluno> alunos = new ArrayList<>();

    Curso(String nome){
        this.nome = nome;
    }

    void adicionarAluno(Aluno aluno){
        alunos.add(aluno);
        aluno.cursos.add(this);
//        aluno.adicionarCurso(this);

    }
}
