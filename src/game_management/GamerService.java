package game_management;

import java.rmi.RemoteException;

public interface GamerService {
	void add(Gamer gamer) throws NumberFormatException, RemoteException;
	void delete(Gamer gamer);
	void update(Gamer gamer);
	
}
