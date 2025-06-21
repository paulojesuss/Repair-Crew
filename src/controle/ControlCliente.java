package controle;

import modelo.Cliente;
import java.util.ArrayList;

public class ControlCliente {

    public void cadastrarCliente(Cliente c) {
        Cliente.clientes.add(c);
    }

    public ArrayList<Cliente> consultarClientePorNome(String n) {
        ArrayList<Cliente> cpn = new ArrayList<>();
        for (Cliente c : Cliente.clientes) {
            if (n == null || n.trim().isEmpty()) {
                cpn.add(c);
            } else if (c.getNome().toLowerCase().contains(n.toLowerCase())) {
                cpn.add(c);
            }
        }
        return cpn;
    }

    public Cliente consultarClientePorNumero(int n) {
        for (Cliente c : Cliente.clientes) {
            if (c.getCodigo() == n) {
                return c;
            }
        }
        return null;
    }

    public void editarCliente(Cliente cliente) {
        for (Cliente c : Cliente.clientes) {
            if (c.getCodigo() == cliente.getCodigo()) {
                c.setNome(cliente.getNome());
                c.setCpf(cliente.getCpf());
                c.setEndereco(cliente.getEndereco());
                c.setTelefone(cliente.getTelefone());
                c.setRg(cliente.getRg());
                break;
            }
        }
    }

    public void apagarCliente(Cliente cliente) {
        Cliente.clientes.remove(cliente);
    }
}
