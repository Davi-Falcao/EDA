# 02 – Insere Ordenado (Último Elemento)

Este diretório contém a solução de um exercício clássico de **inserção em vetor ordenado**:  
dado um vetor em que **todos os elementos, exceto o último, já estão em ordem crescente**, o programa deve **inserir o último elemento na posição correta**, mantendo o vetor ordenado.

Arquivo principal:

- `Solucao.java`

---

## 🎯 Objetivo do exercício

- Simular **apenas um passo** do Insertion Sort: a inserção do **último elemento** em um prefixo já ordenado.
- Praticar:
  - deslocamento de elementos no vetor;
  - raciocínio sobre laços que caminham de trás para frente;
  - manutenção da ordenação sem reordenar tudo do zero.

---

## 🧠 Comportamento esperado de `Solucao.java`

Em alto nível, o programa faz algo do tipo:

1. **Lê** da entrada padrão um conjunto de inteiros (no formato definido pelo enunciado da disciplina).
2. Considera que os elementos nas posições `0` até `n-2` já estão **ordenados em ordem crescente**, e que apenas o elemento na posição `n-1` é o “novo” valor a ser inserido.
3. Guarda o **último elemento** em uma variável auxiliar, por exemplo `valor`.
4. Percorre o vetor **de trás para frente**, deslocando para a direita todos os elementos que forem **maiores que `valor`**.
5. Quando encontra a posição correta, **coloca `valor`** ali.
6. **Imprime** o vetor resultante, já totalmente ordenado.

Esse é exatamente o passo que o Insertion Sort executaria ao inserir o último elemento.

---

## 📊 Complexidade

- **Tempo:** `O(n)` no pior caso (quando o último elemento é o menor e todo mundo precisa ser deslocado).
- **Espaço adicional:** `O(1)`, pois apenas uma variável auxiliar é usada.

---

## 📌 Observações

- Este exercício é focado em **entender o mecanismo de inserção** em um vetor ordenado, não em ordenar o vetor inteiro do zero.
- A lógica costuma ser muito parecida com a última iteração de um Insertion Sort tradicional.
