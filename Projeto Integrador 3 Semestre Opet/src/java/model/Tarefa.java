/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.Date;



/**
 *
 * @author All user
 */
public class Tarefa {
    private int tarefaId;
    private int tipoId;
    private String tipoNome;
    private String tarefaDescricao;
    private String dtsolicitacao;
    private String dtrealizaçao;
    private String dtlimite;
    private int idRequisitante;
    private String apelidoRequisitante;
    private int idExecutor;
    private String apelidoExecutor;

    public int getTarefaId() {
        return tarefaId;
    }

    public void setTarefaId(int tarefaId) {
        this.tarefaId = tarefaId;
    }

    public int getTipoId() {
        return tipoId;
    }

    public void setTipoId(int tipoId) {
        this.tipoId = tipoId;
    }
       public String getTipoNome() {
        return tipoNome;
    }

    public void setTipoNome(String tipoNome) {
        this.tipoNome = tipoNome;
    }

    public String getTarefaDescricao() {
        return tarefaDescricao;
    }

    public void setTarefaDescricao(String tarefaDescricao) {
        this.tarefaDescricao = tarefaDescricao;
    }

    
    public int getIdRequisitante() {
        return idRequisitante;
    }

    public void setIdRequisitante(int idRequisitante) {
        this.idRequisitante = idRequisitante;
    }

    public int getIdExecutor() {
        return idExecutor;
    }

    public void setIdExecutor(int idExecutor) {
        this.idExecutor = idExecutor;
    }

    public String getDtsolicitacao() {
        return dtsolicitacao;
    }

    public void setDtsolicitacao(String dtsolicitacao) {
        this.dtsolicitacao = dtsolicitacao;
    }

    public String getDtrealizaçao() {
        return dtrealizaçao;
    }

    public void setDtrealizaçao(String dtrealizaçao) {
        this.dtrealizaçao = dtrealizaçao;
    }

    public String getDtlimite() {
        return dtlimite;
    }

    public void setDtlimite(String dtlimite) {
        this.dtlimite = dtlimite;
    }

    public String getApelidoRequisitante() {
        return apelidoRequisitante;
    }

    public void setApelidoRequisitante(String apelidoRequisitante) {
        this.apelidoRequisitante = apelidoRequisitante;
    }

    public String getApelidoExecutor() {
        return apelidoExecutor;
    }

    public void setApelidoExecutor(String apelidoExecutor) {
        this.apelidoExecutor = apelidoExecutor;
    }

    @Override
    public String toString() {
        return "Tarefa{" + "tarefaId=" + tarefaId + ", tipoId=" + tipoId + ", tipoNome=" + tipoNome + ", tarefaDescricao=" + tarefaDescricao + ", dtsolicitacao=" + dtsolicitacao + ", dtrealiza\u00e7ao=" + dtrealizaçao + ", dtlimite=" + dtlimite + ", idRequisitante=" + idRequisitante + ", apelidoRequisitante=" + apelidoRequisitante + ", idExecutor=" + idExecutor + ", apelidoExecutor=" + apelidoExecutor + '}';
    }
    
    
    
    
    
}
