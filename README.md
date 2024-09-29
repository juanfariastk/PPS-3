# Padrões de Projeto de Software - PPS

Este repositório contém exemplos de alguns dos principais padrões de projeto, segundo o que pude entender e exemplificar. Serve de resumo para a 3º Prova de PPS.

## Índice sobre os padrões neste repositório

  - [Índice sobre os padrões neste repositório](#índice-sobre-os-padrões-neste-repositório)
  - [Padrão Singleton](#padrão-singleton)
    - [Problema Singleton](#problema-singleton)
    - [Solução Singleton](#solução-singleton)
  - [Padrão Chain of Responsibility](#padrão-chain-of-responsibility)
    - [Problema Chain of Responsibility](#problema-chain-of-responsibility)
    - [Solução Chain of Responsibility](#solução-chain-of-responsibility)
  - [Padrão Prototype](#padrão-prototype)
    - [Problema Prototype](#problema-prototype)
    - [Solução Prototype](#solução-prototype)
  - [Padrão Visitor](#padrão-visitor)
    - [Problema Visitor](#problema-visitor)
    - [Solução Visitor](#solução-visitor)
  - [Padrão Decorator](#padrão-decorator)
    - [Problema Decorator](#problema-decorator)
    - [Solução Decorator](#solução-decorator)

---

## Padrão Singleton

### Problema Singleton

O **Singleton** é utilizado para garantir que uma classe tenha apenas uma única instância e forneça um ponto de acesso global a ela. Isso é útil quando você precisa controlar o acesso a um recurso compartilhado em todo o sistema, como um logger ou gerenciador de conexão de banco de dados.

### Solução Singleton

A solução é tornar o construtor da classe privado e fornecer um método estático que retorna a única instância da classe. Essa instância é criada de forma preguiçosa (lazy initialization) na primeira vez que o método é chamado.

---

## Padrão Chain of Responsibility

### Problema Chain of Responsibility

O **Chain of Responsibility** é útil quando há várias entidades que podem manipular uma solicitação, mas você não sabe de antemão qual delas o fará. O padrão desacopla o remetente da solicitação de seus receptores, permitindo que múltiplos handlers processem a solicitação de maneira flexível.

### Solução Chain of Responsibility

Cada handler tem a capacidade de processar a solicitação ou passá-la para o próximo handler na cadeia. Isso permite que a responsabilidade seja delegada dinamicamente para o próximo handler apropriado.

---

## Padrão Prototype

### Problema Prototype

O **Prototype** é utilizado quando a criação de novos objetos é cara em termos de tempo ou recursos, e você deseja criar novos objetos copiando outros existentes. Este padrão evita a criação de objetos do zero e permite a criação de objetos com base em um protótipo previamente definido.

### Solução Prototype

A solução envolve a implementação de uma interface que define um método `clone` para copiar o objeto. Cada classe concreta que implementa essa interface deve definir como a cópia será feita, seja ela uma cópia superficial ou profunda.

---

## Padrão Visitor

### Problema Visitor

O **Visitor** é utilizado quando você precisa realizar operações sobre uma estrutura de objetos que possuem diferentes classes e tipos. Normalmente, você deseja evitar o uso de `instanceof` ou longas cadeias de `if-else` ao processar esses objetos.

### Solução Visitor

A solução envolve a criação de uma interface Visitor com métodos para cada tipo de classe de objeto. Cada classe de elemento na estrutura aceita o visitante, permitindo que ele execute a operação apropriada sem modificar as classes dos elementos.

---

## Padrão Decorator

### Problema Decorator

O **Decorator** é utilizado quando você deseja adicionar comportamentos ou responsabilidades a objetos de forma dinâmica, sem modificar suas classes originais. Isso é útil quando você deseja evitar o uso de subclasses para cada nova funcionalidade ou combinação de funcionalidades.

### Solução Decorator

A solução envolve a criação de uma classe decoradora que "envolve" o objeto original e adiciona funcionalidades antes ou depois das chamadas para os métodos do objeto decorado. Isso permite que você combine diferentes comportamentos em tempo de execução, sem a necessidade de modificar o código existente.
