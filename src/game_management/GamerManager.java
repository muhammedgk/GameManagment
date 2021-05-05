package game_management;

import java.rmi.RemoteException;

import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class GamerManager implements GamerService {

	@Override
	public void add(Gamer gamer) throws NumberFormatException, RemoteException {
		
		KPSPublicSoapProxy kpsPublic = new KPSPublicSoapProxy();
	    
	    boolean result =kpsPublic.TCKimlikNoDogrula(Long.parseLong(gamer.getNationalatyId()),gamer.getFirstName() ,gamer.getLastName(), gamer.getBirthofDay());
	    
	    if( result == true) {
	    	System.out.println("Doðrulama Baþarýlý : "+gamer.getFirstName() );
	    	System.out.println("Tebrikler Sisteme Kayýt oldunuz : "+gamer.getFirstName());
	    	
	    }else {
	    	System.out.println("Doðrulama Baþarýsýz : "+gamer.getFirstName() );
	    	System.out.println("Tekrar Deneyiniz : "+gamer.getFirstName());
	    }
	
		
		
	
	}

	@Override
	public void delete(Gamer gamer) {
		System.out.println("Sayýn "+gamer.getFirstName()+" Sistemden kaydýnýz silindi.");
		
	}

	@Override
	public void update(Gamer gamer) {
		System.out.println("Sayýn "+gamer.getFirstName()+" Hesabýnýz Güncellendi.");
		
	}

	
		
	}

