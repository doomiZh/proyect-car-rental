package cibertec.proyecto.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cibertec.proyecto.models.Cliente;
import cibertec.proyecto.repositories.ClientRepository;
/**
 * 
 * @author grupo 4
 *
 */
@Service
public class ClientService {

	/**
	 * clientRepository
	 */
	@Autowired
	private ClientRepository clientRepository;
	

	/**
	 * getClients
	 * @return
	 */
	public List<Cliente> getClients()
	{
		
		return clientRepository.findAll();
	}
	
	/**
	 * getCount
	 * @return
	 */
	public long getCount()
	{
		return clientRepository.count();
	}

	/**
	 * save
	 * @param client
	 * @return 
	 */
	public Cliente save(Cliente client)
	{
		return clientRepository.save(client);
	}

    /**
     * findById
     * @param id
     * @return
     */
	public Optional<Cliente> findById(int id) {
		return clientRepository.findById(id);
	}

	/**
	 * delete
	 * @param id
	 */
	public void deleteById(int id) {
		clientRepository.deleteById(id);
	}

}
