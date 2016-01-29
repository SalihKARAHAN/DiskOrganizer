package org.discorganizer.data.repository;

import org.discorganizer.data.contract.IConnector;

public class BaseRepository {
	private final IConnector _connector;
	
	public BaseRepository(IConnector connector) {
		_connector = connector;
	}
}
