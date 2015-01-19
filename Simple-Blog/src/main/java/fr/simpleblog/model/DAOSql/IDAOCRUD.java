package fr.simpleblog.model.DAOSql;

public interface IDAOCRUD<X> {

	public X create();

	public X read();

	public X update();

	public X delete();
}