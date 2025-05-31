package gui;
import java.awt.event.*;
import javax.swing.*;
import dao.ContattiDAOImplement;
import model.Contatto;
public class AddButtonListener implements ActionListener{
	private MainFrame parent;
	private JTextField[] fields;
	private ContattiDAOImplement dao;
	
	public AddButtonListener(MainFrame parent, JTextField[] fields) {
		this.parent = parent;
		this.fields = fields;
		dao = new ContattiDAOImplement();
	}
	public void actionPerformed(ActionEvent e) {
		String nome = fields[0].getText();
		String numero = fields[1].getText();
		String email = fields[2].getText();
		dao.addContatto(new Contatto(nome,numero,email));
		for (JTextField field : fields) {
		    field.setText("");
		}
		JOptionPane.showMessageDialog(parent, "Contatto aggiunto con successo\nnome: "+nome+" numero: "+numero+" email: "+email);
	}
}