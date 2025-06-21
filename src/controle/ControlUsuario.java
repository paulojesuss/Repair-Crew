
package controle;

import javax.swing.JOptionPane;



public class ControlUsuario {
    public boolean fazerLogin(String login, String senha){
        if(login.equals("tec1") && senha.equals("qwe123")){
            JOptionPane.showMessageDialog(null, "Login realizado com sucesso", "Bem-vindo de volta!", JOptionPane.INFORMATION_MESSAGE);
            return true;
        }else{
            JOptionPane.showMessageDialog(null, "Login e/ou Senha inválidos", "Tente Novamente!", JOptionPane.INFORMATION_MESSAGE);     
            return false;
        }
    }
}
