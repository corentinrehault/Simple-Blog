package fr.simpleblog.model.interfaces;

public interface IDAOCRUD<X> {

	public X create(X x);

	public X read(X x);

	public X update(X x);

	public boolean delete(X x);
}