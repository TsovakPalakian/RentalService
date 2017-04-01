package by.htp.rentalservice.logic;

import java.util.AbstractMap;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;

import by.htp.rentalservice.entity.Client;
import by.htp.rentalservice.entity.RentUnit;

public class HashMap extends AbstractMap<Client, RentUnit> implements Map<Client, RentUnit> {

	@Override
	public void forEach(BiConsumer<? super Client, ? super RentUnit> action) {
		// TODO Auto-generated method stub
		super.forEach(action);
	}

	@Override
	public RentUnit replace(Client key, RentUnit value) {
		// TODO Auto-generated method stub
		return super.replace(key, value);
	}

	@Override
	public boolean containsKey(Object arg0) {
		// TODO Auto-generated method stub
		return super.containsKey(arg0);
	}

	@Override
	public boolean containsValue(Object arg0) {
		// TODO Auto-generated method stub
		return super.containsValue(arg0);
	}

	@Override
	public Set<java.util.Map.Entry<Client, RentUnit>> entrySet() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean equals(Object arg0) {
		// TODO Auto-generated method stub
		return super.equals(arg0);
	}

	@Override
	public RentUnit get(Object arg0) {
		// TODO Auto-generated method stub
		return super.get(arg0);
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return super.isEmpty();
	}

	@Override
	public Set<Client> keySet() {
		// TODO Auto-generated method stub
		return super.keySet();
	}

	@Override
	public RentUnit put(Client arg0, RentUnit arg1) {
		// TODO Auto-generated method stub
		return super.put(arg0, arg1);
	}

	@Override
	public RentUnit remove(Object arg0) {
		// TODO Auto-generated method stub
		return super.remove(arg0);
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return super.size();
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}

	@Override
	public Collection<RentUnit> values() {
		// TODO Auto-generated method stub
		return super.values();
	}
	
	
	
}
