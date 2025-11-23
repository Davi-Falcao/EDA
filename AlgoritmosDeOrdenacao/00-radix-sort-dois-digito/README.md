# 00 – Implementando Radix Sort

Este diretório contém a implementação do **Radix Sort** em Java.

Arquivo principal:

- `Solucao.java`

O programa lê uma sequência de números inteiros da **entrada padrão**, ordena usando Radix Sort e imprime o resultado na **saída padrão**.

---

## 🎯 Objetivo do exercício

- Implementar o **Radix Sort** processando os números **dígito a dígito**.
- Usar um algoritmo de ordenação **estável** (como Counting Sort) como sub-rotina para cada casa decimal.
- Entender como combinar Radix + Counting Sort.

---

## 🧠 Ideia do algoritmo usado em `Solucao.java`

De forma geral, o programa:

1. **Lê** o vetor de inteiros.
2. Descobre o **maior número** do vetor para saber quantos dígitos precisam ser processados.
3. Para cada dígito (unidades, dezenas, centenas, ...):
   - Chama uma função auxiliar que ordena os elementos com base **apenas naquele dígito**.
   - Essa função costuma usar uma variação de **Counting Sort estável**.
4. Ao final de todas as passagens, o vetor está totalmente ordenado.
5. O programa então **imprime** o vetor ordenado.

---

## 📊 Complexidade

- **Tempo:** `O(d · (n + k))`, onde:
  - `d` = número de dígitos
  - `n` = tamanho do vetor
  - `k` = base (ex.: 10, se decimal)
- **Espaço:** `O(n + k)`, por causa dos vetores auxiliares.

---