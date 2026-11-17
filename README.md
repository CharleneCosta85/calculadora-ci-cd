# Calculadora CI/CD

Projeto desenvolvido para a disciplina **Abordagem DevOps e Entregas Contínuas**, com o objetivo de demonstrar a utilização de um pipeline de **CI/CD com GitHub Actions**.

## 📌 Objetivo

Desenvolver uma aplicação Java simples e configurar um pipeline automatizado que:

- Execute os testes automaticamente;
- Execute o build da aplicação;
- Valide Pull Requests para a branch `main`;
- Impessa a integração quando os testes falharem;
- Execute a entrega automaticamente após o merge na `main`;
- Gere uma **GitHub Release** contendo o arquivo `.jar`.

## 🛠️ Tecnologias utilizadas

- Java 25
- Maven
- JUnit 5
- Git
- GitHub
- GitHub Actions
- GitHub Releases
- IntelliJ IDEA

## 🧮 Funcionalidades

A aplicação possui uma classe `Calculadora` com as seguintes operações:

- Soma
- Subtração
- Multiplicação
- Divisão
- Validação de divisão por zero

## 🧪 Testes automatizados

Foram implementados testes utilizando **JUnit 5** para verificar:

1. Soma de dois números;
2. Subtração de dois números;
3. Multiplicação de dois números;
4. Impedimento de divisão por zero.

Para executar os testes localmente:

```bash
mvn clean test
```

## 📦 Gerar o projeto

Para gerar o arquivo `.jar`:

```bash
mvn clean package
```

O arquivo será gerado na pasta:

```text
target/
```

## 🔄 Pipeline CI/CD

O projeto utiliza o **GitHub Actions** por meio do arquivo:

```text
.github/workflows/ci-cd.yml
```

### Pull Request

Quando um Pull Request é aberto ou atualizado para a branch `main`, o pipeline:

1. Baixa o código;
2. Configura o Java;
3. Executa os testes;
4. Gera o arquivo `.jar`;
5. Salva o `.jar` como artefato.

Se os testes falharem, o Pull Request não pode ser integrado à `main`.

### Merge na main

Após o Pull Request ser aprovado e mesclado na `main`, o pipeline é executado novamente.

Nesse momento:

1. Os testes são executados;
2. O projeto é empacotado;
3. O arquivo `.jar` é gerado;
4. Uma nova **GitHub Release** é criada automaticamente;
5. O arquivo `.jar` é anexado à Release.

## 🌿 Fluxo utilizado

```text
Desenvolvimento
      ↓
Feature Branch
      ↓
Pull Request
      ↓
GitHub Actions
      ↓
Testes + Build
      ↓
Aprovado?
   ↙       ↘
 Não       Sim
 ↓          ↓
Corrigir   Merge
            ↓
          main
            ↓
       GitHub Actions
            ↓
        GitHub Release
            ↓
           .jar
```

## 🔐 Proteção da branch main

A branch `main` possui regras de proteção configuradas para exigir:

- Pull Request antes do merge;
- Aprovação das verificações de status;
- Pipeline aprovado para permitir a integração.

## 🚀 Releases

As versões da aplicação são publicadas automaticamente pelo pipeline utilizando **GitHub Releases**.

A versão mais recente do projeto é disponibilizada na seção **Releases** do repositório.

## 👩‍💻 Autora

**Charlene Costa**

Projeto acadêmico — Análise e Desenvolvimento de Sistemas.
