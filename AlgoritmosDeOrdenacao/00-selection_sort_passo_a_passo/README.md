# 00 – Selection Sort Passo a Passo

Este diretório contém a implementação do **Selection Sort** em Java, com foco em mostrar o funcionamento **passo a passo** do algoritmo.

Arquivo principal:

- `Solucao.java`

O programa lê o vetor de inteiros da entrada, aplica Selection Sort e, dependendo do enunciado, pode **imprimir o estado do vetor a cada iteração**, além do resultado final.

---

## 🎯 Objetivo do exercício

- Entender de forma **visual** como o Selection Sort atua no vetor.
- Mostrar:
  - qual índice está sendo fixado em cada passo;
  - qual elemento é escolhido como **mínimo**;
  - quais trocas são realizadas.

---

## 🧠 Ideia do algoritmo usado em `Solucao.java`

Em linhas gerais:

1. **Ler** o vetor.
2. Para cada posição `i` do vetor:
   - Assume que o menor elemento está em `i`.
   - Percorre o subvetor de `i+1` até o final, procurando o menor valor.
   - Troca o elemento em `i` com o menor encontrado.
   - (Opcional, dependendo do exercício) **Imprime o vetor** após essa troca.
3. Ao final, o vetor está ordenado e o programa **imprime** o resultado.

---

## 📊 Complexidade

- **Tempo:** `O(n²)` em qualquer caso.
- **Espaço:** `O(1)`, pois o algoritmo é in-place.

---
