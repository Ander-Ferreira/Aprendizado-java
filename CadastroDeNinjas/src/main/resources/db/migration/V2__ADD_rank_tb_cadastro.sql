--Exemplo de versionamento de banco de dados com o flyway
--Este arquivo é imútavel, para adicionar uma nova tabela e criar uma nova versão do banco de dados
--Deve-se criar um novo arquivo, exemplo: V3__ADD__NOVA_COLUNA_TB_CADASTRO.sql


ALTER TABLE tb_cadastro
ADD COLUMN rank VARCHAR(255);
