/**
 * 
 */
package org.diskmanager.library.ioc;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import javax.swing.event.TreeSelectionListener;

/**
 * @author Salih.KARAHAN
 *
 */
public final class Container {
	private static final Map<String, Class<?>> _map = new HashMap<String, Class<?>>();

	/**
	 * 
	 * @param resolvedType
	 * @return
	 * @throws InstantiationException
	 * @throws IllegalAccessException
	 */
	public static <TResolvedType> TResolvedType Resolve(Class<TResolvedType> resolvedType)
			throws InstantiationException, IllegalAccessException {
		return (TResolvedType) _map.get(resolvedType.getName()).newInstance();
	}

	/**
	 * 
	 * @param abstractType
	 * @param concreteType
	 */
	public static <TAbstractType, TExtendedConcreteType extends TAbstractType> void Register(
			Class<TAbstractType> abstractType, Class<TExtendedConcreteType> concreteType) {
		_map.put(abstractType.getName(), concreteType);
	}
}
