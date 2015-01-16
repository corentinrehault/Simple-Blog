package fr.simpleblog.model.DAOSql;

public interface IDAOCRUD<X> {

	public void create();

	public void read();

	public void update();

	public void delete();
}