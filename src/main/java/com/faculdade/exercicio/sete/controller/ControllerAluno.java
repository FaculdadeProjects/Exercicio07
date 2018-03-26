package com.faculdade.exercicio.sete.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.faculdade.exercicio.sete.model.Aluno;


@WebServlet(urlPatterns = "/alunos")
public class ControllerAluno  extends HttpServlet{
	private static final long serialVersionUID = 4394528069082725743L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		 List<Aluno> todosAlunos = new ArrayList<Aluno>();
		 todosAlunos = populateList();
		 
		 req.setAttribute("todosAlunos", todosAlunos);
		 RequestDispatcher requestDispatcher = req.getRequestDispatcher("ListaAlunos.jsp");
		 requestDispatcher.forward(req, resp);
	}

	private List<Aluno> populateList() {
		Aluno aluno =  new Aluno();
		 aluno.setNome("Anderson");
		 aluno.setNota(6);
		 aluno.setRa("1111");
		 
		 
		 Aluno aluno2 = new Aluno();
		 aluno2.setNome("Samuel");
		 aluno2.setNota(4);
		 aluno2.setRa("2222");
		 
		 Aluno aluno3 = new Aluno();
		 aluno3.setNome("Vanderlei de Grecci");
		 aluno3.setNota(5);
		 aluno3.setRa("3333");
		 
		 Aluno aluno4 = new Aluno();
		 aluno4.setNome("Ricardo");
		 aluno4.setRa("4444");
		 aluno4.setNota(3);
		 
		 Aluno aluno5 = new Aluno();
		 aluno5.setNome("Rafaela");
		 aluno5.setRa("5555");
		 aluno5.setNota(8);
		 
		 Aluno aluno6 = new Aluno();
		 aluno6.setNome("Diego");
		 aluno6.setRa("6666");
		 aluno6.setNota(10);
		
		 List<Aluno> alunos = new ArrayList<Aluno>();
		 alunos.add(aluno);
		 alunos.add(aluno2);
		 alunos.add(aluno3);
		 alunos.add(aluno4);
		 alunos.add(aluno5);
		 alunos.add(aluno6);
		 
		 return alunos;
	}
	
	

}
