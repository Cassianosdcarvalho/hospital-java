
package hospital;

import java.util.Date;

public class Paciente {
    private String nome;
    private String RG;
    private String endereco;
    private String telefone;
    private String email;
    private Date dataNasc;
    private double peso;
    private double altura;
    private CadastroPaciente cadastro;
    private Hospital hospital;
    
    public Paciente(Hospital hospital){
        this.hospital = hospital;
        cadastro = new CadastroPaciente(this);
    }
}
