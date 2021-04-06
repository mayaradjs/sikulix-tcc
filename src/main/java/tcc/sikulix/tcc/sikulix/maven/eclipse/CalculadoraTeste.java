package tcc.sikulix.tcc.sikulix.maven.eclipse;

import org.sikuli.script.*;

public class CalculadoraTeste {

	public static void main(String[] args) {
		String basePath = "C:\\Eclipse\\tcc.sikulix.maven.eclipse\\";
		Screen s = new Screen();
        try{
        	Pattern b = new Pattern(basePath+"imgs\\iconecalculadora_transp.png");
            s.click(b.mask());
            b = new Pattern(basePath+"imgs\\3_transp.png");
           // s.click("3");
        	Pattern a = new Pattern(basePath+"imgs\\x_transp.png");
            s.click(a.mask());
            s.click(b.mask().similar(0.95));
        	/*
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
