
package controle;

import modelo.Cliente;
import modelo.OrdemDeServico;

public class ControlOS {
    public void cadastrarOS(OrdemDeServico os){
        OrdemDeServico.OrdemDeServicos.add(os);
    }
    public OrdemDeServico consultarOSporNumero(int n){
        return null;
    }
    public OrdemDeServico consultarOSporCliente(Cliente c){
        return null;
    }
    public void editarOS(){
    
    }
    public void apagarOS(){
    
    }
    public void gerarDiagnosticoOrcamento(){
    
    }
    public void gerarProtocoloGarantia(){
    
    }
}
