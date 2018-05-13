package Classes;

public class DadosLogin {
    public boolean ValidarUsuarios (String usuario, String senha){
        
        if (usuario.equals("marci") && senha.equals ("123"))   {
            return true;
        }else{
            return false;
        } 
    }
}
