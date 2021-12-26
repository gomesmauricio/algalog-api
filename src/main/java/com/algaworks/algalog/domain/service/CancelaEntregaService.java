package com.algaworks.algalog.domain.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.algaworks.algalog.domain.model.Entrega;
import com.algaworks.algalog.domain.repository.EntregaRepository;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@Service
public class CancelaEntregaService {

private EntregaRepository entregaRepository;
	
	private BuscaEntregaService buscaEntregaService;
					
	@Transactional
	public void cancelar(Long entregaId) {
		Entrega entrega = buscaEntregaService.buscar(entregaId);
		
		entrega.cancelar();
		
		entregaRepository.save(entrega);
	}

}
