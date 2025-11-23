# 00 – Implementando Merge Sort

Este diretório contém a solução do exercício de implementação do **Merge Sort** em Java.

Arquivo principal:

- `Solucao.java`

O programa lê os dados da **entrada padrão**, aplica o Merge Sort e imprime o vetor ordenado na **saída padrão**.

---

## 🎯 Objetivo do exercício

- Implementar o **Merge Sort** usando **recursão**.
- Praticar o paradigma de **divisão e conquista**.
- Entender o papel da função de **merge**, que junta dois subvetores já ordenados.

---

## 🧠 Ideia do algoritmo usado em `Solucao.java`

Em termos gerais, o fluxo é:

1. **Ler** o vetor de inteiros da entrada.
2. Chamar uma função recursiva de Merge Sort que:
   - Divide o vetor em duas metades.
   - Ordena recursivamente a metade esquerda.
   - Ordena recursivamente a metade direita.
   - Usa uma função `merge` para **intercalar** as duas metades ordenadas em um vetor auxiliar.
3. Copiar o conteúdo ordenado de volta para o vetor original.
4. **Imprimir** o vetor ordenado.

---

## 📊 Complexidade

- **Tempo:** `O(n log n)` em qualquer caso.
- **Espaço:** `O(n)`, por causa dos vetores auxiliares usados no merge.

---
