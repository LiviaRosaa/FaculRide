Esta pasta contém os arquivos relacionados ao banco de dados do projeto FaculRide.

Arquivos:

* faculride_backup.sql → Backup completo do banco de dados PostgreSQL utilizado durante o desenvolvimento do sistema.

Para restaurar o banco de dados:

1. Crie um banco chamado "faculride" no PostgreSQL.
2. Execute o arquivo faculride_backup.sql utilizando o pgAdmin ou o PostgreSQL.
3. Configure as credenciais do banco na classe ConnectionFactory.
4. Execute o projeto normalmente.

O backup contém a estrutura das tabelas e os dados utilizados durante o desenvolvimento.

