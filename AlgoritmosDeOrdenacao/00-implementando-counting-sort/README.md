<div align="justify">

# 00 – Implementando Counting Sort

Este diretório contém a solução do exercício em que é pedido para implementar o algoritmo **Counting Sort** em Java.


O **arquivo principal** é:

- `Solucao.java`
  
O programa lê os dados da **entrada padrão**, aplica o algoritmo de ordenação e escreve o resultado na **saída padrão**.

---

## 🎯 Objetivo do exercício

- Implementar o **Counting Sort** “na mão”, sem usar bibliotecas de ordenação prontas.
- Praticar a ideia de **contar frequências** dos valores para ordená-los.
- Entender como funciona uma ordenação **não baseada em comparação**.

---

## 🧠 Ideia do algoritmo usado em `Solucao.java`

De forma geral, o programa:

1. **Lê** um conjunto de inteiros (normalmente um vetor).
2. Determina o intervalo de valores (valor mínimo e máximo, ou apenas o máximo).
3. Cria um vetor auxiliar de contagem, onde cada posição representa um possível valor.
4. **Conta** quantas vezes cada valor aparece.
5. Constrói o vetor ordenado a partir dessas contagens.
6. **Imprime** o vetor já em ordem na saída padrão, no formato esperado pelo problema.

---

## 📊 Complexidade

- **Tempo:** `O(n + k)`  
  onde `n` é o tamanho do vetor e `k` é o intervalo de valores possíveis.
- **Espaço:** `O(n + k)`, por causa do vetor de contagem e do vetor de saída.

---

</div>