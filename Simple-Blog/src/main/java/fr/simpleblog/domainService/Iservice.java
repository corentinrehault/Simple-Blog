package fr.simpleblog.domainService;

public interface Iservice<X> {

	public X create(X x);

	public X read(X x);

	public X update(X x);

	public boolean delete(X x);
}