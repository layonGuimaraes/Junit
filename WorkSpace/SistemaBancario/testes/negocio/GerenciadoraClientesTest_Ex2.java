package negocio;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class GerenciadoraClientesTest_Ex2 {

	private GerenciadoraClientes gerClientes;
	int idCliente01 = 1;
	int idCliente02 = 2;

	
	@Test
	public void testPesquisaCliente() {

		/*=====Criando o cenário=====*/
		// criando alguns clientes
		Cliente cliente01 = new Cliente(idCliente01, "Gustavo Farias", 31, "gugafarias@gmail.com", 1, true);
		Cliente cliente02 = new Cliente(idCliente02, "Felipe Augusto", 34, "felipeaugusto@gmail.com", 2, true);
		
		// inserindo os clientes criados na lista de clientes do banco
		List<Cliente> clientesDoBanco = new ArrayList<>();
		clientesDoBanco.add(cliente01);
		clientesDoBanco.add(cliente02);
		
		gerClientes = new GerenciadoraClientes(clientesDoBanco);
		
		Cliente cliente = gerClientes.pesquisaCliente(idCliente01);
		
		assertThat(cliente.getId(), is(idCliente01));
		
	}
	
	@Test
	public void testRemoverCliente() {
		
		Cliente cliente01 = new Cliente(idCliente01, "Gustavo Farias", 31, "gugafarias@gmail.com", 1, true);
		Cliente cliente02 = new Cliente(idCliente02, "Felipe Augusto", 34, "felipeaugusto@gmail.com", 2, true);
		
		List<Cliente> clientesDoBanco= new ArrayList();
		clientesDoBanco.add(cliente01);
		clientesDoBanco.add(cliente02);
		
		gerClientes = new GerenciadoraClientes(clientesDoBanco);
		
		boolean removeCliente = gerClientes.removeCliente(idCliente02);
		
		assertThat(removeCliente, is (true));
		assertThat(gerClientes.getClientesDoBanco().size(), is (1));
		assertNull(gerClientes.pesquisaCliente(idCliente02));
		
		
	}
	

}
