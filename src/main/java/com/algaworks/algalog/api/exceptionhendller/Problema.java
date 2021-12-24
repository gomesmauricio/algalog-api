package com.algaworks.algalog.api.exceptionhendller;

import java.time.OffsetDateTime;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import lombok.Data;

@JsonInclude(Include.NON_NULL)//-> para quando a alguma propriedade estiver nula, não inprime na representação
@Data
public class Problema {

	private Integer status;
	private OffsetDateTime dataHora;
	private String titulo;

	private List<Campo> campos;
	
//	@AllArgsConstructor
//	@Getter
//	public static class Campo {
//		private String nome;
//		private String mensagem;
//
//	}
}