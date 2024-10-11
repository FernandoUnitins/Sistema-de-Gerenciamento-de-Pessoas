# Sistema de Gerenciamento de Pessoas

## Descrição do Sistema

Este é um sistema simples de gerenciamento de pessoas implementado em Java. O sistema permite o cadastro, consulta e atualização dos dados de até duas pessoas. Ele foi desenvolvido com o objetivo de praticar os conceitos de Programação Orientada a Objetos (POO), em especial o encapsulamento, através do uso de getters e setters.

## Instruções de Compilação e Execução

## Pré-requisitos:

- Java Development Kit (JDK) 8 ou superior.
- Um editor de código como o Visual Studio Code (VS Code) com o Java Extension Pack instalado.

## Compilação:

1. Clone o repositório para o seu ambiente local:
   git clone https://github.com/FernandoUnitins/Sistema-de-Gerenciamento-de-Pessoas.git

## Exemplo de uso:

Ao executar o sistema, ele irá cadastrar duas pessoas e, em seguida, atualizar os dados da primeira pessoa. Veja abaixo um exemplo da saída esperada:

Informações iniciais:  
Pessoa 1:  
Nome: João Silva  
CPF: 123.456.789-00  
Idade: 30  

Pessoa 2:  
Nome: Maria Souza  
CPF: 987.654.321-00  
Idade: 25  

**Informações após atualização:**  
Pessoa 1:  
Nome: João Silva Jr.  
CPF: 123.456.789-00  
Idade: 31  

Pessoa 2:  
Nome: Maria Souza  
CPF: 987.654.321-00  
Idade: 25  

## Como a lógica de encapsulamento foi aplicada no sistema:

A lógica de encapsulamento foi aplicada no sistema através da classe Pessoa. Os atributos da classe (nome, cpf, e idade) foram declarados como private, o que impede o acesso direto a eles por outras classes.

Para manipular esses atributos, foram implementados métodos get e set, que fornecem um meio controlado de acessar e modificar os dados. Isso permite que as regras de negócio sejam mantidas (por exemplo, validações podem ser adicionadas nos setters), e garante a proteção dos dados contra manipulações indevidas.

A classe GerenciadorDePessoas utiliza esses métodos encapsulados para cadastrar, atualizar e exibir as informações de cada pessoa, demonstrando uma boa prática de programação orientada a objetos.
