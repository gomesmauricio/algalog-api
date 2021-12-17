INSERT INTO cliente (nome, email, fone) VALUES ('Lampião do Sertão', 'hobimHodnordeste@gmail.com', '(87)9 3757-9540');
INSERT INTO cliente (nome, email, fone) VALUES ('Tieta do Agreste', 'tieta@gmail.com', '(87)9 9557-9548');

INSERT INTO entrega (cliente_id, destinatario_nome, destinatario_logradouro, destinatario_numero, destinatario_bairro, destinatario_complemento, status, data_pedido, data_finalizacao, taxa ) VALUES (1, 'Severina Batista', 'Rua do vai e vem', '100', 'Centro' , 'Apto 201', 'PENDENTE', now(), null,  25.50 ); 