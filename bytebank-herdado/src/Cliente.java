
public class Cliente implements Autenticavel {

	
    private AutentificacaoUtil autenticador;
    
    public Cliente(){
        this.autenticador = new AutentificacaoUtil();
    }

	@Override
    public void setSenha(int senha){
        this.autenticador.setSenha(senha);
    }

    @Override
    public boolean autentica(int senha){
        boolean autenticou = this.autenticador.autentica(senha);
        return autenticou;
    }
}
