package negocio;

import static org.junit.Assert.assertThat;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class GerenciadoraClientesTest_Ex1 {

	@Test
	public void testPesquisaCliente() {
		
		//Criando cliente para testar.
		Cliente cliente01 = new Cliente(1, "Gustavo Farias", 31, "gugafarias@gmail.com", 1, true);
		Cliente cliente02 = new Cliente(2, "Felipe Augusto", 34, "felipeaugusto@gmail.com", 1, true);
		
		//INSERIR NA LISTA
		
		List<Cliente> clientesDoBanco = new ArrayList();
		clientesDoBanco.add(cliente01);
		clientesDoBanco.add(cliente02);
		
		GerenciadoraClientes gerClientes = new GerenciadoraClientes(clientesDoBanco);
		
		Cliente clientes = gerClientes.pesquisaCliente(1);
		
		assertThat(clientes.getId(), is (1));
		assertThat(clientes.getEmail(), is ("gugafarias@gmail.com"));
		
		
	}

}
