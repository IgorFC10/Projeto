package ast;

import javax.swing.JOptionPane;

import symbols.Identifier;

public class CmdLeitura extends AbstractCommand{
	
	private Identifier id;
	
	public CmdLeitura(Identifier id) {
		super();
		this.id = id;
	}
	public CmdLeitura() {
		super();
	}


	@Override
	public String generateCode() {
		// TODO Auto-generated method stub
		return id.getText() + " = " + "prompt(\"Type you input\");\n";
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		id.setValue(Integer.parseInt(JOptionPane.showInputDialog("Type Your Input")));
	}

}
