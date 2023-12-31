package ast;

import javax.swing.JOptionPane;

import symbols.Identifier;

public class CmdEscrita extends AbstractCommand{
	
	private Identifier id;
	private String text;
	
	public CmdEscrita() {
		super();
	}
	
	public CmdEscrita(Identifier id) {
		super();
		this.id = id;
	}
	

	public CmdEscrita(String text) {
		super();
		this.text = text;
	}

	@Override
	public String generateCode() {
		// TODO Auto-generated method stub
		return "alert(" + (id!=null?id.getText():text) + ");\n";
	}

	public Identifier getId() {
		return id;
	}

	public void setId(Identifier id) {
		this.id = id;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		JOptionPane.showMessageDialog(null, (id!=null? id.getValue():text));
	}

}
