package com.example.lucas.farmafcil;

import java.util.ArrayList;
import java.util.List;


public class GerenciaMed implements GerMedInterface{

    private List<Medicamento> Medicamentos;

    public GerenciaMed(){
        this.medicamentos = new ArrayList<Medicamento>();


    }


    @Override
    public void cadastraMedicamento(Medicamento med) throws MedicamentoJaExisteException {
        for (Medicamento m: this.medicamentos){
            if (m.getCodigo().equals(med.getCodigo())){
                throw new MedicamentoJaExisteException("Esse medicamento já existe:"+med.getCodigo());
            }

        }
        this.medicamentos.add(med);

    }

    public void removeMedicamento(String codMedicamento)throws MedicamentoNaoExisteException{
        for (Medicamento m: this.medicamentos){
            if (m.getCodigo().equals(codMedicamento)){
                medicamentos.remove(m);

            }
        }
        throw new ParticipanteNaoExisteException("Esse Medicamento Não Existe!");
    }


    public Medicamento pesquisaMedicamento(String codigo) throws MedicamentoNaoExisteException{
        for (Medicamento m: this.medicamentos){
            if (m.getCodigo().equals(codigo)){
                return m;
            }

        }
        throw new MedicamentoNaoExisteException("Não existe Medicamento com esse código: "+codigo);

    }


    public List<Medicamento> getListaTotalDeMedicamentos() {
        return this.medicamentos;
    }


}
