# 00 – Insertion Sort Recursivo

Este diretório contém a implementação do **Insertion Sort** na sua versão **recursiva** em Java.

Arquivo principal:

- `Solucao.java`

O programa lê os dados de entrada, ordena o vetor com Insertion Sort recursivo e imprime o resultado na saída padrão.

---

## 🎯 Objetivo do exercício

- Reescrever o **Insertion Sort** usando **recursão** em vez de laços `for`/`while`.
- Fixar o conceito de **caso base** e **passo recursivo**.
- Relacionar a versão recursiva com a versão iterativa clássica de Insertion Sort.

---

## 🧠 Ideia do algoritmo usado em `Solucao.java`

Fluxo típico:

1. **Ler** o vetor.
2. Chamar uma função recursiva, por exemplo `insertionSortRec(vetor, n)`:
   - **Caso base:** se `n <= 1`, o vetor (ou prefixo) já está ordenado.
   - **Passo recursivo:**
     - Ordena recursivamente os primeiros `n-1` elementos.
     - Insere o elemento na posição `n-1` na posição correta entre os anteriores, deslocando os maiores uma posição à frente.
3. Ao final da recursão, o vetor está ordenado.
4. O programa **imprime** o vetor ordenado.

---

## 📊 Complexidade

- **Tempo:** `O(n²)`, como o Insertion Sort tradicional.
- **Espaço adicional:** `O(n)`, devido à pilha de recursão.

---
