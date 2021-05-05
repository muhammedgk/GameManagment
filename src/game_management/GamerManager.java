package game_management;

import java.rmi.RemoteException;

import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class GamerManager implements GamerService {

	@Override
	public void add(Gamer gamer) throws NumberFormatException, RemoteException {
		
		KPSPublicSoapProxy kpsPublic = new KPSPublicSoapProxy();
	    
	    boolean result =kpsPublic.TCKimlikNoDogrula(Long.parseLong(gamer.getNationalatyId()),gamer.getFirstName() ,gamer.getLastName(), gamer.getBirthofDay());
	    
	    if( result == true) {
	    	System.out.println("Do�rulama Ba�ar�l� : "+gamer.getFirstName() );
	    	System.out.println("Tebrikler Sisteme Kay�t oldunuz : "+gamer.getFirstName());
	    	
	    }else {
	    	System.out.println("Do�rulama Ba�ar�s�z : "+gamer.getFirstName() );
	    	System.out.println("Tekrar Deneyiniz : "+gamer.getFirstName());
	    }
	
		
		
	
	}

	@Override
	public void delete(Gamer gamer) {
		System.out.println("Say�n "+gamer.getFirstName()+" Sistemden kayd�n�z silindi.");
		
	}

	@Override
	public void update(Gamer gamer) {
		System.out.println("Say�n "+gamer.getFirstName()+" Hesab�n�z G�ncellendi.");
		
	}

	
		
	}

