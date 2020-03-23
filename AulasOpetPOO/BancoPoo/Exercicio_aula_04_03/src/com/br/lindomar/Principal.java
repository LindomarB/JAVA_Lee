package com.br.lindomar;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		Cliente jao = new Cliente();
		JOptionPane.showConfirmDialog(null, "LINDOMAR BASSETTI DO NASCIMENTO "
				+ "\n"+"MATRICULA 1201900046");
		jao.setNome(JOptionPane.showInputDialog(null,"Digite o nome"));
		jao.setCodigo(Integer.parseInt(JOptionPane.showInputDialog(null,"codigo do cliente")));
		jao.setCpf(JOptionPane.showInputDialog(null,"Cpf"));
		jao.getNasc().setDia(JOptionPane.showInputDialog(null,"Dia do nascimento"));
		jao.getNasc().setMes(JOptionPane.showInputDialog(null,"Mes do NAscimento"));
		jao.getNasc().setAno(JOptionPane.showInputDialog(null,"Ano do Nascimento"));
		jao.toString();
		System.out.println(jao.toString());

	}

}
