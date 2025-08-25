public class stringloweranduppper {
    public static void main (String[]args){
        String nome="JoAO ViXtOr";
        String nome2=nome.toLowerCase();
        System.out.println(nome2);
        if(nome!=""){
            String nomeacao="joao fez o gol";
            String maisculo=nomeacao.toUpperCase();
            String minuscolo=nomeacao.toLowerCase();
            System.out.println(minuscolo+"\n em minusculo");
            System.out.println(maisculo+"\n em maisculo");
        }
    }
}
