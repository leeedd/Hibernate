package br.com.db1.start;

import org.junit.Test;

import br.com.db1.start.classes.Cidade;
import br.com.db1.start.classes.Endereco;
import br.com.db1.start.tipos.TipoLogradouro;
import br.com.db1.start.tipos.UF;

public class EnderecoTest {
	
	@Test
	public void insertTest(){
		
		Cidade cidade = new Cidade();
		cidade.setNome("Maringa");
		cidade.setUf(UF.PR);
		
		Endereco endereco = new Endereco();
		endereco.setTipoLogradouro(TipoLogradouro.AVENIDA);
		
		
		
		
	}

}
