# 00 – Implementando Quick Sort

Este diretório contém a implementação do **Quick Sort** em Java para um exercício da disciplina de EDA.

Arquivo principal:

- `Solucao.java`

O programa lê o vetor de inteiros da **entrada padrão**, aplica o Quick Sort e imprime o vetor ordenado na **saída padrão**.

---

## 🎯 Objetivo do exercício

- Implementar o **Quick Sort** com partição em torno de um **pivô**.
- Praticar a escrita de funções recursivas que manipulam índices.
- Visualizar o processo de “dividir” o vetor em partes menores.

---

## 🧠 Ideia do algoritmo usado em `Solucao.java`

O fluxo típico é:

1. **Ler** o vetor de entrada.
2. Chamar uma função `quickSort(vetor, inicio, fim)` que:
   - Escolhe um **pivô** (em geral, o último elemento, o primeiro ou o elemento central).
   - Chama uma função de **partição**:
     - Reorganiza o vetor de forma que:
       - elementos menores que o pivô fiquem à esquerda;
       - elementos maiores que o pivô fiquem à direita.
     - Retorna a posição final do pivô.
   - Chama recursivamente o próprio Quick Sort para:
     - a parte à esquerda do pivô;
     - a parte à direita do pivô.
3. Ao final, o vetor está ordenado, e o programa o **imprime**.

---

## 📊 Complexidade

- **Tempo médio:** `O(n log n)`
- **Pior caso:** `O(n²)`, se o pivô sempre for escolhido de forma ruim (por exemplo, vetor já ordenado e pivô ruim).
- **Espaço:** `O(log n)` em média, pela pilha de recursão.

---

