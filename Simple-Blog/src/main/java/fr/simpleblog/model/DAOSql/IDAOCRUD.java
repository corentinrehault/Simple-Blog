package fr.simpleblog.model.DAOSql;

public interface IDAOCRUD<X> {

	public X create(X x);

	public X read(X x);

	public X update(X x);

	public X delete(X x);
}