package com.example.lucas.farmafcil;

import java.util.List;



public interface GerMedInterface {
    public void cadastraMedicamento(Medicamento med) throws MedicamentoJaExisteException;

    public Medicamento pesquisaMedicamento(String codigo) throws MedicamentoNaoExisteException;

    public void removeMedicamento(String codigoMedicamento) throws MedicamentoNaoExisteException;


    public List<Medicamento> getListaTotalDeMedicamentos();


}