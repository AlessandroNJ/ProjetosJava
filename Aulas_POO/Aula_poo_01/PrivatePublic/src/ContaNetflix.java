public class ContaNetflix {
    private String idiomaPreferencial;
    private String resolucaoTela;

    public void entrar(){
        buscarPreferenciasDoUsuario();
        identificarResolucao();
    }

    private void buscarPreferenciasDoUsuario(){
        idiomaPreferencial = "PT-BR";

    }

    private void identificarResolucao(){
        resolucaoTela = "Full HD";
    }


    public void assistirFilme(String nomeFilme){
        System.out.println("Assistir o filme " + nomeFilme);
        System.out.println("Carregando filme na resolução " + resolucaoTela);
        carregarAudio();
    }

    private void carregarAudio(){
        if(idiomaPreferencial=="PT-BR"||idiomaPreferencial=="EN-US")
            System.out.println("Carregando o áudio em " + idiomaPreferencial);
        else    
            System.out.println("Carregando o áudio em EN-US por padrão");
    }
}
