package fr.simpleblog.domainService;

public interface Iservice<X> {

	public X create(X x);

	public X read(Class<?> clazz, int id);

	public X update(X x);

	public boolean delete(X x);
}