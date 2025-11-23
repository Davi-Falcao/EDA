# 00 – Selection Sort Recursivo

Este diretório contém a versão **recursiva** do algoritmo **Selection Sort** implementada em Java.

Arquivo principal:

- `Solucao.java`

O programa lê o vetor de inteiros, chama uma função recursiva de Selection Sort e imprime o vetor ordenado.

---

## 🎯 Objetivo do exercício

- Praticar **recursão** reescrevendo um algoritmo clássico.
- Perceber que a lógica do Selection Sort se adapta bem a uma formulação recursiva.
- Relacionar a versão recursiva à versão iterativa tradicional.

---

## 🧠 Ideia do algoritmo usado em `Solucao.java`

Fluxo geral:

1. **Ler** o vetor.
2. Chamar uma função `selectionSortRec(vetor, inicio)`:
   - **Caso base:** se `inicio` chegou no fim (ou penúltimo índice), o vetor está ordenado.
   - **Passo recursivo:**
     - Procura o índice do **menor elemento** no intervalo `[inicio, fim]`.
     - Troca o elemento em `inicio` com o elemento de índice mínimo.
     - Chama recursivamente `selectionSortRec(vetor, inicio + 1)`.
3. Ao fim das chamadas recursivas, o vetor está ordenado.
4. O programa **imprime** o vetor ordenado.

---

## 📊 Complexidade

- **Tempo:** `O(n²)`, como a implementação iterativa.
- **Espaço adicional:** `O(n)`, por causa da pilha de recursão.

---