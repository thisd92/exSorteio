# Gerador de Números

Este é um projeto Java que gera números aleatórios. O objetivo é fornecer uma ferramenta simples para sorteios anotando o palpite de cada participante e mostrando o intervalo.

## Funcionalidades

- Gera números aleatórios.
- Cadastra palpite de cada participante junto de seu nome.
- Permite a alteração do palpite de um participante específico.
- Gera de múltiplos números aleatórios individualmente.
- Mostra vencedor e intervalo de números dos participantes.

## Estrutura do Projeto

A estrutura do projeto é a seguinte:
Classe utilitária com métodos auxiliares
Classe que contém o método `main` e serve como ponto de entrada para a aplicação
Classe principal que contém a lógica para geração de números aleatórios

- `Interface.java`: Responsável pela interface gráfica da aplicação, contendo componentes gráficos e permite o cadastro de palpites.
- `Palpites.java`: Representa o modelo para exibir os palpites e a lista de participantes.
- `Pessoa.java`: Contém os atributos das pessoas registradas e seus palpites.
- `Resultados.java`: Janela onde é exibido os resultados do sorteio e o vencedor.
- `Sorteio.java`: Gerencia o sorteio, armazenando o número sorteado e permite o cadastro dos novos participantes, atualiza palpites e determina o vencedor deste sorteio.

## Requisitos

- Java 18 ou superior

## Como Executar

1. Clone o repositório.
2. Execute "Interface.java" no NetBeans.
