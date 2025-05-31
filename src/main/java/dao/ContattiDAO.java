package dao;
import model.Contatto;
import java.util.List;
public interface ContattiDAO {
	public void addContatto(Contatto c);
	public List<Contatto> getContatti();
}
