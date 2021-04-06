package tcc.sikulix.tcc.sikulix.maven.eclipse;

import org.sikuli.script.*;

public class CalculadoraTeste {

	public static void main(String[] args) {
		String basePath = "C:\\Project\\sikulix-tcc\\";
		Screen s = new Screen();
        try{
        	
        	//Coloquei o fundo da imagem transparente e usei como mascára. Funcionou para o tema claro e escuro
        	Pattern b = new Pattern(basePath+"imgs\\iconecalculadora_transp.png");
            s.click(b.mask());
            
            //Já com o número 3 há momentos que se confunde com o 9, mesmo colocando um nível alto de similiaridade
            b = new Pattern(basePath+"imgs\\3_transp.png");
            s.click(b.mask().similar(0.90));

           // s.click("3"); //Não funcionou desta forma, pois ele procura uma fonte fina como em um texto
        	
            //Assim, como o aconteceu com a imagem do número 3, o X as vezes se perder clicando em ícones errados como o botão M+ da calculadora
            Pattern a = new Pattern(basePath+"imgs\\x_transp.png");
            s.click(a.mask());
            
        	/* Este código funciona apenas com o windows com o tema preto
        		Pattern a = new Pattern(basePath+"imgs\\iconecalculadora.png");
                s.click(a.mask());
                Pattern p = new Pattern(basePath+"imgs\\num2.png");
                s.click(p.mask());
                s.click(basePath+"imgs\\simb+.png");
                s.click(basePath+"imgs\\num3.png");
                s.click(basePath+"imgs\\simb=.png");
                s.find(basePath+"imgs\\display5.png");
               */
        }
        catch(FindFailed e){
                e.printStackTrace();
        }
	}

}
